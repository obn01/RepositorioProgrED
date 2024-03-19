package Tests;

public class TestRedefinicion1 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
            Animal myAnimal = myCat;
            Animal.testClassMethod();
            myAnimal.testInstanceMethod();
    }
}
