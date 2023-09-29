package com.monaschinas.readr.book.domain.persistence;

import com.monaschinas.readr.book.domain.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre, Long> {

    Optional<Genre> findByName(String name);
}
