package com.betrybe.agrix.services;

import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.repositories.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for managing Crop entities.
 */
@Service
public class CropService {

  private final CropRepository cropRepository;

  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  /**
   * Inserts a new Crop entity into the database.
   *
   * @param crop The Crop entity to be inserted.
   * @return The inserted Crop entity.
   */
  public Crop insertCrop(Crop crop) {
    return cropRepository.save(crop);
  }
}
