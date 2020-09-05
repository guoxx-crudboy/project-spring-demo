package com.guoxx.event;

import org.springframework.context.ApplicationEvent;

public class ListUpdateEvent extends ApplicationEvent {
    public ListUpdateEvent(Object source) {
        super(source);
    }
}
