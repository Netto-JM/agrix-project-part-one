package com.betrybe.agrix.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents a crop entity.
 */
@Entity
@Table(name = "crop")
public class Crop {

  /**
   * The unique identifier of the crop.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * The name of the crop.
   */
  private String name;

  /**
   * The size of the crop.
   */
  private Double size;

  /**
   * The farm to which this crop belongs.
   */
  @ManyToOne
  @JoinTable(name = "farm_id")
  private Farm farm;

  /**
   * Default constructor for Crop.
   */
  public Crop() {}

  /**
   * Parameterized constructor for Crop.
   *
   * @param id   The unique identifier of the crop.
   * @param name The name of the crop.
   * @param size The size of the crop.
   * @param farm The farm to which this crop belongs.
   */
  public Crop(Long id, String name, Double size, Farm farm) {
    this.id = id;
    this.name = name;
    this.size = size;
    this.farm = farm;
  }

  /**
   * Get the unique identifier of the crop.
   *
   * @return The unique identifier of the crop.
   */
  public Long getId() {
    return id;
  }

  /**
   * Set the unique identifier of the crop.
   *
   * @param id The unique identifier of the crop.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Get the name of the crop.
   *
   * @return The name of the crop.
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name of the crop.
   *
   * @param name The name of the crop.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the size of the crop.
   *
   * @return The size of the crop.
   */
  public Double getSize() {
    return size;
  }

  /**
   * Set the size of the crop.
   *
   * @param size The size of the crop.
   */
  public void setSize(Double size) {
    this.size = size;
  }

  /**
   * Get the farm to which this crop belongs.
   *
   * @return The farm to which this crop belongs.
   */
  public Farm getFarm() {
    return farm;
  }

  /**
   * Set the farm to which this crop belongs.
   *
   * @param farm The farm to which this crop belongs.
   */
  public void setFarm(Farm farm) {
    this.farm = farm;
  }
}
