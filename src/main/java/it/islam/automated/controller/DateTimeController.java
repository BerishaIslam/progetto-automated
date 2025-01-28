package it.islam.automated.controller;

import it.islam.automated.DTO.responses.GenericResponse;
import it.islam.automated.entity.DateTime;
import it.islam.automated.service.DateTimeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DateTimeController {
    private final DateTimeService dateTimeService;

    public DateTimeController(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    @PostMapping("/get-date-time")
    public GenericResponse<DateTime> printDateTime (){
        return new GenericResponse<>(HttpStatus.OK.value(), null, dateTimeService.getDateTime());
    }

    @GetMapping("/get-history")
    public GenericResponse<List<DateTime>> printHistory() {
        return new GenericResponse<>(HttpStatus.OK.value(), null, dateTimeService.getAll());
    }
}
