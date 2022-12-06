package com.bacen.Project.model.repositories;

import com.bacen.Project.model.entities.MensaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensaisRepository extends JpaRepository<MensaisEntity, Long > {

    @Query(value = "SELECT * FROM expectativas_mensais.expectativas_mensais WHERE data_referencia like %:data%", nativeQuery = true)
    List<MensaisEntity> findAllByData(String data);
}
