package com.bacen.Project.model.repositories;

import com.bacen.Project.model.entities.MensaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensaisRepository extends JpaRepository<MensaisEntity, Long > {
}
