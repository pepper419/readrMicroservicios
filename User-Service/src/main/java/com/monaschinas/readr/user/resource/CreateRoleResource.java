package com.monaschinas.readr.user.resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateRoleResource {
  @NotNull
  @NotBlank
  private String name;
}
