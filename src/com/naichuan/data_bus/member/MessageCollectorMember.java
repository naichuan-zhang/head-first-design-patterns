package com.naichuan.data_bus.member;

import com.naichuan.data_bus.DataEvent;
import com.naichuan.data_bus.Member;
import com.naichuan.data_bus.event.MessageDataEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@RequiredArgsConstructor
@Slf4j
public class MessageCollectorMember implements Member {

    private final String name;

    private final List<String> messages = new ArrayList<>();

    @Override
    public void accept(DataEvent event) {
        if (event instanceof MessageDataEvent) {
            handleEvent((MessageDataEvent) event);
        }
    }

    private void handleEvent(MessageDataEvent event) {
        log.info("{} sees message {}", name, event.getMessage());
        messages.add(event.getMessage());
    }

    public List<String> getMessages() {
        return Collections.unmodifiableList(messages);
    }
}
