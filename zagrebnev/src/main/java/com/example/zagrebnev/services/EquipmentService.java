package com.example.zagrebnev.services;

import com.example.zagrebnev.models.Equipment;
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
        if (title != null) equipmentRepository.findEquipmentByTitle(title);
        return  equipmentRepository.findAll();
    }

    public void saveEquipment(Equipment equipment){
        log.info("Saving new {}", equipment);
        equipmentRepository.save(equipment);
    }

    public void deleteEquipment(Long id){ equipmentRepository.deleteById(id);    }

    public Equipment getEquipmentById(Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }
}
