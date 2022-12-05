package com.bacen.Project.model.repositories;

import com.bacen.Project.model.dto.RootDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "mensaisClient", url = "https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/odata/ExpectativaMercadoMensais?$top=100&$format=json")


public interface MensaisClient {
    @GetMapping
    RootDto getAllData();
}
