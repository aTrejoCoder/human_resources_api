package com.atrejocoder.hr.management.Models.Repository;

import com.atrejocoder.hr.management.Models.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
