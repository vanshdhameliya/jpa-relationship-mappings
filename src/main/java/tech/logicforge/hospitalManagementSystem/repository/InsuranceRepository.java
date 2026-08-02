package tech.logicforge.hospitalManagementSystem.repository;

import tech.logicforge.hospitalManagementSystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}