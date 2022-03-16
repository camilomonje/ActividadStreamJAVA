import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {

    private String date;

    public Fecha(String date) {
        this.date = date;
    }

    public static LocalDate date(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date,formatter);
    }
}
