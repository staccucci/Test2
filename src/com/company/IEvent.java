package com.company;

/**
 * Created by sylvain on 2016-12-10.
 * Interface pour implémenter un event
 */
public interface IEvent {

    void ProcessEvent(String eventName);
    String getEventName();

}
