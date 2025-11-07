pubic class CJ_OOPS_COnstructors {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        System.out.println("Main method executed");
        System.out.println(myCar.getDetails());
    }

    // Constructors in Java
    class Car {
        String model;
        int year;
        {
            System.out.println("Instance initializer block called: ");
        }
        static {
            System.out.println("Static initializer block called: ");
        }

        // Constructor
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
            System.out.println("Constructor called: ");
        }
        public String getDetails() {
            System.out.println("getDetails method called: ");
            return "Model: " + model + ", Year: " + year;
        }
}