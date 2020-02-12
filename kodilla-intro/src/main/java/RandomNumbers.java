import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0;
        int max = 0;
        int min = 31;
        while (sum <= 5000) {
            int number = random.nextInt(31);
            System.out.println("Wylosowana liczba to: " + number);

            sum = sum + number;
            System.out.println("Suma wszystkich wylosowanych liczb do tej pory to: " + sum);

            if (number > max) {
                max = number;
                System.out.println("Aktualny maks = " + max);
            }

            if (number < min) {
                min = number;
                System.out.println("Aktualny min = " + min);
            }
        }

        System.out.println("Finalny max = " + max);
        System.out.println("Finalny min = " + min);
    }
}

