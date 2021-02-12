package domain.calculation;

import domain.MovieTicket;

import java.util.List;

public class GroupDiscount extends Discount{

    @Override
    public double groupDiscount(List<MovieTicket> tickets, double totalPrice) {

        for (MovieTicket ticket : tickets) {
            if (isWeekend(ticket) && tickets.size() > 5) {
                // Weekend en 6 of meer tickets
                return totalPrice * 0.90;
            }
        }

        return totalPrice;
    }

}
