package com.example.zagrebnev.controllers;

import com.example.zagrebnev.models.Equipment;
import com.example.zagrebnev.services.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class EquipmentController {
    private final EquipmentService equipmentService;

    @GetMapping("/")
    public String equipment(@RequestParam(name = "title", required = false) String title, Model model){
        model.addAttribute("equipmentList", equipmentService.listEquipment(title));
        return "equipment";
    }
    @PostMapping("/equipment/create")
    public String createEquipment(Equipment equipment){
        equipmentService.saveEquipment(equipment);
        return "redirect:/";
    }

    @PostMapping("/equipment/delete/{id}")
    public String deleteequipment(@PathVariable Long id){
        equipmentService.deleteEquipment(id);
        return "redirect:/";
    }

    @GetMapping("/equipment/{id}")
    public String equipmentInfo(@PathVariable Long id, Model model){
        model.addAttribute("equipment", equipmentService.getEquipmentById(id));
        return "equipment-info";
    }

}
