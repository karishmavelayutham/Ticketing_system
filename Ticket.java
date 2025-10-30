package com.supportsystem;

public class Ticket {
    private static int counter = 1000;
    private int ticketId;
    private String issue;
    private String status;
    private String createdBy;
    private String assignedTo;

    public Ticket(String issue, String createdBy) {
        this.ticketId = counter++;
        this.issue = issue;
        this.status = "Open";
        this.createdBy = createdBy;
        this.assignedTo = "Not Assigned";
    }

    public int getTicketId() { return ticketId; }
    public String getIssue() { return issue; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getCreatedBy() { return createdBy; }
    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }

    public void displayTicket() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Issue: " + issue);
        System.out.println("Status: " + status);
        System.out.println("Created By: " + createdBy);
        System.out.println("Assigned To: " + assignedTo);
        System.out.println("---------------------------------");
    }
}
