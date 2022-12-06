package com.bacen.Project.controller;

import com.bacen.Project.model.response.MensaisResponse;
import com.bacen.Project.service.MensaisService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;

import java.util.List;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MensaisControllerTest {

    @InjectMocks
    public MensaisController mensaisController;

    @Mock
    private MensaisService mensaisService;

    @Test
    @DisplayName("getAll")
    void getAllMensais(){
        Pageable pageable = PageRequest.of(0, 10);
        Page<MensaisResponse> page = new PageImpl<>(List.of());
        when(mensaisService.getAllMensais(pageable)).thenReturn(page);
    }
}