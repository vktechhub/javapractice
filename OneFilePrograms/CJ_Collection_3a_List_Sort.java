import java.util.*;

public class CJ_Collection_3a_List_Sort {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Innova", 2010));
        cars.add(new Car("Maruthi", "Alto", 1980));
        cars.add(new Car("Honda", "City", 1990));

        System.out.println("Before sort- cars:-" + cars);

        Collections.sort(cars, new SortByYear());

        System.out.println("After sort- cars:-" + cars);
        
    }
    

}

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String Brand, String Model, int Year) {
        brand = Brand;
        model = Model;
        year = Year;
    }

    @Override
    public String toString(){
        return ("Car [ Brand=" + brand + ", Model = " + model + ", Year = " + year + "]");
    }
}

class SortByYear implements Comparator<Car>{
    @Override
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.year, c2.year);
    }
}