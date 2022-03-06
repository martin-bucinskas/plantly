package dev.martinb.plantly.plantapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WateringRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
public class WateringRecord   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("plantId")
  private UUID plantId;

  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("amount")
  private BigDecimal amount;

  public WateringRecord id(UUID id) {
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

  public WateringRecord plantId(UUID plantId) {
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

  public WateringRecord date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public WateringRecord amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of water added (ml)
   * minimum: 0
   * maximum: 1000
   * @return amount
  */
  @ApiModelProperty(required = true, value = "Amount of water added (ml)")
  @NotNull

  @Valid
@DecimalMin("0") @DecimalMax("1000") 
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WateringRecord wateringRecord = (WateringRecord) o;
    return Objects.equals(this.id, wateringRecord.id) &&
        Objects.equals(this.plantId, wateringRecord.plantId) &&
        Objects.equals(this.date, wateringRecord.date) &&
        Objects.equals(this.amount, wateringRecord.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plantId, date, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WateringRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plantId: ").append(toIndentedString(plantId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

