package domain.calculation.audience;

import domain.MovieTicket;
import domain.Order;
import domain.calculation.Discount;
import domain.calculation.GroupDiscount;
import domain.calculation.WeekendTicketDiscount;

import java.util.List;

public class NormalPerson implements ITargetAudience{
    private Discount weekendTicketDiscount;
    private Discount groupDiscount;

    public NormalPerson() {
        this.weekendTicketDiscount = new WeekendTicketDiscount();
        this.groupDiscount = new GroupDiscount();
    }

    @Override
    public double calculatePrice(Order order) {
        double totalPrice = 0;
        List<MovieTicket> tickets = order.getTickets();

        totalPrice += weekendTicketDiscount.weekendTicketDiscount(tickets);
        totalPrice = groupDiscount.groupDiscount(tickets, totalPrice);

        return totalPrice;
    }
}
