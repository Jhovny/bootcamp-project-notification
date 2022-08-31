package com.nttdata.bootcamp.notification.domain.dto.email;

import com.nttdata.bootcamp.notification.domain.dto.NotificationRequest;
import lombok.Data;

@Data
public class NotificationEmailRequest extends NotificationRequest {


    private String emailTo;
    private String emailSubject;
    private String emailBody;



}
