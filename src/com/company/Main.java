package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TicketMaster myTicketMaster = new TicketMaster();
        Event roskildeFestival = new Event("Roskilde Festival",2050,2);
        myTicketMaster.addToListeAfBegivenheder(roskildeFestival);

        System.out.println(myTicketMaster.købBilletterTilEvent("Roskilde Festival",2));
        System.out.println(myTicketMaster.købBilletterTilEvent("Roskilde Festival",6));
    }
}
