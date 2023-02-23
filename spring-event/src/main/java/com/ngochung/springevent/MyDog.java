package com.ngochung.springevent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyDog {

    @EventListener
    public void doorBellEventListener(DoorBellEvent doorBellEvent) throws InterruptedException {
        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName() + ": Cho sua");
        System.out.println(String.format("%s: Go go!! Có người tên là %s gõ cửa!!!", Thread.currentThread().getName(), doorBellEvent.getGuestName()));
    }
}
