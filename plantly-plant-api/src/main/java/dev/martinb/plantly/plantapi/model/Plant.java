package dev.martinb.plantly.plantapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.martinb.plantly.plantapi.model.PlantMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Plant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
public class Plant   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("scientificName")
  private String scientificName;

  @JsonProperty("imageId")
  private UUID imageId;

  @JsonProperty("dateAdded")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateAdded;

  @JsonProperty("metadata")
  private PlantMetadata metadata;

  public Plant id(UUID id) {
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

  public Plant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Devils Ivy", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plant scientificName(String scientificName) {
    this.scientificName = scientificName;
    return this;
  }

  /**
   * Get scientificName
   * @return scientificName
  */
  @ApiModelProperty(example = "Epipremnum aureum", required = true, value = "")
  @NotNull


  public String getScientificName() {
    return scientificName;
  }

  public void setScientificName(String scientificName) {
    this.scientificName = scientificName;
  }

  public Plant imageId(UUID imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
  */
  @ApiModelProperty(example = "eff68180-4cd4-4872-ad1b-82df430dd640", value = "")

  @Valid

  public UUID getImageId() {
    return imageId;
  }

  public void setImageId(UUID imageId) {
    this.imageId = imageId;
  }

  public Plant dateAdded(LocalDate dateAdded) {
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

  public Plant metadata(PlantMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PlantMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(PlantMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plant plant = (Plant) o;
    return Objects.equals(this.id, plant.id) &&
        Objects.equals(this.name, plant.name) &&
        Objects.equals(this.scientificName, plant.scientificName) &&
        Objects.equals(this.imageId, plant.imageId) &&
        Objects.equals(this.dateAdded, plant.dateAdded) &&
        Objects.equals(this.metadata, plant.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, scientificName, imageId, dateAdded, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scientificName: ").append(toIndentedString(scientificName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

