package com.bacen.Project.model.repositories;

import com.bacen.Project.model.entities.MensaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensaisRepository extends JpaRepository<MensaisEntity, Long > {
}
