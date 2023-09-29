package com.monaschinas.readr.user.resource;

import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class LanguageResource {
    private Long id;
    private String name;
    private String abbreviation;
}
