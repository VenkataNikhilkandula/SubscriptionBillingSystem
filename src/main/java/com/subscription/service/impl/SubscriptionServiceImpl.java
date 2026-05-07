package com.subscription.service.impl;

import com.subscription.dto.request.SubscriptionRequestDTO;
import com.subscription.dto.response.SubscriptionResponseDTO;
import com.subscription.entity.Plan;
import com.subscription.entity.Subscription;
import com.subscription.entity.User;
import com.subscription.exception.ResourceNotFoundException;
import com.subscription.repository.PlanRepository;
import com.subscription.repository.SubscriptionRepository;
import com.subscription.repository.UserRepository;
import com.subscription.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;
    private final PlanRepository planRepository;
    private final UserRepository userRepository;

    @Override
    public SubscriptionResponseDTO createSubscription(SubscriptionRequestDTO dto) {

        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        Plan plan = planRepository.findById(dto.getPlanId())
                .orElseThrow(() -> new ResourceNotFoundException("Plan not found"));

        Subscription sub = new Subscription();
        sub.setUser(user);
        sub.setPlan(plan);
        sub.setStartDate(LocalDate.now());

        if ("MONTHLY".equalsIgnoreCase(plan.getDuration())) {
            sub.setEndDate(LocalDate.now().plusMonths(1));
        } else {
            sub.setEndDate(LocalDate.now().plusYears(1));
        }

        sub.setStatus("ACTIVE");

        Subscription saved = subscriptionRepository.save(sub);

        return mapToResponse(saved);
    }

    @Override
    public List<SubscriptionResponseDTO> getAllSubscriptions() {
        return subscriptionRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private SubscriptionResponseDTO mapToResponse(Subscription sub) {
        SubscriptionResponseDTO dto = new SubscriptionResponseDTO();
        dto.setId(sub.getId());
        dto.setUserName(sub.getUser().getName());
        dto.setPlanName(sub.getPlan().getName());
        dto.setStartDate(sub.getStartDate());
        dto.setEndDate(sub.getEndDate());
        dto.setStatus(sub.getStatus());
        return dto;
    }
}