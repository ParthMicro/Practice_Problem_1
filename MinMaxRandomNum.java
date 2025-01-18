import java.util.Random;

public class MinMaxRandomNum {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(900) + 100; 
        }
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
