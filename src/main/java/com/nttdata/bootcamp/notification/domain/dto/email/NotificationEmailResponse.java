package com.nttdata.bootcamp.notification.domain.dto.email;

import com.nttdata.bootcamp.notification.domain.dto.NotificationResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class NotificationEmailResponse extends NotificationResponse {

private String messageDetail;

}
