package com.Scheduler.Scheduler.repository;

import com.Scheduler.Scheduler.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Query("SELECT a FROM Appointment a WHERE DATE(a.appointmentDateTime) = DATE(:tomorrow)")
    List<Appointment> findAppointmentsForTomorrow(@Param("tomorrow") LocalDate tomorrow);
}
