package com.monaschinas.readr.user.resource;

import com.monaschinas.readr.user.resource.LanguageResource;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class BookLanguageResource {
    private Long id;
    private Long bookId;
    private LanguageResource language;
}
