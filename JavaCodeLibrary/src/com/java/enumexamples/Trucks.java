package com.java.enumexamples;

enum Trucks implements com.java.enumexamples.IVehicle
{

    MahindraStorm
            {
                String color()
                {
                    return "Red";
                }
                @Override
                double loadFactor() {
                    return 0.75;
                }

                @Override
                int count() {
                    return 0;
                }

                @Override
                public double speed(int miles, int hour) {
                    System.out.println("MahindraStorm FIRST");
                    return miles /(hour * loadFactor());
                }
            },
    TATAWARROR
            {
                @Override
                double loadFactor() {
                    return 2;
                }

                @Override
                int count() {
                    return 0;
                }

                @Override
                public double speed(int miles, int hour) {
                    System.out.println("TATAWARROR SECOND");

                    return miles /(hour * loadFactor());

                }
            },
    PIAGGIORANGER
            {
                @Override
                double loadFactor() {
                    return 3;
                }

                @Override
                int count() {
                    return 0;
                }

                @Override
                public double speed(int miles, int hour) {
                    System.out.println("PIAGGIORANGER THIRD");
                    return miles /(hour * loadFactor());

                }
            };
    abstract double loadFactor();
    abstract int count();

    @Override
    public double speed(int miles, int hour) {
        System.out.println("MAIN SPEED METHOD");
        return miles/(hour);
    }

    @Override
    public int mileage(int costOfFuel, int miles) {
        System.out.println("MAIN MILEAGE METHOD");

        return  miles / (costOfFuel * 10);
    }
}
class MainClass {

    public static void main(String args[])
    {
        // See Main speed method will never be executed
        for(Trucks truck : Trucks.values())
        {
            System.out.println("Speed of " + truck.name()+ ": " + truck.speed(10000,30));  //Accessing enums directly using class name
            System.out.println("Mileage of " + truck.name()+ ": " + truck.mileage(10,10000));
            System.out.println("ordinal: "+ truck.ordinal());
        }
    }

}
