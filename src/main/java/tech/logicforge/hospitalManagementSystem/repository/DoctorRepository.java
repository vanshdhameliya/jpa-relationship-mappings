package tech.logicforge.hospitalManagementSystem.repository;

import tech.logicforge.hospitalManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}