package dev.martinb.plantly.plantapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlantImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
public class PlantImage   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("plantId")
  private UUID plantId;

  @JsonProperty("data")
  private String data;

  @JsonProperty("dateAdded")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateAdded;

  @JsonProperty("dateUpdated")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateUpdated;

  public PlantImage id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PlantImage plantId(UUID plantId) {
    this.plantId = plantId;
    return this;
  }

  /**
   * Get plantId
   * @return plantId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getPlantId() {
    return plantId;
  }

  public void setPlantId(UUID plantId) {
    this.plantId = plantId;
  }

  public PlantImage data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Base64 encoded image data
   * @return data
  */
  @ApiModelProperty(required = true, value = "Base64 encoded image data")
  @NotNull


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PlantImage dateAdded(LocalDate dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

  /**
   * Get dateAdded
   * @return dateAdded
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(LocalDate dateAdded) {
    this.dateAdded = dateAdded;
  }

  public PlantImage dateUpdated(LocalDate dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

  /**
   * Get dateUpdated
   * @return dateUpdated
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(LocalDate dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlantImage plantImage = (PlantImage) o;
    return Objects.equals(this.id, plantImage.id) &&
        Objects.equals(this.plantId, plantImage.plantId) &&
        Objects.equals(this.data, plantImage.data) &&
        Objects.equals(this.dateAdded, plantImage.dateAdded) &&
        Objects.equals(this.dateUpdated, plantImage.dateUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plantId, data, dateAdded, dateUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlantImage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plantId: ").append(toIndentedString(plantId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

