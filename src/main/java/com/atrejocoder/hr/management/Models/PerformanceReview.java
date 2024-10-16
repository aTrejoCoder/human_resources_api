package com.atrejocoder.hr.management.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class PerformanceReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "review_date", nullable = false)
    private LocalDate reviewDate;

    @Column(name = "reviewer_name", nullable = false)
    private String reviewerName;

    @Column(name = "comments", nullable = false)
    private String comments;

    @Column(name = "ratings", nullable = false)
    private int rating; // Rating from 1 to 5
}