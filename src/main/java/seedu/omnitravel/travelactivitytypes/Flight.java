package seedu.omnitravel.travelactivitytypes;

import java.time.LocalDate;
public class Flight extends TravelActivity{

    private String depAirport;
    private String arrAirport;

    public Flight(String line, LocalDate date, String duration, String tag, String expense, String dep, String arr){
        super(line, date, duration, tag, expense);
        this.depAirport = dep;
        this.arrAirport = arr;
    }


}
