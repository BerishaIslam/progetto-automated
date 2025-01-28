package it.islam.automated.DTO.responses;

import jakarta.annotation.Nullable;

public class GenericResponse <T>{
    private T data;
    private String error;
    private Integer status;

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