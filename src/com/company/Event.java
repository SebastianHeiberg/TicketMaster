package com.company;

public class Event {

  private String beskrivelse;
  private int billetter;
  private int billetpris;

  public Event(String beskrivelse, int billetpris, int billetter) {
    this.beskrivelse = beskrivelse;
    this.billetpris = billetpris;
    this.billetter = billetter;
  }

  public String getBeskrivelse(){
    return beskrivelse;
  }
}
