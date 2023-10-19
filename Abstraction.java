abstract class Animal {
    public abstract void animalSound();

    public void Sleep() {
        System.out.println(" U_U L-5 in Abstraction.java => " + "ZZZZzzzzzzzzzzz");
    }
}

class Horse extends Animal {
    public void animalSound() {
    System.out.println(" U_U L-11 in Abstraction.java => " + "neighhh");
}

}

class Abstraction {
    public static void main(String[] args) {
        Horse myHorse = new Horse();
        myHorse.animalSound();
       

    }
}