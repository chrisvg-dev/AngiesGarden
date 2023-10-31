package com.cvillegas.angiesgarden.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor @NoArgsConstructor
@Builder @ToString @Data
public class Plant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    private String scientificName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
