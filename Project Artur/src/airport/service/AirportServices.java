package airport.service;

import airport.model.Plane;

public class AirportServices {
    public void printNameAndReleaseDate(Plane plane){
        System.out.println(plane.getName()+" "+plane.getReleaseYear());
    }
}
