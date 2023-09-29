package com.monaschinas.readr.saga.resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSagaStatusResource {
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 24)
    private String name;
}
