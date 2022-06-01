package FechaNacimiento;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import persona.FechaConsulta;
import persona.FechaNacimiento;
import persona.Persona;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaNacimientoTest extends TestCase {
    FechaNacimiento fn;
    int day;
    int month;
    int year;

    @BeforeEach
    public void setUp() throws ParseException {
        day=27;
        month=12;
        year=1999;
        fn = new FechaNacimiento(day,month,year);
    }

    @Test
    public void testgetDay() throws ParseException {
        assertEquals(27, fn.getDay());
    }
    @Test
    public void testsetDay() throws ParseException{
        fn.setDay(12);
        assertEquals(12,fn.getDay());
    }
    @Test
    public void testgetMonth() throws ParseException {
        assertEquals(12,fn.getMonth());
    }
    @Test
    public void testsetMonth() throws ParseException{
        fn.setMonth(7);
        assertEquals(7,fn.getMonth());
    }
    @Test
    public void testgetYear() throws ParseException{
        assertEquals(1999,fn.getYear());
    }

    @Test
    public void testsetYear()throws ParseException {
        fn.setYear(1990);
        assertEquals(1990,fn.getYear());
    }

}

