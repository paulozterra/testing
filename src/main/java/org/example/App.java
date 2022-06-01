package org.example;

import persona.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        Persona persona;
        LocalDate fechaNacimiento;
        LocalDate fechaConsulta;
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);

        fechaNacimiento = LocalDate.parse("06/24/2000", sdf);
        fechaConsulta = LocalDate.parse("06/23/2018", sdf);
        Period interval = Period.between(fechaNacimiento, fechaConsulta);
        System.out.println(interval.getYears());
    }
}
