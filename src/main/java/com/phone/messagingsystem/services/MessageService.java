package com.phone.messagingsystem.services;

import com.phone.messagingsystem.entity.Message;
import com.phone.messagingsystem.repository.MessageRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Optional<Message> getById(long id) {
        return messageRepository.findById(id);
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
}
