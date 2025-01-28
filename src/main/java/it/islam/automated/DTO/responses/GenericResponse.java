package it.islam.automated.DTO.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;

public class GenericResponse <T>{
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("error")
    private String error;
    @JsonProperty("data")
    private T data;

    public GenericResponse(Integer status, @Nullable String error, @Nullable T data){
        this.status = status;
        this.error = error;
        this.data = data;
    }
    public GenericResponse(Integer status, @Nullable String error){
        this.status = status;
        this.error = error;
    }
}