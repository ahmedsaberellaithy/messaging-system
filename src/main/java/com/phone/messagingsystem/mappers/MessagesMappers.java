package com.phone.messagingsystem.mappers;

import com.phone.messagingsystem.dtos.MessageDto;
import com.phone.messagingsystem.entity.Message;

public class MessagesMappers {

    public static MessageDto toDto(Message message) {
        return MessageDto.builder()
            .id(message.getId())
            .messageContent(message.getMessageContent())
            .senderName(message.getSenderName())
            .receiverName(message.getReceiverName())
            .scheduledTime(message.getScheduledTime())
            .createdAt(message.getCreatedAt())
            .build();
    }

    public static Message toEntity(MessageDto messageDto) {
        Message message = new Message();
        message.setMessageContent(messageDto.getMessageContent());
        message.setSenderName(messageDto.getSenderName());
        message.setReceiverName(messageDto.getReceiverName());
        message.setScheduledTime(messageDto.getScheduledTime());
        message.setCreatedAt(messageDto.getCreatedAt());
        return message;
    }
}
