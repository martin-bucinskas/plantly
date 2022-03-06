package dev.martinb.plantly.plantapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SoilCondition
 */
public enum SoilCondition {
  
  SANDY("sandy"),
  
  CLAY("clay"),
  
  SILT("silt"),
  
  PEAT("peat"),
  
  CHALK("chalk"),
  
  LOAM("loam");

  private String value;

  SoilCondition(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SoilCondition fromValue(String value) {
    for (SoilCondition b : SoilCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

