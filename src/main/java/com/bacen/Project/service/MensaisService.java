package com.bacen.Project.service;

import com.bacen.Project.model.dto.RequestDto;
import com.bacen.Project.model.dto.ResponseDto;
import com.bacen.Project.model.entities.MensaisEntity;
import com.bacen.Project.model.repositories.MensaisClient;
import com.bacen.Project.model.repositories.MensaisRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensaisService {

    @Autowired
    private MensaisClient mensaisClient;

    @Autowired
    private MensaisRepository mensaisRepository;

    public String dadosBacen() {
        var dadosMensais = mensaisClient.getAllData().getRequestDtos();
        for (var i = 0; i < dadosMensais.size(); i++) {
            var mensaisEntity = new MensaisEntity();
            var dado = dadosMensais.get(i);
            BeanUtils.copyProperties(dado, mensaisEntity);
            mensaisRepository.save(mensaisEntity);
        }
        return "dados salvos com sucesso";
    }

    public ResponseDto salvarMensais(RequestDto requestDto) {
        var model = new MensaisEntity();
        BeanUtils.copyProperties(requestDto, model);
        mensaisRepository.save(model);
        var response = new ResponseDto();
        BeanUtils.copyProperties(requestDto, response);
        return response;
    }

    public void deleteMensais(Long id) {
        if (mensaisRepository.existsById(id)) {
            mensaisRepository.deleteById(id);
        }
    }

    public ResponseDto findByIdMensais(Long id) {
        MensaisEntity mensaisEntity = mensaisRepository.findById(id).orElse(null);
        var responseById = new ResponseDto();
        BeanUtils.copyProperties(mensaisEntity, responseById);
        return responseById;
    }

    public ResponseDto updateMensais(RequestDto requestDto, Long id) {
        MensaisEntity mensaisEntity = mensaisRepository.findById(id).orElse(null);
        var updateEntity = new MensaisEntity();
        BeanUtils.copyProperties(requestDto, updateEntity);
        mensaisRepository.save(updateEntity);
        var responseUpdate = new ResponseDto();
        BeanUtils.copyProperties(updateEntity, responseUpdate, "id");
        return responseUpdate;
    }
}