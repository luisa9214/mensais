package com.bacen.Project.controller;

import com.bacen.Project.model.dto.RequestDto;
import com.bacen.Project.model.dto.ResponseDto;
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
    public ResponseDto saveMensais(@RequestBody RequestDto requestDto) {
        return mensaisService.salvarMensais(requestDto);
    }

    @DeleteMapping("/deleteMensais/{id}")
    public void deleteMensais(@PathVariable("id") Long id) {
        mensaisService.deleteMensais(id);
    }

    @GetMapping("/getByIdMensais/{id}")
    public ResponseDto getByIdMensais(@PathVariable("id") Long id) {
        return mensaisService.findByIdMensais(id);
    }

    @PutMapping("/updateMensais/{id}")
    public ResponseDto updateMensais(@RequestBody RequestDto requestDto, @PathVariable("id") Long id) {
        return mensaisService.updateMensais(requestDto, id);
    }

    @GetMapping("/getMensaisReferencia")
    public List<ResponseDto> getMensaisReferencia(@RequestParam("mensaisDataReferencia") String mensaisReferencia){
        return mensaisService.getMensaisByData(mensaisReferencia);
    }

    @GetMapping("/getAllMensais")
    public Page<ResponseDto> getAllMensais(Pageable pageable){
        return mensaisService.getAllMensais(pageable);
    }
}


