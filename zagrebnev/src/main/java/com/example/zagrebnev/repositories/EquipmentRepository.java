package com.example.zagrebnev.repositories;

import com.example.zagrebnev.models.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    List<Equipment> findEquipmentByTitle(String title);

}
