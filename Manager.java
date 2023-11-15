import java.util.ArrayList;

    public class Manager {
        ArrayList<Taxi> taxilist = new ArrayList<>();

        public Taxi nearLocation(ArrayList<Taxi> taxiList, Location passenger) {
            int minIndex = -1;
            {
                for (int i = 0; i < taxiList.size(); i++) {
                    double minDistance = 10000;
                    double dx = taxiList.get(i).getLocation().x - passenger.x;
                    double dy = taxiList.get(i).getLocation().y - passenger.y;
                    double distance = Math.pow(dx, 2) + Math.pow(dy, 2);
                    System.out.println(distance);
                    if (distance < minDistance) {
                        minDistance = distance;
                        double min = distance;
                        minIndex = i;
                    }
                }


            }
            if(minIndex!= -1){
                return taxilist.get(minIndex);
            }
            else
                return null;
        }
        public void addTaxi(Taxi t){
            taxilist.add(t);
        }
        public double calFare(Location pick,Location drop){
            double dx = pick.x - drop.x;
            double dy = pick.x - drop.y;
            double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
            double fare = distance*150;
            return fare;
        }
        }
