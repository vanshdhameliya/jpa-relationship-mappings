package tech.logicforge.hospitalManagementSystem.repository;

import tech.logicforge.hospitalManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}