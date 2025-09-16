package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println(numbers[0]);

        System.out.println(numbers[8]);
        System.out.println(numbers.length);
        int b = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < b) {
                b = numbers[j];


            }
        }
        System.out.println("Ամենափոքր թիվը = " + b);
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values.");
        } else {
            if (numbers.length % 2 == 0) {

                int P = numbers[numbers.length / 2 - 1];
                int F = numbers[numbers.length / 2];
                System.out.println("Մեջտեղի էլեմենտները =  " + P + " և " + F);
            } else {

                int D = numbers[numbers.length / 2];
                System.out.println("Մեջտեղի էլեմենտը =  " + D);
            }
        }
        int counter = 0;
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] % 2 == 0) {
                counter++;


            }

        }
        System.out.println("զույգ թվեր = " + counter);
        int counter1 = 0;
        for (int g = 0; g < numbers.length; g++) {
            if (numbers[g] % 2 != 0) {
                counter1++;

            }
        }
        System.out.println("կենտ թվեր = " + counter1);
        int sum = 0;
        for (int l = 0; l < numbers.length; l++) {
            sum = sum + numbers[l];

        }
        System.out.println("Մասիվի գումար = " + sum);
        double average = (double) sum / numbers.length;
        System.out.println("Միջին թվաբանական = " + average);
    }


}

