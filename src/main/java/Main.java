import Persons.Doctor;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


import Persons.Patient;

public class Main {

    public static void main(String[] args){

    System.out.println("Hallooooo");

    // Test af local date funktion til patient:
    Patient nr1 = new Patient("Benny",123,LocalDate.now());
    System.out.println(nr1.name + " er den forste patient");

    Doctor Doc1 = new Doctor("KOST");

    System.out.println(Doc1);
    }
}
