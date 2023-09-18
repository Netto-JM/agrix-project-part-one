package com.betrybe.agrix.controllers;

import com.betrybe.agrix.controllers.dto.CropDto;
import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.services.CropService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for managing Crop entities.
 */
@RestController
@RequestMapping("/crops")
public class CropController {

  private final CropService cropService;

  @Autowired
  public CropController(CropService cropService) {
    this.cropService = cropService;
  }

  /**
   * Retrieves a list of all Crop entities.
   *
   * @return A list of CropDto objects representing all Crop entities.
   */
  @GetMapping()
  public List<CropDto> getAllCrops() {
    List<Crop> allCrops = cropService.getAllCrops();
    return allCrops.stream().map(CropDto::fromEntity).toList();
  }
}
