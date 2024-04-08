package seedu.omnitravel.travelactivitytypes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TravelActivity {
    /** Travel activity description */
    private String travelActivity;
    /** Travel activity date */
    private LocalDate date;
    /** Travel activity duration */
    private String duration;
    /** Travel activity status */
    private boolean activityIsDone = false;
    /** Travel activity tag */
    private String tag;
    /** Travel activity expense */
    private String expense;
    /** Travel activity location */
    private String location;


    public TravelActivity(String description, LocalDate date, String duration, String tag, String expense){
        travelActivity = description;
        this.date = date;
        this.duration = duration;
        this.tag = tag;
        this.expense = expense;
    }

    @Override
    public String toString(){
        if(tag.isBlank()){
            return travelActivity + " :" + date.format(DateTimeFormatter.ofPattern("d MMM yyyy")) + " :" + duration;
        }
        return travelActivity + " :" + date.format(DateTimeFormatter.ofPattern("d MMM yyyy")) + " :" + duration
                + " (" + tag +")";

    }

    /**
     * Sets the status of the activity to complete or incomplete
     * @param activityIsDone activity status
     */
    public void setActivityStatus(boolean activityIsDone){
        this.activityIsDone = activityIsDone;
    }

    /**
     * Gets the description of the travel activity
     * @return The description of the travel activity
     */
    public String getPlan(){
        return travelActivity;
    }

    public boolean getActivityStatus() {
        return activityIsDone;
    }

    /**
     * Gets the tag of the travel activity
     * @return The tag of the travel activity
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void removeTag() {
        this.tag = "";
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public String getDuration(){
        return duration;
    }

    /**
     * Gets the expense of the travel activity
     * @return The tag of the travel activity
     */
    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public void removeExpense() {
        this.expense = "";
    }

    /**
     * Gets the location of the travel activity
     * @return The location of the travel activity
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void removeLocation() {
        this.location = "";
    }

}

