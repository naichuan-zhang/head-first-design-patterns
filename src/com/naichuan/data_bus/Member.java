package com.naichuan.data_bus;

import java.util.function.Consumer;

/**
 * Members receive events from the data bus.
 *
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public interface Member extends Consumer<DataEvent> {

    @Override
    void accept(DataEvent event);
}
