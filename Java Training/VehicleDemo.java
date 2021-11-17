public class VehicleDemo {
    
    public static void main(String[] args){

        Vehicle[] fleet = new Vehicle[5];
        Vehicle vehicle;
        Automobile car;

        Taxi cab;

        vehicle = new Automobile("Honda", "Civic", 2005);
        vehicle.setMileage(10000);
        vehicle.setPlateNumber("ADMBTS");

        fleet[0] = vehicle;

        car = (Automobile) vehicle;
        car.setNumSeats(4);

        car.setMileage(10001);

        System.out.println(car.getMileage());
        System.out.println(vehicle.getMileage());

        fleet[1] = new Automobile("Toyota", "Corolla", 2004, 4, false);
        fleet[1].setMileage(15000);

        cab = new Taxi("Ford", "Focus", 2001, "TX1");

        System.out.println(cab.getMake());

        fleet[2] = cab;
        cab.setMileage(20000);

        System.out.println("Average Mileage: " + computeAverage(fleet));
    }

    private static double computeAverage(Vehicle[] fleet) {

        int totalMileage = 0;
        int cnt = 0;
        for (int i=0; i < fleet.length; i++){
            if (fleet[i] == null)
                continue;
            totalMileage += fleet[i].getMileage();
            cnt++;
        }

        return (double) totalMileage / cnt;
    }
}
