package com.bacen.Project.service;

import com.bacen.Project.model.request.MensaisRequest;
import com.bacen.Project.model.response.MensaisResponse;
import com.bacen.Project.model.entities.MensaisEntity;
import com.bacen.Project.model.repositories.MensaisClient;
import com.bacen.Project.model.repositories.MensaisRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MensaisService {

    @Autowired
    private MensaisClient mensaisClient;

    @Autowired
    private MensaisRepository mensaisRepository;

    public String dadosBacen() {
        var dadosMensais = mensaisClient.getAllData().getMensaisRequests();
        for (var i = 0; i < dadosMensais.size(); i++) {
            var mensaisEntity = new MensaisEntity();
            var dado = dadosMensais.get(i);
            BeanUtils.copyProperties(dado, mensaisEntity);
            mensaisRepository.save(mensaisEntity);
        }
        return "dados salvos com sucesso";
    }

    public MensaisResponse salvarMensais(MensaisRequest mensaisRequest) {
        var model = new MensaisEntity();
        BeanUtils.copyProperties(mensaisRequest, model);
        mensaisRepository.save(model);
        var response = new MensaisResponse();
        BeanUtils.copyProperties(mensaisRequest, response);
        return response;
    }

    public void deleteMensais(Long id) {
        mensaisRepository.existsById(id);
        mensaisRepository.deleteById(id);
    }

    public MensaisResponse findByIdMensais(Long id) {
        MensaisEntity mensaisEntity = mensaisRepository.findById(id).orElse(null);
        var responseById = new MensaisResponse();
        BeanUtils.copyProperties(mensaisEntity, responseById);
        return responseById;
    }

    public MensaisResponse updateMensais(MensaisRequest mensaisRequest, Long id) {
        var updateEntity = new MensaisEntity();
        BeanUtils.copyProperties(mensaisRequest, updateEntity);
        updateEntity.setId(id);
        mensaisRepository.save(updateEntity);
        var responseUpdate = new MensaisResponse();
        BeanUtils.copyProperties(updateEntity, responseUpdate, "id");
        return responseUpdate;
    }

    public List<MensaisResponse> getMensaisByData(String mensaisDataReferencia){
        List<MensaisEntity> mensaisEntityReferencia = mensaisRepository.findAllByData(mensaisDataReferencia);
        var listaResponse = mensaisEntityReferencia.stream().map(mensais ->{
            var responseData = new MensaisResponse();
            BeanUtils.copyProperties(mensais, responseData);
            return responseData;
        }).collect(Collectors.toList());
            return listaResponse;
    }

    public Page<MensaisResponse> getAllMensais(Pageable pageable) {
        var listaEntity = mensaisRepository.findAll(pageable);
        var listaResponsePage = listaEntity.getContent();
        var listaResponseAll = listaResponsePage.stream().map(mensais -> {
            var responseMensais = new MensaisResponse();
            BeanUtils.copyProperties(mensais, responseMensais);
            return responseMensais;
        }).collect(Collectors.toList());
            return new PageImpl<>(listaResponseAll);
    }
}