package ThemePark;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> attractions;


    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<IReviewed>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public int countAttractions(){
        return this.attractions.size();
    }

    public void addStall(Stall stall){
        this.attractions.add(stall);
    }

    public String visit(Visitor visitor, Attraction attraction){
        if (this.attractions.contains(attraction)){
            return visitor.getVisitorName() + " has visited the " + attraction.getName();
        }
        return "That ride is not available here";
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.attractions;
    }


}
