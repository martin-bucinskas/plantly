package dev.martinb.plantly.plantapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.martinb.plantly.plantapi.model.LightCondition;
import dev.martinb.plantly.plantapi.model.SoilCondition;
import dev.martinb.plantly.plantapi.model.WaterCondition;
import dev.martinb.plantly.plantapi.model.WateringFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlantMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
public class PlantMetadata   {
  @JsonProperty("soilCondition")
  private SoilCondition soilCondition;

  @JsonProperty("lightCondition")
  private LightCondition lightCondition;

  @JsonProperty("waterCondition")
  private WaterCondition waterCondition;

  @JsonProperty("wateringFrequency")
  private WateringFrequency wateringFrequency;

  public PlantMetadata soilCondition(SoilCondition soilCondition) {
    this.soilCondition = soilCondition;
    return this;
  }

  /**
   * Get soilCondition
   * @return soilCondition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SoilCondition getSoilCondition() {
    return soilCondition;
  }

  public void setSoilCondition(SoilCondition soilCondition) {
    this.soilCondition = soilCondition;
  }

  public PlantMetadata lightCondition(LightCondition lightCondition) {
    this.lightCondition = lightCondition;
    return this;
  }

  /**
   * Get lightCondition
   * @return lightCondition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LightCondition getLightCondition() {
    return lightCondition;
  }

  public void setLightCondition(LightCondition lightCondition) {
    this.lightCondition = lightCondition;
  }

  public PlantMetadata waterCondition(WaterCondition waterCondition) {
    this.waterCondition = waterCondition;
    return this;
  }

  /**
   * Get waterCondition
   * @return waterCondition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public WaterCondition getWaterCondition() {
    return waterCondition;
  }

  public void setWaterCondition(WaterCondition waterCondition) {
    this.waterCondition = waterCondition;
  }

  public PlantMetadata wateringFrequency(WateringFrequency wateringFrequency) {
    this.wateringFrequency = wateringFrequency;
    return this;
  }

  /**
   * Get wateringFrequency
   * @return wateringFrequency
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public WateringFrequency getWateringFrequency() {
    return wateringFrequency;
  }

  public void setWateringFrequency(WateringFrequency wateringFrequency) {
    this.wateringFrequency = wateringFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlantMetadata plantMetadata = (PlantMetadata) o;
    return Objects.equals(this.soilCondition, plantMetadata.soilCondition) &&
        Objects.equals(this.lightCondition, plantMetadata.lightCondition) &&
        Objects.equals(this.waterCondition, plantMetadata.waterCondition) &&
        Objects.equals(this.wateringFrequency, plantMetadata.wateringFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soilCondition, lightCondition, waterCondition, wateringFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlantMetadata {\n");
    
    sb.append("    soilCondition: ").append(toIndentedString(soilCondition)).append("\n");
    sb.append("    lightCondition: ").append(toIndentedString(lightCondition)).append("\n");
    sb.append("    waterCondition: ").append(toIndentedString(waterCondition)).append("\n");
    sb.append("    wateringFrequency: ").append(toIndentedString(wateringFrequency)).append("\n");
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

