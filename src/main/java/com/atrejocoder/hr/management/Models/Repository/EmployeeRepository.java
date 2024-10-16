package com.atrejocoder.hr.management.Models.Repository;

import com.atrejocoder.hr.management.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
