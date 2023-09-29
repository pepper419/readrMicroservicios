package com.monaschinas.readr.user.domain.persistence;

import com.monaschinas.readr.user.domain.model.BookLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookLanguageRepository extends JpaRepository<BookLanguage, Long> {
}
