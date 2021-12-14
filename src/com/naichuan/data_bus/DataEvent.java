package com.naichuan.data_bus;

/**
 * Events are sent from data bus.
 *
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public interface DataEvent {

    void setDataBus(DataBus dataBus);

    DataBus getDataBus();
}
