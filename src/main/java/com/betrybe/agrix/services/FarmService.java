package com.betrybe.agrix.services;

import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.FarmRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for managing Farm entities.
 */
@Service
public class FarmService {

  private final FarmRepository farmRepository;

  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  /**
   * Inserts a new Farm entity into the database.
   *
   * @param farm The Farm entity to be inserted.
   * @return The inserted Farm entity.
   */
  public Farm insertFarm(Farm farm) {
    return farmRepository.save(farm);
  }

  /**
   * Retrieves all Farm entities from the database.
   *
   * @return A List containing all Farm entities.
   */
  public List<Farm> getAllFarms() {
    return farmRepository.findAll();
  }
}
