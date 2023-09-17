package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object (DTO) representing the Crop entity.
 */
public record CropDto(Long id, String name, @JsonProperty("planted_area") Double plantedArea) {

  /**
   * Creates a CropDto from a Crop entity.
   *
   * @param crop The Crop entity to convert.
   * @return A CropDto populated with data from the Crop entity.
   */
  public static CropDto fromEntity(Crop crop) {
    return new CropDto(crop.getId(), crop.getName(), crop.getPlantedArea());
  }

  /**
   * Converts the CropDto to a Crop entity.
   *
   * @return A Crop entity with the same attributes as this DTO.
   */
  public Crop toEntity() {
    Crop crop = new Crop();
    crop.setName(name);
    crop.setPlantedArea(plantedArea);
    return crop;
  }
}
