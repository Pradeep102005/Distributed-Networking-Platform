package com.codingshuttle.linkedInProject.notification_service.service;

import com.codingshuttle.linkedInProject.notification_service.entity.Notification;
import com.codingshuttle.linkedInProject.notification_service.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void addNotification(Notification notification) {
        log.info("Adding notification to db, message: {}", notification.getMessage());
        notification = notificationRepository.save(notification);

//        SendMailer to send email
//        FCM
    }
}
