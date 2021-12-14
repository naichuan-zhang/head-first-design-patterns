package com.naichuan.data_bus;

import java.util.HashSet;
import java.util.Set;

/**
 * The data bus implementation, this implementation should be a Singleton.
 *
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public class DataBus {

    private static final DataBus instance = new DataBus();

    private final Set<Member> listeners = new HashSet<>();

    private DataBus() {}

    public static DataBus getInstance() {
        return instance;
    }

    public void subscribe(final Member member) {
        listeners.add(member);
    }

    public void unsubscribe(final Member member) {
        listeners.remove(member);
    }

    public void publish(final DataEvent event) {
        event.setDataBus(this);
        listeners.forEach(listener -> listener.accept(event));
    }
}
