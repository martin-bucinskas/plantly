package dev.martinb.plantly.plantapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:31:33.358Z[Europe/London]")
@Controller
@RequestMapping("${openapi.plantly.base-path:/v1}")
public class PlantApiController implements PlantApi {

    private final PlantApiDelegate delegate;

    public PlantApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PlantApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PlantApiDelegate() {});
    }

    @Override
    public PlantApiDelegate getDelegate() {
        return delegate;
    }

}
