public class LoopsMain {
    public static void main(String[] args) {


        Loops number = new Loops();
        int[] numbers = new int[4];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 4;
        numbers[3] = 5;


        int sum = number.sumOfNumbers(numbers);
        System.out.println(sum);

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

}
