import java.util.*;
import java.io.*;
import java.time.*;

public class CJ_findDay{
     public static void main(String[] args) {

        LocalDate lDate = LocalDate.of(1985, 12, 10);
        String dayOfWeek = lDate.getDayOfWeek().toString();
        System.out.println(dayOfWeek);
    }
}
