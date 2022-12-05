package com.bacen.Project.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RootDto {

@JsonProperty("@odata.context")
private String oDataContext;
@JsonProperty(value ="value")
public List<RequestDto> requestDtos;
}
