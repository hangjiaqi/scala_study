package demoObject;

public class JavaForDemo {
    public static void main(String[] args) {
        /*for (int a = 1; a < 4; a++) {
            for (int b = 1; b < 4; b++) {
                System.out.println("Value of a:" + a);
                System.out.println("Value of b:" + b);
            }
        }*/


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println("Values of a :" +numbers[i]);
        }
    }
}
