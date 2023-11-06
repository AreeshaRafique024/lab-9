class Passenger {
    private Location location;

    public Passenger(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "location=" + location +
                '}';
    }
}
