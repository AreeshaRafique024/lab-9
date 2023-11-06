import java.util.ArrayList;
import java.util.List;
class Manager {
    public ArrayList<Ride> rides;

    public Manager() {
        rides = new ArrayList<>();
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public double findDistance(Ride ride, Passenger passenger) {
        return ride.getLocation().distance(passenger.getLocation());
    }

    public Ride findNearestRide(Passenger passenger) {
        Ride nearestRide = null;
        double minDistance = 0;

        for (Ride ride : rides) {
            if (ride.rideAvailable()) {
                double distance = findDistance(ride, passenger);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestRide = ride;
                }
            }
        }

        return nearestRide;
    }
}





