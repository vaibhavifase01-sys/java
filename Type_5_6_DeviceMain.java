class Device {
    String name;

    void display() {
        System.out.println("Device Name: " + name);
    }

    double calculatePower(double v, double current) {
        return v * current;
    }
}

public class Type_5_6_DeviceMain {
    public static void main(String[] args) {
        Device d1 = new Device();
        d1.name = "Motor";
        d1.display();

        double power = d1.calculatePower(230, 3);
        System.out.println("Power: " + power + " watts");
    }
}