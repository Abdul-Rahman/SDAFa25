package w01ex08PolymorphismStatic;

class VehicleHorn {
    // Horn for car
    void horn(String vehicleType) {
        System.out.println(vehicleType + " horn: Beep Beep!");
    }
    // Horn for bike
    void horn(String vehicleType, int times) {
        System.out.print(vehicleType + " horn: ");
        for (int i = 0; i < times; i++) {
            System.out.print("Peep ");
        }
        System.out.println();
    }
    // Horn for bus (louder with extra info)
    void horn(String vehicleType, boolean pressureHorn) {
        if (pressureHorn) {
            System.out.println(vehicleType + " horn: HONK HONK!");
        } else {
            System.out.println(vehicleType + " horn: honk...");
        }
    }
    
    public static void main(String[] args) {
        VehicleHorn vh = new VehicleHorn();
        // Car horn
        vh.horn("Car");
        vh.horn("Bike", 3); // Bike horn, peep 3 times
        vh.horn("Bike", 1); // Bike horn, peep 1 time
        vh.horn("Bus", true); // Bus horn, pressure horn - loud
        vh.horn("Bus", false); // Bus horn, normal
    }
}
