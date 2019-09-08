package com.java.enumexamples;

enum Cars implements IVehicle{

   // ; // Try defining enums you will See semicolon is required here even without defining any enum
    ALTO(1000,3,40), WAGONR(2000,3,4), FIGO(1000,5,40), CIAZ(9000,3,40);

    Cars(int miles, int hour, int costOfFuel ){
        this.miles = miles;
        this.hour = hour;
        this.costOfFuel = costOfFuel;

    }
    int miles; int hour; int costOfFuel;

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getcostOfFuel() {
        return costOfFuel;
    }

    public void setcostOfFuel(int costOfFuel) {
        this.costOfFuel = costOfFuel;
    }

    @Override
    public double speed(int miles, int hour) {
        return miles/hour;
    }

    @Override
    public int mileage(int costOfFuel, int miles) {
        return  miles / costOfFuel;
    }
}

class MainEnumMethodClass
        {

            public static void main(String[] args)
            {
                for(Cars car : Cars.values()) {
                    System.out.println("Speed of " + car.name()+ ": " + car.speed(car.getMiles(),car.getHour()));  //Accessing enums directly using class name
                    System.out.println("Mileage of " + car.name()+ ": " + car.mileage(car.getcostOfFuel(),car.getMiles()));
                }

            }
        }
