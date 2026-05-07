package com.subscription.service.impl;

import com.subscription.dto.request.PlanRequestDTO;
import com.subscription.dto.response.PlanResponseDTO;
import com.subscription.entity.Plan;
import com.subscription.repository.PlanRepository;
import com.subscription.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlanServiceImpl implements PlanService {

    private final PlanRepository planRepository;

    @Override
    public PlanResponseDTO createPlan(PlanRequestDTO dto) {
        Plan plan = new Plan();
        plan.setName(dto.getName());
        plan.setPrice(dto.getPrice());
        plan.setDuration(dto.getDuration());
        plan.setStatus("ACTIVE");

        Plan saved = planRepository.save(plan);

        return mapToResponse(saved);
    }

    @Override
    public List<PlanResponseDTO> getAllPlans() {
        return planRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private PlanResponseDTO mapToResponse(Plan plan) {
        PlanResponseDTO dto = new PlanResponseDTO();
        dto.setId(plan.getId());
        dto.setName(plan.getName());
        dto.setPrice(plan.getPrice());
        dto.setDuration(plan.getDuration());
        return dto;
    }
}