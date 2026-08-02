package tech.logicforge.hospitalManagementSystem.repository;

import tech.logicforge.hospitalManagementSystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}