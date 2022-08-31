package com.nttdata.bootcamp.notification.domain.dto.notifyacountopen;

import com.nttdata.bootcamp.notification.domain.dto.NotificationResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotifyAcountOpenResponse extends NotificationResponse {

private String messageDetail;

}
