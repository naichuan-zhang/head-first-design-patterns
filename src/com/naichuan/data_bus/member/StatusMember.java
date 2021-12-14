package com.naichuan.data_bus.member;

import com.naichuan.data_bus.DataEvent;
import com.naichuan.data_bus.Member;
import com.naichuan.data_bus.event.MessageDataEvent;
import com.naichuan.data_bus.event.StartingDataEvent;
import com.naichuan.data_bus.event.StoppingDataEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@RequiredArgsConstructor
@Getter
@Slf4j
public class StatusMember implements Member {

    private final int id;

    private LocalDateTime started;
    private LocalDateTime stopped;

    @Override
    public void accept(DataEvent event) {
        if (event instanceof StartingDataEvent) {
            handleEvent((StartingDataEvent) event);
        } else if (event instanceof StoppingDataEvent) {
            handleEvent((StoppingDataEvent) event);
        }
    }

    private void handleEvent(StartingDataEvent event) {
        started = event.getWhen();
        log.info("Receiver {} sees application started at {}", id, started);
    }

    private void handleEvent(StoppingDataEvent event) {
        stopped = event.getWhen();
        log.info("Receiver {} sees application stopped at {}", id, stopped);
        event.getDataBus().publish(MessageDataEvent.of(String.format("Goodbye cruel world from #%d!", id)));
    }
}
