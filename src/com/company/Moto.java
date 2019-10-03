package com.company;

/**
 * Created by sylvain on 2016-11-20.
 * Pojo pour gérer une moto
 */
public class Moto implements IMoto {
    private String model;

    private String manufacturier;
    private int hp;
    private int torque;
    private int poid;

    private ModelType modelType;

    public enum ModelType {SuperSport, Sport, Naked, Aventure, Enduro, MotoCross};

    public String getManufacturier() {
        return manufacturier;
    }

    public void setManufacturier(String manufacturier) {

        this.manufacturier = manufacturier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getHp() {

        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public int getTorque() {

        return torque;
    }

    public void setTorque(int torque) {

        this.torque = torque;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {

        this.poid = poid;
    }

    public ModelType getModelType() {

        return modelType;
    }

    public void setModelType(ModelType modelType) {

        this.modelType = modelType;
    }

    @Override
    public int getRatingInfo() {

        return 1121;
    }


    /**
     *
     * @param _agilite: indique le niveau d'agilité de la moto
     * @return: retourne le niveau d'agilité de la moto
     */
    public int getAgilite(int _agilite) {

        switch (_agilite) {

            case 0: {
                return 10;
            }

            default: {
                return 0;
            }
        }
    }


}
