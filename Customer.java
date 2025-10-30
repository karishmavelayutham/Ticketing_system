package com.supportsystem;

public class Customer extends user {
    public Customer(String name, String email) {
        super(name, email);
    }

    public Ticket createTicket(String issue) {
        return new Ticket(issue, this.name);
    }
}
