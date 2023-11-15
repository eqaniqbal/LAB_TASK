import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        ArrayList<Taxi> al = new ArrayList<>();
        Taxi taxi = new Taxi(0,new Location(2,3),0);
        Taxi taxi1= new Taxi(1,new Location(8,5),1);
        Taxi taxi2 = new Taxi(2, new Location(4,6),1);
        al.add(taxi);
        al.add(taxi1);
        al.add(taxi2);
        System.out.println(al);
        manager.nearLocation(al,new Location(3,6));
        System.out.println(manager.nearLocation(al,new Location(1,2)));
        System.out.println(manager.calFare(new Location(8,6),new Location(2,9)));


     }
}
