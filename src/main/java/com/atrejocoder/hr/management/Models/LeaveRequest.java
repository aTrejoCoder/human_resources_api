package com.atrejocoder.hr.management.Models;

import com.atrejocoder.hr.management.Models.enums.LeaveStatus;
import com.atrejocoder.hr.management.Models.enums.LeaveType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@NoArgsConstructor
@Data
@Table(name = "leave_request")
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date" ,nullable = false)
    private LocalDate endDate;

    @Column(name = "leave_type" , nullable = false)
    @Enumerated(EnumType.STRING)
    private LeaveType type;

    @Column(name = "status" , nullable = false)
    @Enumerated(EnumType.STRING)
    private LeaveStatus status;

    @Column(name = "created_at", nullable = false)
    private LocalTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalTime updated_at;

    @Column(name = "reason")
    private String reason;
}
