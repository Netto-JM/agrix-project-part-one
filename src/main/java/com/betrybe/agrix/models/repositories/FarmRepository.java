package com.betrybe.agrix.models.repositories;

import com.betrybe.agrix.models.entities.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing and managing Farm entities.
 */
@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {

}
