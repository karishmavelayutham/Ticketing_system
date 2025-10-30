package com.supportsystem;

public class Agent extends user {
    public Agent(String name, String email) {
        super(name, email);
    }

    public void resolveTicket(Ticket ticket) {
        ticket.setStatus("Closed");
        System.out.println("Ticket " + ticket.getTicketId() + " closed by " + this.name);
    }
}
