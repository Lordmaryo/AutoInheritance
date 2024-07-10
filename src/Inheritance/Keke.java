package Inheritance;

public class Keke extends AutoMobile {
    public Keke(String chassisNo, int wheels, int seats, String brand, boolean roof) {
        super(chassisNo, wheels, seats, brand, roof);
    }

    public void reverse(){
        System.out.println(this.getBrand() + " is reversing...");
    }
}
