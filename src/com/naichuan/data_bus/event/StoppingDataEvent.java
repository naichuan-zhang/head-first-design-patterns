package com.naichuan.data_bus.event;

import com.naichuan.data_bus.AbstractDataEvent;
import com.naichuan.data_bus.DataEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@RequiredArgsConstructor
@Getter
public class StoppingDataEvent extends AbstractDataEvent {

    private final LocalDateTime when;

    public static DataEvent of(final LocalDateTime when) {
        return new StartingDataEvent(when);
    }
}
