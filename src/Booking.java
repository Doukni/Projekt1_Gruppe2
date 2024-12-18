import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    String name;
    LocalDate bookingDate;
    LocalTime bookingTime;

    Booking(String name, LocalDate bookingDate, LocalTime bookingTime) {
        this.name = name;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
    }

    public String toString() {
        return "Date: " + bookingDate + ", Time: " + bookingTime  + ", Name: " + name ;    // Date, time, name - nemmer at kigge igennem i en liste
    }
}

