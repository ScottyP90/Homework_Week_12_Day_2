package Stalls;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownersName;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String ownersName, int parkingSpot,int rating) {
        this.name = name;
        this.ownersName = ownersName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getRating() {
        return rating;
    }
}
