package Persons;
import java.time.LocalDate;


public class Patient extends Person{
    private LocalDate StartDate;
    public int ID;


    public void SetDate(int year, int month, int day){
        this.StartDate  = LocalDate.of(year, month, day);
    }


    /*public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }*/

    public Patient(String name, int ID, LocalDate StartDate){
        this.name = name;
        this.ID = ID;
        this.StartDate = LocalDate.now();
    }


}
