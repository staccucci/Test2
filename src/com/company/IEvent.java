package com.company;

/**
 * Created by sylvain on 2016-12-10.
 */
public interface IEvent {

    void ProcessEvent(String eventName);
    String getEventName();

}
