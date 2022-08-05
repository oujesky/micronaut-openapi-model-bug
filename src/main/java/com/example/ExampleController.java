package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/example")
public class ExampleController {

    @Get
    public ExampleModel getExample() {
        return new ExampleModel();
    }

}
