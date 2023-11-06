class Ride {
    private int id;
    private boolean availability;
    private Location location;

    public Ride(int id, boolean availability, Location location) {
        this.id = id;
        this.availability = availability;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public boolean rideAvailable() {
        return availability;
    }

    public Location getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", availability=" + availability +
                ", location=" + location +
                '}';
    }
}
