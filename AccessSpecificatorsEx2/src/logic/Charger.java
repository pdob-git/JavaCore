package logic;

import model.Telephone;

public class Charger {
    public Charger() {
    }

    public void charge(Telephone telephone){
        int chargeLevel = telephone.getChargeLevel() + 1;
        telephone.setChargeLevel(chargeLevel);
    }
}
