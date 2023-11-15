public class Taxi {
    private int id ;
    Location location;
    private int availability;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }


    public Taxi(int id, Location location, int availability) {
        this.id = id;
        this.location = location;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", location=" + location +
                ", availability=" + availability +
                '}';
    }
}
