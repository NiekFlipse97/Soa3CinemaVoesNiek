package domain.calculation;

import domain.MovieTicket;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

public abstract class Discount {

    public double groupDiscount(List<MovieTicket> tickets, double totalPrice) {
        return 0;
    }

    public double weekendTicketDiscount(List<MovieTicket> tickets) {
        return 0;
    }

    public boolean isWeekend(MovieTicket ticket) {
        LocalDateTime screeningDate = ticket.getMovieScreeningDate();
        DayOfWeek day = screeningDate.getDayOfWeek();

        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

}
