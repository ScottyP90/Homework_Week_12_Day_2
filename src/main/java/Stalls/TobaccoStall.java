package Stalls;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownersName, int parkingSpot, int rating) {
        super(name, ownersName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 17){
            return true;
        }
        return false;
    }
}
