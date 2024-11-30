import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] arryInteger = new int[3];
        arryInteger[0] = 1;
        arryInteger[1] = 2;
        arryInteger[2] = 3;

        double[] arryDouble = {1.57, 7.654, 9.986};

        char[] arryChars = {'s', 't', 'e', 'p'};

        System.out.println("Задание 2");

        for (int i = 0; i < arryDouble.length; i++) {
            if (i == arryDouble.length - 1) {
                System.out.println(arryDouble[i]);
                break;
            }
            System.out.print(arryDouble[i] + ", ");
        }


        for (int i = 0; i < arryInteger.length; i++) {
            if (i == arryInteger.length - 1) {
                System.out.println(arryInteger[i]);
                break;
            }
            System.out.print(arryInteger[i] + ", ");
        }

        for (int i = 0; i < arryChars.length; i++) {
            if (i == arryChars.length - 1) {
                System.out.println(arryChars[i]);
                break;
            }
            System.out.print(arryChars[i] + ", ");
        }


        for (int i = arryDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arryDouble[i]);
                break;
            }
            System.out.print(arryDouble[i] + ", ");
        }


        for (int i = arryInteger.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arryInteger[i]);
                break;
            }
            System.out.print(arryInteger[i] + ", ");
        }

        for (int i = arryChars.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arryChars[i]);
                break;
            }
            System.out.print(arryChars[i] + ", ");
        }

        System.out.println("Задагие 4");

        for (int i = 0; i < arryInteger.length; i++) {
            if (arryInteger[i] % 2 != 0) {
                arryInteger[i] += 1;}
        }
        System.out.println(Arrays.toString(arryInteger));

    }
}