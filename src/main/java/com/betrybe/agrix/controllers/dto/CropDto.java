package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;

/**
 * Data Transfer Object (DTO) representing the Crop entity.
 */
public record CropDto(Long id, String name, Double size) {

  /**
   * Converts the CropDto to a Crop entity.
   *
   * @return A Crop entity with the same attributes as this DTO.
   */
  public Crop toCrop() {
    return new Crop(id, name, size, null);
  }

}
