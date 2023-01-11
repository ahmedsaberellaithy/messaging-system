package com.phone.messagingsystem.controllers;

import com.phone.messagingsystem.dtos.MessageDto;
import com.phone.messagingsystem.entity.Message;
import com.phone.messagingsystem.mappers.MessagesMappers;
import com.phone.messagingsystem.services.MessageService;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("message")
@Slf4j
@AllArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping(":id")
    public MessageDto getById(long id){
        Optional<Message> message = messageService.getById(id);
        if(message.isEmpty()){
            throw new EntityNotFoundException();
        }
        return MessagesMappers.toDto(message.get());
    }

    @PostMapping()
    public MessageDto create(@RequestBody MessageDto messageDto){
        Message message = messageService.createMessage(
            MessagesMappers.toEntity(messageDto)
        );
        return MessagesMappers.toDto(message);
    }
}
