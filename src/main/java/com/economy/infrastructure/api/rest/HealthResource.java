package com.economy.infrastructure.api.rest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HealthResource {
    //Classe feita para lidar com um erro do render
    @GET
    public String home() {
        return "eco-nomy API is running";
    }
}