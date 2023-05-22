package com.example.zagrebnev.services;

import com.example.zagrebnev.models.Equipment;
import com.example.zagrebnev.models.Repair;
import com.example.zagrebnev.repositories.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public List<Equipment> listEquipment(String title) {
        if (title != null) return equipmentRepository.findEquipmentByTitle(title);
        return  equipmentRepository.findAll();
    }

    public void saveEquipment(Equipment equipment, Repair repair1, Repair repair2, Repair repair3){

        if (repair1.getName() != null){
            equipment.addRepair(repair1);
        }
        if (repair2.getName() != null){
            equipment.addRepair(repair2);
        }
        if (repair3.getName() != null){
            equipment.addRepair(repair3);
        }
        log.info("Saving new {}", equipment);
        equipmentRepository.save(equipment);
    }

    public void deleteEquipment(Long id){ equipmentRepository.deleteById(id);    }

    public Equipment getEquipmentById(Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }
}
