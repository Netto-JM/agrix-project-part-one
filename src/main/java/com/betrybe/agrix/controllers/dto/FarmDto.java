package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Farm;
import com.fasterxml.jackson.annotation.JsonProperty;

public record FarnDto(Long id, String name, @JsonProperty("planted_area") Double plantedArea) {

  public Farm toFarm() {
    return new Farm(id, name, plantedArea, null);
  }

}
