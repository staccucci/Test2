package com.company;

/**
 * Created by sylvain on 2016-12-10.
 *
 * Classe de base pour la gestion des événements
 */
public class EventBase implements IEvent {


    private String eventName;

    @Override
    public void ProcessEvent(String eventName) {
            this.eventName = eventName;
    }


}
