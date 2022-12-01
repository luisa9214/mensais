package com.bacen.Project.controller;

import com.bacen.Project.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping("mensaisClient")
public class MensaisController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public String dadosBacen(){
        return projectService.dadosBacen();
    }
}



