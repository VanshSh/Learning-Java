class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println(" U_U L-5 in Inheritance.java => " + "Tuut 📯📯📯📯📯📯");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(" U_U L-14 in Inheritance.java => " + myCar.brand + " " + myCar.modelName);
    }
}