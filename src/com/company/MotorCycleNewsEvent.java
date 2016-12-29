package com.company;

/**
 * Created by sylvain on 2016-12-10.
 * Classe pour enregistrer les nouvelles dans le mode de la moto
 */
public class MotorCycleNewsEvent extends EventBase implements IEvent{

    public String getIt() {
        return "MotorCycleNewsEvent";
    }

}
