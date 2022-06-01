package persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Persona {
    private String name;
    private String lastName;
    public static String pattern = "MM/dd/yyyy";

    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
    LocalDate consulta;
    LocalDate nacimiento;

    public Persona(String name, String lastName, LocalDate consulta, LocalDate nacimiento) {
        this.name = name;
        this.lastName = lastName;
        this.consulta = consulta;
        this.nacimiento = nacimiento;
    }

    public boolean esMayorDeEdad() throws ParseException {
        Period interval = Period.between(nacimiento,consulta);
        return (interval.getYears() >= 18);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getConsulta() {
        return consulta;
    }

    public void setConsulta(LocalDate consulta) {
        this.consulta = consulta;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}
