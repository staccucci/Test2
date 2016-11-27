package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ceci est un test de marde");

        /// On est loin de C++ ici!!!

        if (args.length > 0 && (args[0].equals("Sylvain"))) {
             System.exit(24);
        }

        Moto r1 = new Moto();

        r1.setModel("R1");
        r1.setManufacturier("Yamaha");
        r1.setHp(198);
        r1.setTorque(183);
        r1.setModelType(Moto.ModelType.SuperSport);

        String marde, marde1;

        marde = "Java as a language";
        marde1 = "Java as a language";

        if (marde.compareTo(marde1) == 0) {

            System.out.println("Those fuckers are equal");
        }



    }
}
