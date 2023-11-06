public class Location {
   private final int x;
   private final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double distance(Location location) {
        int X = this.x - location.x;
        int Y = this.y - location.y;
        return Math.sqrt((X*X + Y*Y)) ;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
