package Persons;
import java.lang.String;

public class Doctor extends HospitalPersonal {

    public enum title{CH, CHEFLAGE, LEDENDE_OVERLAGE, OVERLAGE, AFDELINGSLAGE}



    public title Title;

    public java.lang.String Doctortitle(String Title){
        this.Title = title;
        /*if (Title == title){
            return title;
        }
        else return ;
    }

    public Doctor(String title){
        this.Title = Doctortitle(title);
    }*/

}

/* public void SetDate(int year, int month, int day){
        this.StartDate  = LocalDate.of(year, month, day);
    }*/