package com.Scheduler.Scheduler.scheduler;

import com.Scheduler.Scheduler.entity.Appointment;
import com.Scheduler.Scheduler.repository.AppointmentRepository;
import com.Scheduler.Scheduler.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@EnableScheduling
public class AppointmentReminderScheduler {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    EmailService emailService;

    /**
     * RUN ONCE TODAY AT 7:55 PM IST INDIAN STANDARD TIME WHICH CONSIDERS ASIA / KOLKATA FROM ZONE
     */

    @Scheduled(cron = "0 55 19 * * *", zone = "Asia/Kolkata")
    public void sendAppointmentReminders() {

        LocalDate tomorrow = LocalDate.now().plusDays(1);

        List<Appointment> appointments =
                appointmentRepository.findAppointmentsForTomorrow(tomorrow);

        for (Appointment a : appointments) {
            String time = a.getAppointmentDateTime().toLocalTime().toString();
            emailService.sendReminderEmail(a.getPatientEmail(), a.getPatientName(), time);
        }
}
}
