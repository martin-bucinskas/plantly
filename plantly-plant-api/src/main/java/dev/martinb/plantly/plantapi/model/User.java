package dev.martinb.plantly.plantapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
public class User   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("dateRegistered")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateRegistered;

  @JsonProperty("dateLastLoggedIn")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateLastLoggedIn;

  @JsonProperty("plants")
  @Valid
  private List<UUID> plants = null;

  public User id(UUID id) {
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

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "John Doe", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@javax.validation.constraints.Email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User dateRegistered(LocalDate dateRegistered) {
    this.dateRegistered = dateRegistered;
    return this;
  }

  /**
   * Get dateRegistered
   * @return dateRegistered
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateRegistered() {
    return dateRegistered;
  }

  public void setDateRegistered(LocalDate dateRegistered) {
    this.dateRegistered = dateRegistered;
  }

  public User dateLastLoggedIn(LocalDate dateLastLoggedIn) {
    this.dateLastLoggedIn = dateLastLoggedIn;
    return this;
  }

  /**
   * Get dateLastLoggedIn
   * @return dateLastLoggedIn
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateLastLoggedIn() {
    return dateLastLoggedIn;
  }

  public void setDateLastLoggedIn(LocalDate dateLastLoggedIn) {
    this.dateLastLoggedIn = dateLastLoggedIn;
  }

  public User plants(List<UUID> plants) {
    this.plants = plants;
    return this;
  }

  public User addPlantsItem(UUID plantsItem) {
    if (this.plants == null) {
      this.plants = new ArrayList<>();
    }
    this.plants.add(plantsItem);
    return this;
  }

  /**
   * Get plants
   * @return plants
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<UUID> getPlants() {
    return plants;
  }

  public void setPlants(List<UUID> plants) {
    this.plants = plants;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.dateRegistered, user.dateRegistered) &&
        Objects.equals(this.dateLastLoggedIn, user.dateLastLoggedIn) &&
        Objects.equals(this.plants, user.plants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, dateRegistered, dateLastLoggedIn, plants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dateRegistered: ").append(toIndentedString(dateRegistered)).append("\n");
    sb.append("    dateLastLoggedIn: ").append(toIndentedString(dateLastLoggedIn)).append("\n");
    sb.append("    plants: ").append(toIndentedString(plants)).append("\n");
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

