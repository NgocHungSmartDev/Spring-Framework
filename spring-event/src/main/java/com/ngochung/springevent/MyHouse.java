package com.ngochung.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyHouse {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void rangDoorbellBy(String guestName) {
        applicationEventPublisher.publishEvent(new DoorBellEvent(this, guestName));
    }
}
