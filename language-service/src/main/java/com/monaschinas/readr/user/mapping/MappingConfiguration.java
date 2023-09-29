package com.monaschinas.readr.user.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("languageMicroServiceMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public LanguageMapper languageMapper(){ return new LanguageMapper(); }

    @Bean
    public BookLanguageMapper bookLanguageMapper(){ return new BookLanguageMapper(); }
}
