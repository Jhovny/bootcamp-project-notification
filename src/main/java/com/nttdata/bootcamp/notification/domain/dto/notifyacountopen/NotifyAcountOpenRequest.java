package com.nttdata.bootcamp.notification.domain.dto.notifyacountopen;

import com.nttdata.bootcamp.notification.domain.dto.NotificationRequest;
import lombok.Data;

@Data
public class NotifyAcountOpenRequest extends NotificationRequest {

    private String codeClient  ;
    private int quantityProduct ;


}
