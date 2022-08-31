package com.nttdata.bootcamp.notification.domain.dto;

import lombok.Data;

@Data
public class NotificationRequest {
    private String userName;
    private String typeNotification;
}
