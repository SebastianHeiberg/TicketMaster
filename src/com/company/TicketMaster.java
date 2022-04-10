package com.company;

import java.util.ArrayList;

public class TicketMaster {
  private ArrayList<Event> listeAfBegivenheder;

  public TicketMaster(){
    this.listeAfBegivenheder = new ArrayList<>();
  }

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


  public Billettilgængelighed billettilgængelighed (String beskrivelse, int antalØsnkedeBilletter){

    Event fundetEvent = søgEventUdfraBeskrivelse(beskrivelse);
    int tilgængeligeBilletter;

    if (fundetEvent == null){
      return Billettilgængelighed.EVENT_IKKE_FUNDET;
    } else {
      tilgængeligeBilletter = fundetEvent.getBilletter();
    }

    if (tilgængeligeBilletter == 0) {
      return Billettilgængelighed.EVENT_UDSOLGT;
    } else if (tilgængeligeBilletter < antalØsnkedeBilletter) {
      return Billettilgængelighed.IKKE_NOK_BILLETTER_TIL_SALG;
    } else {
      return Billettilgængelighed.BILLETTER_LEDIGE;
    }
  }

  public int købBilletterTilEvent (String beskrivelse, int antalØnskedeBilletter){

    Event ønsketEvent = søgEventUdfraBeskrivelse(beskrivelse);

    if (ønsketEvent == null){
      System.out.println(Billettilgængelighed.EVENT_IKKE_FUNDET);
      return 0;
    }

    Billettilgængelighed billetter = billettilgængelighed(beskrivelse,antalØnskedeBilletter);

    if (billetter == Billettilgængelighed.BILLETTER_LEDIGE) {
      ønsketEvent.setBilletter(antalØnskedeBilletter);
      System.out.println("Den samlede pris på din(e) billet(ter) til " + ønsketEvent.getBeskrivelse() + " er: ");
      return ønsketEvent.getBilletpris() * antalØnskedeBilletter;
    } else {
      System.out.println(billetter);
      return 0;
    }





  }



}
