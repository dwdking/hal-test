package com.example.haltest.haltest;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "brief", types = SomeEntity.class)
public interface Brief {

    String getMessage();

}
