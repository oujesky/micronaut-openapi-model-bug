package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.swagger.v3.oas.annotations.media.Schema;

@Introspected
public class ExampleModel {

    @JsonProperty("nameInJson")
    @Schema(description = "example field")
    private String nameInPojo;

    public String getNameInPojo() {
        return nameInPojo;
    }
}
