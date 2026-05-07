package com.subscription.service;

import com.subscription.dto.request.PlanRequestDTO;
import com.subscription.dto.response.PlanResponseDTO;

import java.util.List;

public interface PlanService {
    PlanResponseDTO createPlan(PlanRequestDTO dto);
    List<PlanResponseDTO> getAllPlans();
}