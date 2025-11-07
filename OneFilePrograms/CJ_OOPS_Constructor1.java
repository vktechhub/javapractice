
    public class CJ_OOPS_Constructor1 {
        String model;
        int year;
        {
            System.out.println("Instance initializer block called: ");
        }
        static {
            System.out.println("Static initializer block called: ");
        }

        // Private Constructor
        private CJ_OOPS_Constructor1(String model, int year) {
            this.model = model;
            this.year = year;
            System.out.println("Constructor called: ");
        }
        public String getDetails() {
            System.out.println("getDetails method called: ");
            return "Model: " + model + ", Year: " + year;
        }

        public static void main(String[] args) {
        CJ_OOPS_Constructor1 myCar = new CJ_OOPS_Constructor1("Toyota", 2020);
        System.out.println("Main method executed");
        System.out.println(myCar.getDetails());
    }

}