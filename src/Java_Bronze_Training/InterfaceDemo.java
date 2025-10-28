interface Animal{
    int minHeight = 1;
    String planet = "Earth";
    void eat();

    default void sound(){
        wakeup();
        System.out.println("Animal makes a sound");
    }

    static void sleep() {
        eyesclosed();
        System.out.println("Animal is sleeping");
    }

    private static void eyesclosed() {
        System.out.println("Animal's eyes are closed");
    }

    private void wakeup() {
        System.out.println("Animal is awake");
    }
}

interface LandAnimal extends Animal{
    default void sound(){
        System.out.println("LandAnimal makes a sound");
    }
}

interface Human {
    default void sound(){
        System.out.println("Human makes a sound");
    }
}

class Dog implements Animal {
    int minHeight = 2;
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sound() {
        System.out.println("Dog barks");
    }
}

class SpecialAnimal implements Animal, Human {
    public void eat() {
        System.out.println("SpecialAnimal is eating");
    }

    public void sound() {

        //Option 1:- Use the sound method from the Human interface
        Human.super.sound();

        //Option 2:- Use the sound method from the Animal interface
        Animal.super.sound();

        //Option 3:- Custom implementation
        System.out.println("SpecialAnimal makes a sound");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sound();
        System.out.println("Dog's minimum height: " + dog.minHeight);
        Animal.sleep(); // Static method call

        Animal sp1 = new SpecialAnimal();
        System.out.println("SpecialAnimal's minimum height: " + sp1.minHeight);
        sp1.sound();
        sp1.eat();
        Animal.sleep(); // Static method call
    }
}
