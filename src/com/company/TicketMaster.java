package com.company;

import java.util.ArrayList;

public class TicketMaster {
  private ArrayList<Event> listeAfBegivenheder;


  public void addToListeAfBegivenheder(Event nytEvent) {
    listeAfBegivenheder.add(nytEvent);
  }

  public ArrayList<Event> getListeAfBegivenheder() {
    return listeAfBegivenheder;
  }

  public Event søgEventUdfraBeskrivelse(String beskriveleAfEvent) {

    for (Event begivenhed : listeAfBegivenheder) {
      if (beskriveleAfEvent.equals(begivenhed.getBeskrivelse())) {
        return begivenhed;
      }
    }
    return null;
  }


}
