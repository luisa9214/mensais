package com.bacen.Project.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "expectativas_mensais")
public class MensaisEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
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
