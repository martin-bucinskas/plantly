package dev.martinb.plantly.plantapi.api;

import dev.martinb.plantly.plantapi.model.Plant;
import dev.martinb.plantly.plantapi.model.PlantImage;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PlantApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
public interface PlantApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /plants/{id} : Delete a plant
     * Deletes a plant record
     *
     * @param id Plant id (required)
     * @return Deleted plant no content response (status code 204)
     * @see PlantApi#deletePlant
     */
    default ResponseEntity<Void> deletePlant(UUID id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /plants/{id}/image : Delete a plant image
     * Delete a plant image
     *
     * @param id Plant id (required)
     * @return Deleted plant image response (status code 204)
     * @see PlantApi#deletePlantImage
     */
    default ResponseEntity<Void> deletePlantImage(UUID id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /plants/{id} : Edit details of a plant
     * Update the details of a single plant
     *
     * @param id Plant id (required)
     * @param plant  (required)
     * @return Successful plant update (status code 200)
     * @see PlantApi#editPlantData
     */
    default ResponseEntity<Plant> editPlantData(UUID id,
        Plant plant) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"metadata\" : { \"wateringFrequency\" : { \"cronString\" : \"30 8 * * 6\" } }, \"imageId\" : \"eff68180-4cd4-4872-ad1b-82df430dd640\", \"scientificName\" : \"Epipremnum aureum\", \"name\" : \"Devils Ivy\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"dateAdded\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /plants : Returns a list of plants for user
     * Returns a list of all registered plants for a user
     *
     * @return A JSON array of plants (status code 200)
     * @see PlantApi#getAllPlants
     */
    default ResponseEntity<List<Plant>> getAllPlants() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"metadata\" : { \"wateringFrequency\" : { \"cronString\" : \"30 8 * * 6\" } }, \"imageId\" : \"eff68180-4cd4-4872-ad1b-82df430dd640\", \"scientificName\" : \"Epipremnum aureum\", \"name\" : \"Devils Ivy\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"dateAdded\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /plants/{id} : Get plant details
     * Get details of a specific plant
     *
     * @param id Plant id (required)
     * @return Plant response (status code 200)
     * @see PlantApi#getPlant
     */
    default ResponseEntity<Plant> getPlant(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"metadata\" : { \"wateringFrequency\" : { \"cronString\" : \"30 8 * * 6\" } }, \"imageId\" : \"eff68180-4cd4-4872-ad1b-82df430dd640\", \"scientificName\" : \"Epipremnum aureum\", \"name\" : \"Devils Ivy\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"dateAdded\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /plants/{id}/image : Get the plant image
     * Get a plant image by id
     *
     * @param id Plant id (required)
     * @return Plant image response (status code 200)
     * @see PlantApi#getPlantImage
     */
    default ResponseEntity<PlantImage> getPlantImage(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : \"data\", \"plantId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"dateAdded\" : \"2000-01-23\", \"dateUpdated\" : \"2000-01-23\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plants : Register a new plant
     * Register a new plant
     *
     * @param plant  (required)
     * @return Plant registered response (status code 201)
     * @see PlantApi#registerPlant
     */
    default ResponseEntity<Void> registerPlant(Plant plant) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plants/{id}/image : Set a plant image
     * Set an image for a plant
     *
     * @param id Plant id (required)
     * @return Plant image created response (status code 201)
     * @see PlantApi#setPlantImage
     */
    default ResponseEntity<Void> setPlantImage(UUID id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
