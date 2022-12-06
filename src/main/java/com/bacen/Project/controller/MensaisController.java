package com.bacen.Project.controller;

import com.bacen.Project.model.request.MensaisRequest;
import com.bacen.Project.model.response.MensaisResponse;
import com.bacen.Project.service.MensaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mensaisClient")
public class MensaisController {

    @Autowired
    private MensaisService mensaisService;

    @GetMapping
    public String dadosBacen() {
        return mensaisService.dadosBacen();
    }

    @PostMapping("/saveMensais")
    public MensaisResponse saveMensais(@RequestBody MensaisRequest mensaisRequest) {
        return mensaisService.salvarMensais(mensaisRequest);
    }

    @DeleteMapping("/deleteMensais/{id}")
    public void deleteMensais(@PathVariable("id") Long id) {
        mensaisService.deleteMensais(id);
    }

    @GetMapping("/getByIdMensais/{id}")
    public MensaisResponse getByIdMensais(@PathVariable("id") Long id) {
        return mensaisService.findByIdMensais(id);
    }

    @PutMapping("/updateMensais/{id}")
    public MensaisResponse updateMensais(@RequestBody MensaisRequest mensaisRequest, @PathVariable("id") Long id) {
        return mensaisService.updateMensais(mensaisRequest, id);
    }

    @GetMapping("/getMensaisReferencia")
    public List<MensaisResponse> getMensaisReferencia(@RequestParam("mensaisDataReferencia") String mensaisReferencia){
        return mensaisService.getMensaisByData(mensaisReferencia);
    }

    @GetMapping("/getAllMensais")
    public Page<MensaisResponse> getAllMensais(Pageable pageable){
        return mensaisService.getAllMensais(pageable);
    }
}


