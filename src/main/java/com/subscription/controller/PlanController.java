package com.subscription.controller;

import com.subscription.dto.request.PlanRequestDTO;
import com.subscription.dto.response.PlanResponseDTO;
import com.subscription.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plans")
@RequiredArgsConstructor
public class PlanController {

    private final PlanService planService;

    @PostMapping
    public PlanResponseDTO createPlan(@RequestBody PlanRequestDTO dto) {
        return planService.createPlan(dto);
    }

    @GetMapping
    public List<PlanResponseDTO> getPlans() {
        return planService.getAllPlans();
    }
}