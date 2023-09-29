package com.monaschinas.readr.saga.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@With
@Entity
@Table(name = "sagas")
public class Saga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 64)
    //@Column(unique = true)
    private String title;

    @NotNull
    @NotBlank
    @Size(max = 96)
    private String synopsis;

    // Relationships

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "saga_status_id", nullable = false)
    @JsonIgnore
    private SagaStatus sagaStatus;
}
