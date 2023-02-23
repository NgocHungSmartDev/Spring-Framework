package com.ngochung.springevent;

import org.springframework.context.ApplicationEvent;

public class DoorBellEvent extends ApplicationEvent {

    private String name;

    public DoorBellEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public Object getGuestName() {
        return name;
    }
}
