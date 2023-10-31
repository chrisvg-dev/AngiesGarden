package com.cvillegas.angiesgarden.repository;

import com.cvillegas.angiesgarden.domain.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlantRepository extends JpaRepository<Plant, Long> {
}
