class ElectronicsDevice{
    void start(){
        System.out.println("Device started ");
    }
}
class Fan extends ElectronicsDevice {
    void start(){
        System.out.println("Fan started ");
    }
}
class LED extends ElectronicsDevice {
    void start(){
        System.out.println("LED started ");
    }
}
class Motor extends ElectronicsDevice {
    void start(){
        System.out.println("Motor started ");
    }
}
public class Type_7_Polymorphism{
    public static void main(String[] args) {
        ElectronicsDevice device;

        device = new Fan();
        device.start();

        device = new LED();
        device.start();

        device = new Motor();
        device.start();
    }
}

