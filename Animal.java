import java.time.LocalDate;
import java.util.List;

public  interface Animal<E> {


    default int getId() {
        return 0;
    }
   
    String getLastname();



    abstract Animal getMather();

    abstract Animal getFather();


    void addChildren(Animal human);
}