package Homework;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 4, 5, 2, 6, 8, 9, 6, 4};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;

            }

        }
        System.out.println("քանակ = " + count);
        for (int j = 0; j < numbers.length; j++) {
            count++;
            break;

        }
        System.out.println("Կրկնվող թվերի քանակը:" + count);
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int countt = 0;
        for (int e = 0; e < chars.length; e++) {
            if (chars[e] == 'ա' || chars[e] == 'է' || chars[e] == 'ը' || chars[e] == 'ի' || chars[e] == 'օ') {
                countt++;


            }


        }
        System.out.println("Մասիվի մեջ ձայնավորների քանակը -  " + countt);

    }
}
                



