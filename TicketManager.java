package com.supportsystem;

import java.util.ArrayList;

public class TicketManager {
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Ticket created successfully!");
    }

    public void assignTicket(int id, String agentName) {
        for (Ticket t : tickets) {
            if (t.getTicketId() == id) {
                t.setAssignedTo(agentName);
                System.out.println("Ticket " + id + " assigned to " + agentName);
                return;
            }
        }
        System.out.println("Ticket ID not found.");
    }

    public void showAllTickets() {
        for (Ticket t : tickets) {
            t.displayTicket();
        }
    }

    // helper to let Main access tickets (optional)
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
