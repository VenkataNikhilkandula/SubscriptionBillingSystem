package com.subscription.repository;

import com.subscription.entity.Plan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {

    Page<Plan> findByNameContainingIgnoreCase(String name, Pageable pageable);

    Page<Plan> findByStatus(String status, Pageable pageable);
}