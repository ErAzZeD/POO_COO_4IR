package org.example.model.communication.server.httpEvents;

import org.example.model.conversation.Message;

public class NewMessageEvent extends HTTPEvent {

    private Message m;
    public NewMessageEvent(Message m) {
        this.m = m;
    }
}
