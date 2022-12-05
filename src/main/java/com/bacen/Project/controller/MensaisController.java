package com.bacen.Project.controller;

import com.bacen.Project.model.dto.RequestDto;
import com.bacen.Project.model.dto.ResponseDto;
import com.bacen.Project.service.MensaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //@GetMapping("/getAllMensais")
    //get com pageable

    //@GetMapping("/getDataMensais")
    //get por data de referencia

    @PutMapping("/updateMensais/{id}")
    public ResponseDto updateMensais(@RequestBody RequestDto requestDto, @PathVariable("id") Long id) {
        return mensaisService.updateMensais(requestDto, id);
    }
}


