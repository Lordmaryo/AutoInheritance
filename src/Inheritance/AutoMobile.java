package Inheritance;

public abstract class AutoMobile {
    private final String chassisNo;
    private int wheels, seats;
    private String brand;
    private boolean roof;

    public AutoMobile(String chassisNo, int wheels, int seats, String brand, boolean roof) {
        this.wheels = wheels;
        this.seats = seats;
        this.brand = brand;
        this.chassisNo = chassisNo;
        this.roof = roof;
    }

    public String getChassisNo() {
        return this.chassisNo;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getBrand() {
        return this.brand;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move() {
        System.out.println(this.brand + " is moving forward");
    }

    public void carryCargo(Cargo load) {
        System.out.println(this.brand + " is carrying " + load.toString());
    }

    public void haveRoof() {
        if (this.isRoof()) {
            System.out.println(this.getBrand() + " have a roof");
        } else {
            System.out.println(this.getBrand() + " does Not have a roof");
        }
    }

    public void stop() {
        System.out.println(this.brand + " is stopping..");
    }
}
