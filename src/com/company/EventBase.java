package com.company;

/**
 * Created by sylvain on 2016-12-10.
 *
 * Classe de base pour la gestion des événements
 */
public class EventBase implements IEvent {


    private String eventName;

    /*
     * Constructeur pour tester une patente d'héritage
     */
    public EventBase() {
        System.out.println("Dans le constructeur de EventBase");
    }


    @Override
    public void ProcessEvent(String eventName) {
            this.eventName = eventName;
    }

    @Override
    public String getEventName() {
        return eventName;
    }
}
