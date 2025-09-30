public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();
        ((Animal) a).sound(); 

        a = (Animal) new Cat();
        a.sound();
        ((Cat) a).sound();
    }
}
