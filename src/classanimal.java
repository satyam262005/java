class Animal {
    void out() {
        System.out.println("pizza");
    }

    void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("biryani");
    }

    void data() {
        System.out.println("hello");
    }
}
class main {
    public static void main(String[] args) {

        Animal s1 = new Dog();
        s1.eat();
        s1.out();
    }
}
