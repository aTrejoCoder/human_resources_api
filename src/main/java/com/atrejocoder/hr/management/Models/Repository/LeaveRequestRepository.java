package com.atrejocoder.hr.management.Models.Repository;

import com.atrejocoder.hr.management.Models.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {

}
