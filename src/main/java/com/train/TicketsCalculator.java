package com.train;

public class TicketsCalculator {
    private int ticket;
    private int returnTicket;
    private Double total;

    public TicketsCalculator(int ticket, int returnTicket) {
        this.ticket = ticket;
        this.returnTicket = returnTicket;
        this.total = (ticket - returnTicket) * 1000 + (returnTicket * 2000) * 0.9;
    }

    public void print(){
        System.out.println("Total tickts: " + ticket + "\n" +
                "Roun-trip: " + returnTicket + "\n" +
                "Total: " + total.intValue());
    }
}
