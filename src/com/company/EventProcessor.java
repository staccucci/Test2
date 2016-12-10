package com.company;

/**
 * Created by sylvain on 2016-12-10.
 */
public class EventProcessor {

    static public void ProcessEvent(IEvent event) {

        System.out.println(event.getEventName());

    }

}
