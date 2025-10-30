package com.supportsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketManager manager = new TicketManager();

        Customer c1 = new Customer("Karishma", "karishma@gmail.com");
        Agent a1 = new Agent("Ravi", "ravi@support.com");

        while (true) {
            System.out.println("\n=== SUPPORT TICKETING SYSTEM ===");
            System.out.println("1. Create Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Assign Ticket");
            System.out.println("4. Resolve Ticket");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter issue description: ");
                    String issue = sc.nextLine();
                    Ticket t = c1.createTicket(issue);
                    manager.addTicket(t);
                    break;

                case 2:
                    manager.showAllTickets();
                    break;

                case 3:
                    System.out.print("Enter Ticket ID to assign: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    manager.assignTicket(id, a1.getName());
                    break;

                case 4:
                    System.out.print("Enter Ticket ID to resolve: ");
                    int resolveId = sc.nextInt();
                    sc.nextLine();
                    for (Ticket tk : manager.getTickets()) {
                        if (tk.getTicketId() == resolveId) {
                            a1.resolveTicket(tk);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

