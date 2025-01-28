package it.islam.automated.service;

import it.islam.automated.entity.DateTime;
import it.islam.automated.repository.DateTimeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class DateTimeService {
    private final DateTimeRepository dateTimeRepository;

    public DateTimeService(DateTimeRepository dateTimeRepository) {
        this.dateTimeRepository = dateTimeRepository;
    }


    public List<DateTime> getAll() {
        return dateTimeRepository.findAll();
    }

    public DateTime getDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTime dateTime = new DateTime(now);
        dateTimeRepository.save(dateTime);
        return dateTime;
    }
}
