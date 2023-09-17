package com.betrybe.agrix.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 * Represents a farm entity.
 */
@Table(name = "farm")
public class Farm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(name = "planted_area")
  private Double plantedArea;

  @OneToMany(mappedBy = "farm")
  @JsonIgnore
  private List<Crop> crops;

  /**
   * Default constructor for the Farm entity.
   */
  public Farm() {}

  /**
   * Parameterized constructor for the Farm entity.
   *
   * @param id          The unique identifier of the farm.
   * @param name        The name of the farm.
   * @param plantedArea The total planted area of the farm.
   * @param crops       The list of crops associated with the farm.
   */
  public Farm(Long id, String name, Double plantedArea, List<Crop> crops) {
    this.id = id;
    this.name = name;
    this.plantedArea = plantedArea;
    this.crops = crops;
  }

  /**
   * Get the unique identifier of the farm.
   *
   * @return The farm's ID.
   */
  public Long getId() {
    return id;
  }

  /**
   * Set the unique identifier of the farm.
   *
   * @param id The farm's ID.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Get the name of the farm.
   *
   * @return The farm's name.
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name of the farm.
   *
   * @param name The farm's name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the total planted area of the farm.
   *
   * @return The total planted area in acres.
   */
  public Double getPlantedArea() {
    return plantedArea;
  }

  /**
   * Set the total planted area of the farm.
   *
   * @param plantedArea The total planted area in acres.
   */
  public void setPlantedArea(Double plantedArea) {
    this.plantedArea = plantedArea;
  }

  /**
   * Get the list of crops associated with the farm.
   *
   * @return A list of Crop objects.
   */
  public List<Crop> getCrops() {
    return crops;
  }

  /**
   * Set the list of crops associated with the farm.
   *
   * @param crops A list of Crop objects.
   */
  public void setCrops(List<Crop> crops) {
    this.crops = crops;
  }
}
