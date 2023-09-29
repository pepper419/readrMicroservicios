package com.monaschinas.readr.saga.resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateSagaStatusResource {
        @NotNull
        @NotBlank
        @Size(max = 24)
        private String name;
}
