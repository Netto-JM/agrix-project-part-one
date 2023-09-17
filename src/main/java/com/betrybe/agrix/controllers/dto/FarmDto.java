package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Farm;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object (DTO) representing the Farm entity.
 */
public record FarmDto(Long id, String name, @JsonProperty("planted_area") Double plantedArea) {

  /**
   * Converts the FarmDto to a Farm entity.
   *
   * @return A Farm entity with the same attributes as this DTO.
   */
  public Farm toFarm() {
    return new Farm(id, name, plantedArea, null);
  }

}
