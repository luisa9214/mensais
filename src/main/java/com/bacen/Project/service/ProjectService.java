package com.bacen.Project.service;

import com.bacen.Project.model.entities.MensaisEntity;
import com.bacen.Project.model.repositories.MensaisClient;
import com.bacen.Project.model.repositories.MensaisRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectService {

    @Autowired
    private MensaisClient mensaisClient;

    @Autowired
    private MensaisRepository mensaisRepository;

    public String dadosBacen() {

        var dadosMensais = mensaisClient.getAllData().getDadosMensaisDtos();

        for (var i = 0; i < dadosMensais.size(); i++) {
            var mensaisEntity = new MensaisEntity();
            var dado = dadosMensais.get(i);
            BeanUtils.copyProperties(dado, mensaisEntity);
            mensaisRepository.save(mensaisEntity);
        }
        return "dados salvos com sucesso";
    }
}