package com.atrejocoder.hr.management.Models.Repository;

import com.atrejocoder.hr.management.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
