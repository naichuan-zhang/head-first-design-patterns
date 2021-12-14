package com.naichuan.data_bus.event;

import com.naichuan.data_bus.AbstractDataEvent;
import com.naichuan.data_bus.DataEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@RequiredArgsConstructor
@Getter
public class MessageDataEvent extends AbstractDataEvent {

    private final String message;

    public static DataEvent of(final String message) {
        return new MessageDataEvent(message);
    }
}
