public class Type2_NoParamsWithReturn {
    static int powercal() {
        int power = 220 * 5;
        System.out.println("x: power is low");
        return power; 
    }

    public static void main(String[] args) {
        int container = powercal(); 
        System.out.println("The value of power is : " + container);
        System.out.println("The value of power is : " + (container + 20));
        System.out.println("The value of power is : " + (container - 20));
    }
}