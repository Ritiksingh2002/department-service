package com.microservices.department_Service.Repository;

import com.microservices.department_Service.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
