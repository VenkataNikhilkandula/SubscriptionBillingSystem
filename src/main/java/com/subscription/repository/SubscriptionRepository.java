package com.subscription.repository;

import com.subscription.entity.Subscription;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
		List<Subscription> findByUserId(Long userId);
	    List<Subscription> findByStatus(String status);

	    Long countByStatus(String status);
}