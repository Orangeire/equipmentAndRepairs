package com.example.zagrebnev.services;

import com.example.zagrebnev.models.Repair;
import com.example.zagrebnev.repositories.RepairRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class RepairService {
    private final RepairRepository repairRepository;

    public Repair getRepairById(Long id) {
        return repairRepository.findById(id).orElse(null);
    }
}
