package persona;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PersonaTest extends TestCase {
    Persona persona;
    LocalDate fechaNacimiento;
    LocalDate fechaConsulta;
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
    @BeforeEach
    public void setUp() throws ParseException {
        fechaNacimiento = LocalDate.parse("06/24/2000", sdf);
        fechaConsulta = LocalDate.parse("06/23/2018", sdf);
        persona = new Persona("Alexander","Morales Panitz", fechaNacimiento, fechaConsulta);
    }

    @Test
    @DisplayName("¿Es mayor de edad?")
    public void testMayorDeEdad() throws ParseException {
        assertFalse("Es menor de edad", persona.esMayorDeEdad());
    }
    @Test
    public void testgetname() throws ParseException{
         assertEquals("Alexander",persona.getName());
    }
    @Test
    public void testgetlastname() throws ParseException {
        assertEquals("Morales Panitz",persona.getLastName());
    }
    @Test
    public void testgetnacimiento() throws ParseException{
        assertNotNull(persona.getNacimiento());
    }
    @Test
    public void testgetconsulta() throws ParseException{
        assertNotNull(persona.getConsulta());
    }

    @Test
    public void testsetname()throws ParseException {
        persona.setName("paulo");
        assertEquals(persona.getName(),"paulo");
    }

    @Test
    public void testsetlastname()throws ParseException{
        persona.setLastName("Cuaresma Puclla");
        assertEquals(persona.getLastName(),"Cuaresma Puclla");
    }

    @Test
    public void testsetconsulta()throws ParseException{
        persona.setConsulta(LocalDate.parse("03/01/2018", sdf));
        assertEquals(persona.getConsulta(),LocalDate.parse("03/01/2018", sdf));
    }

    @Test
    public void testsetnacimiento()throws ParseException{
        persona.setNacimiento(LocalDate.parse("02/29/2000", sdf));
        assertEquals(persona.getNacimiento(),LocalDate.parse("02/29/2000", sdf));
    }
}

