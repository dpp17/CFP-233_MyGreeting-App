package com.bridgelabz.AssignmentThree.services;

import com.bridgelabz.AssignmentThree.model.Messages;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class MessagesServices implements IMessagesServices{
    private static final String template = "Hello World";
    private final AtomicLong counter = new AtomicLong();
    @Override
    public Messages greetingMessages() {
        return new Messages(counter.incrementAndGet(),template);
    }
}
