package com.guoxx.event;

import org.springframework.context.event.EventListener;

public class BlockedListNotifier1 {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    public void processBlockedListEvent(BlockedListEvent event) {
        // notify appropriate parties via notificationAddress...
        System.out.println("--onApplicationEvent1--");
        System.out.println("notificationAddress:" + notificationAddress);

    }

    @EventListener
    public ListUpdateEvent handleBlockedListEvent(BlockedListEvent event) {
        // notify appropriate parties via notificationAddress and
        // then publish a ListUpdateEvent...
        return new ListUpdateEvent(this);
    }
}
