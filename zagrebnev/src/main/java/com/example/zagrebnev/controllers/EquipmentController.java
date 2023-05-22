package com.example.zagrebnev.controllers;

import com.example.zagrebnev.models.Equipment;
import com.example.zagrebnev.models.Repair;
import com.example.zagrebnev.services.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class EquipmentController {
    private final EquipmentService equipmentService;

    @GetMapping("/")
    public String equipment(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("equipmentList", equipmentService.listEquipment(title));
        return "equipment";
    }

    @PostMapping("/equipment/create")
    public String createEquipment(@RequestParam("repair1") Repair repair1, @RequestParam("repair2") Repair repair2, @RequestParam("repair3") Repair repair3, Equipment equipment) throws IOException {
        equipmentService.saveEquipment(equipment, repair1, repair2, repair3);
        return "redirect:/";
    }

    @PostMapping("/equipment/delete/{id}")
    public String deleteEquipment(@PathVariable Long id) {
        equipmentService.deleteEquipment(id);
        return "redirect:/";
    }

    @GetMapping("/equipment/{id}")
    public String equipmentInfo(@PathVariable Long id, Model model) {
        model.addAttribute("equipment", equipmentService.getEquipmentById(id));
        return "equipment-info";
    }
}
