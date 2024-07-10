package Inheritance;

public class Car extends AutoMobile {
    private final boolean ac, trunk;
    // made door a local variable since it's never used

    public Car(String chassisNo, int wheels, int seats, int doors,
               boolean ac, boolean trunk, String brand, boolean roof) {
        super(chassisNo, wheels, seats, brand, roof);
        this.ac = ac;
        this.trunk = trunk;
    }

    public boolean isAc() {
        return ac;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void haveAc() {
        if (this.isAc()) {
            System.out.println("This " + this.getBrand() + " have an AC...");
        } else {
            System.out.println("This " + this.getBrand() + " does NOT have AC...");
        }
    }

    public void haveTrunk() {
        if (this.isTrunk()) {
            System.out.println("This " + this.getBrand() + " can carry load...");
        } else {
            System.out.println("This " + this.getBrand() + " can NOT cary load...");
        }
    }

    public void reverse() {
        System.out.println(this.getBrand() + " is reversing...");
    }
}
