
public class Type4_WithParamsWithReturn {
    static int powercal(int multiplier) {
        int power = 220 * multiplier; 
        System.out.println("x: power is low");
        return power; 
    }

    public static void main(String[] args) {
        int container = powercal(5); 
        
        System.out.println("The value of power is : " + (container + 20));
        System.out.println("The value of power is : " + (container - 20));
        System.out.println("The value of power is : " + container);
    }
}