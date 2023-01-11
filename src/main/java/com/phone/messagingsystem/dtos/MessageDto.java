package com.phone.messagingsystem.dtos;

import com.phone.messagingsystem.entity.Message;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
    private Long id;
    private String senderName;
    private String receiverName;
    private String messageContent;
    private LocalDateTime scheduledTime;
    private LocalDateTime createdAt;
}
