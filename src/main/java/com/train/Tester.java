package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.println("Please enter number of tickets:");
            int ticket = scanner.nextInt();
            if (ticket == -1)
                break;
            System.out.println("How many round-trip tickets:");
            int returnTicket = scanner.nextInt();
            if (returnTicket == -1)
                break;
            new TicketsCalculator(ticket, returnTicket).print();
        }
    }
}
