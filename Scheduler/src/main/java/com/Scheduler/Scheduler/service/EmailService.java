package com.Scheduler.Scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendReminderEmail(String to, String name, String time) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Appointment Reminder");
        message.setText("Dear " + name + ",\n\nThis is a reminder for your appointment scheduled at "
                + time + ".\n\nRegards,\nHospital Team");

        mailSender.send(message);
    }
}
