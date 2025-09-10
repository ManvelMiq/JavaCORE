package Homework;



public class Homework1 {
    public static void main(String[] args) {
        int x = 15;
        int y = 20;

        if (x > y) {
            System.out.println("x>y");
        } else if (x < y) {
            System.out.println("x<y");
        } else {
            System.out.println("x=y");
        }
        int a;
        int b;
        a = 5;
        b = 7;
        int sum = a + b;

        System.out.println("a+b=" + sum);

        int n;
        n = 3;
        int i;
        for (i=1;i<=10;i++)
            System.out.println(n+"*"+i+"="+n*i);
    }


}

