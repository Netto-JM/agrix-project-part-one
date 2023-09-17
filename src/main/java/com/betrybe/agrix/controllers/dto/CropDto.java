package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;

public record CropDto(Long id, String name, Double size) {

  public CropDto {
    if (size < 0) {
      throw new IllegalArgumentException("Size must be greater than zero");
    }
  }

  public Crop toCrop() {
    return new Crop(id, name, size, null);
  }

}
