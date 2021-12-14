package com.naichuan.data_bus;

import com.naichuan.data_bus.event.MessageDataEvent;
import com.naichuan.data_bus.event.StartingDataEvent;
import com.naichuan.data_bus.event.StoppingDataEvent;
import com.naichuan.data_bus.member.MessageCollectorMember;
import com.naichuan.data_bus.member.StatusMember;

import java.time.LocalDateTime;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public class App {

    public static void main(String[] args) {
        final DataBus bus = DataBus.getInstance();
        bus.subscribe(new StatusMember(1));
        bus.subscribe(new StatusMember(2));
        final Member foo = new MessageCollectorMember("Foo");
        final Member bar = new MessageCollectorMember("Bar");
        bus.subscribe(foo);
        bus.publish(StartingDataEvent.of(LocalDateTime.now()));
        bus.publish(MessageDataEvent.of("Only foo should see this"));
        bus.subscribe(bar);
        bus.publish(MessageDataEvent.of("Foo and Bar should see this"));
        bus.unsubscribe(foo);
        bus.publish(MessageDataEvent.of("Only Bar should see this"));
        bus.publish(StoppingDataEvent.of(LocalDateTime.now()));
    }
}
