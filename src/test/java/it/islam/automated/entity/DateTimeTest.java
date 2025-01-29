package it.islam.automated.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeTest {

    @Test
    void testDateTimeConstructor() {
        // Data e ora per il test
        LocalDateTime now = LocalDateTime.of(2025, 1, 29, 14, 30, 45);

        // Crea un'istanza della classe
        DateTime dateTime = new DateTime(now);

        // Verifica il formato della data
        String expectedDate = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        assertEquals(expectedDate, dateTime.getDate(), "La data non è formattata correttamente");

        // Verifica il formato dell'ora
        String expectedTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        assertEquals(expectedTime, dateTime.getTime(), "L'orario non è formattato correttamente");
    }

    @Test
    void testGettersAndSetters() {
        DateTime dateTime = new DateTime();

        // Test dell'ID
        dateTime.setId(100L);
        assertEquals(100L, dateTime.getId(), "L'ID non è stato impostato correttamente");
    }
}