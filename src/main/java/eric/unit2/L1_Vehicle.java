package eric.unit2;

import java.time.Year;

/*
 You have been hired to help a new car manufacturer that build compact cars, full size cars, pick-up truck, and minivans 
 to create a program that allow them to record� the manufacturing year, model, engine size, color, type of fuel, and number 
 of seats for each vehicle they build. So you decided to create a java class named vehicle to accomplish this purpose. 
 Write the java class that meets these requirements.
 
Hint: At this point, there is no staring point or output for your code
*/

@SuppressWarnings("unused")
class Vehicle {
    private Year manufactured;
    private String model;
    private int engineSizeInML;
    private Color color;
    private FuelType fuel;
    private int numSeats;

    public Vehicle(Year manufactured, String model, int engineSizeInML, Color color, FuelType fuel, int numSeats) {
        this.manufactured = manufactured;
        this.model = model;
        this.engineSizeInML = engineSizeInML;
        this.color = color;
        this.fuel = fuel;
        this.numSeats = numSeats;
    }
}

enum FuelType {
    DIESEL, GAS, PETROLEUM, ETHANOL, BIODIESEL
}

class Color {
    public int R;
    public int G;
    public int B;
}
