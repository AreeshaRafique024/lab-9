

public class Main {
    public static void main(String[] args) {
        Passenger p1=new Passenger(new Location(10,11));
        Ride r1=new Ride(4231,true,new Location(10,12));
        Ride r2=new Ride(4231,true,new Location(10,12));

        Manager rideManager = new Manager();
        rideManager.addRide(r1);
        rideManager.addRide(r2);


        Ride nearestRide = rideManager.findNearestRide(p1);
        if (nearestRide != null) {
            System.out.println("Nearest Ride for Passenger: Ride " + nearestRide.getId());
        } else {
            System.out.println("No available rides nearby.");
        }
    }
}

