package com.economy.infrastructure.api.rest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/health")
public class HealthResource {
    //Classe feita para lidar com um erro do render
    @GET
    public String health() {
        return "OK";
    }
}