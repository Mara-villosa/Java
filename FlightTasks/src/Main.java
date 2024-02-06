import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Flight> flightLinkedList = new LinkedList<Flight>();

        flightLinkedList.add(new Flight("AAL 993", "New York", "Santiago", createDate(2021, 8, 29, 5, 39), 62));
        flightLinkedList.add(new Flight("LAT 755", "Sao Paulo", "Santiago", createDate(2021, 8, 31, 4, 45), 47));
        flightLinkedList.add(new Flight("SKU 621", "Rio de Janeiro", "Santiago", createDate(2021, 8, 30, 16, 0), 52));
        flightLinkedList.add(new Flight("DAL 147", "Atlanta", "Santiago", createDate(2021, 8, 29, 13, 22), 59));
        flightLinkedList.add(new Flight("AVA 241", "Bogota", "Santiago", createDate(2021, 8, 31, 14, 5), 25));
        flightLinkedList.add(new Flight("AMX 10", "Mexico City", "Santiago", createDate(2021, 8, 31, 5, 20), 29));
        flightLinkedList.add(new Flight("IBE 6833", "Londres", "Santiago", createDate(2021, 8, 30, 8, 45), 55));

        //Order by ascending time of arrival
        flightLinkedList.sort( (a, b) -> a.compareTo(b));
        System.out.println("flightLinkedList = " + flightLinkedList);

        //Get the last flight to arrive
        System.out.println("Last Flight to arrive: " + flightLinkedList.getLast());

        //Get the flight with the most passengers
        int index = 0;
        int maxPassengers = 0;
        int maxIndex = 0;

        for(Flight flight: flightLinkedList)
        {
            if(flight.getNumPassengers() > maxPassengers){
                maxPassengers = flight.getNumPassengers();
                maxIndex = index;
            }
            index++;
        }

        System.out.println("Flight with the most passengers: " + flightLinkedList.get(maxIndex));
    }

    public static Date createDate(int year, int month, int day, int hour, int minutes)
    {
        Calendar aux = Calendar.getInstance();
        aux.set(year, month, day, hour, minutes);
        Date date = aux.getTime();

        return date;
    }
}
