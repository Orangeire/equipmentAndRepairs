package com.example.zagrebnev.controllers;

import com.example.zagrebnev.repositories.RepairRepository;
import com.example.zagrebnev.services.RepairService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RepairController {

    private final RepairService repairService;

    @GetMapping("/repairs/{id}")
    private String getRepairById(@PathVariable Long id, Model model) {
        model.addAttribute("repair", repairService.getRepairById(id));
        return "repair-info";
    }
}
