package FechaConsulta;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import persona.FechaConsulta;
import persona.Persona;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaConsultaTest extends TestCase {
    FechaConsulta fc;
    int day;
    int month;
    int year;

    @BeforeEach
    public void setUp() throws ParseException {
        day=1;
        month=6;
        year=2022;
        fc = new FechaConsulta(day,month,year);
    }

    @Test
    public void testgetDay() throws ParseException {
        assertEquals(1, fc.getDay());
    }
    @Test
    public void testsetDay() throws ParseException{
        fc.setDay(4);
        assertEquals(4,fc.getDay());
    }
    @Test
    public void testgetMonth() throws ParseException {
        assertEquals(6,fc.getMonth());
    }
    @Test
    public void testsetMonth() throws ParseException{
        fc.setMonth(12);
        assertEquals(12,fc.getMonth());
    }
    @Test
    public void testgetYear() throws ParseException{
        assertEquals(2022,fc.getYear());
    }

    @Test
    public void testsetYear()throws ParseException {
        fc.setYear(2020);
        assertEquals(2020,fc.getYear());
    }

}

