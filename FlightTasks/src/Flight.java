import java.util.*;

public class Flight implements Comparable<Flight>{
    private String id;
    private String origin;
    private String destination;
    private Date arrivalDate;
    private int numPassengers;

    Flight(String id, String origin, String destination, Date arrivalDate, int numPassengers){
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.arrivalDate = arrivalDate;
        this.numPassengers = numPassengers;
    }
    public Date getArrivalDate() {
        return arrivalDate;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    @Override
    public int compareTo(Flight o) {
        return this.getArrivalDate().compareTo(o.getArrivalDate());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", numPassengers=" + numPassengers +
                '}';
    }
}
