package dev.martinb.plantly.plantapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WateringFrequency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
public class WateringFrequency   {
  @JsonProperty("cronString")
  private String cronString;

  public WateringFrequency cronString(String cronString) {
    this.cronString = cronString;
    return this;
  }

  /**
   * Get cronString
   * @return cronString
  */
  @ApiModelProperty(example = "30 8 * * 6", required = true, value = "")
  @NotNull


  public String getCronString() {
    return cronString;
  }

  public void setCronString(String cronString) {
    this.cronString = cronString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WateringFrequency wateringFrequency = (WateringFrequency) o;
    return Objects.equals(this.cronString, wateringFrequency.cronString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WateringFrequency {\n");
    
    sb.append("    cronString: ").append(toIndentedString(cronString)).append("\n");
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

