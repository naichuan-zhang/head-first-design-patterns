package com.naichuan.data_bus;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public abstract class AbstractDataEvent implements DataEvent {

    private DataBus dataBus;

    @Override
    public void setDataBus(DataBus dataBus) {
        this.dataBus = dataBus;
    }

    @Override
    public DataBus getDataBus() {
        return this.dataBus;
    }
}
