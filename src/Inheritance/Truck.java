package Inheritance;

public class Truck extends AutoMobile {
    private final boolean ac, trunk, bucket;
    // add unused door as a local variable

    public Truck(String chassisNo, int wheels, int seats, String brand,
                 int doors, boolean ac, boolean trunk, boolean roof, boolean bucket) {
        super(chassisNo, wheels, seats, brand, roof);
        this.ac = ac;
        this.trunk = trunk;
        this.bucket = bucket;
    }

    public boolean isAc() {
        return ac;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public boolean isBucket() {
        return bucket;
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

    public void haveBucket() {
        if (this.isBucket()) {
            System.out.println("This Truck have a bucket");
        } else {
            System.out.println("This Truck does not have a bucket");
        }
    }

    public void reverse() {
        System.out.println(this.getBrand() + " is reversing...");
    }
}
