package com.bacen.Project.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    @JsonProperty("Indicador")
    public String indicador;
    @JsonProperty("Data")
    public String data;
    @JsonProperty("DataReferencia")
    public String dataReferencia;
    @JsonProperty("Media")
    public double media;
    @JsonProperty("Mediana")
    public double mediana;
    @JsonProperty("DesvioPadrao")
    public double desvioPadrao;
    @JsonProperty("Minimo")
    public double minimo;
    @JsonProperty("Maximo")
    public double maximo;
    public int numeroRespondentes;
    public int baseCalculo;

}
