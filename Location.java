public class Location {
    public double x;
    public double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
