package com.monaschinas.readr.user.resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateProfileResource {
  @NotNull
  @NotBlank
  private String firstName;

  @NotNull
  @NotBlank
  private String lastName;

  @NotNull
  @NotBlank
  private String email;

  @NotNull
  @NotBlank
  private String password;

  @NotNull
  private Long rolId;

  @NotNull
  private Long userId;
}
