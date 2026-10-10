public class Type3_WithParamsNoReturn {
    static void powercal(int multiplier) {
        int power = 220 * multiplier; 
        System.out.println("x: power is low");
        System.out.println("The value of power is : " + power);
        
    }

    public static void main(String[] args) {
        powercal(5); 
    }
}