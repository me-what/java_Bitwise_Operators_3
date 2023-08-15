// Побитовые операторы. Bitwise operators

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int result = a & b;
        System.out.println(a + " & " + b); // 10 & 11
        System.out.println("Result = " + result); // Result = 10
        System.out.println("Result in binary string = " + Integer.toBinaryString(result) + "\n"); // Result in binary string = 1010


        int a2 = 10;
        int b2 = 11;
        int result2 = a2 | b2;
        System.out.println(a2 + " | " + b2); // 10 | 11
        System.out.println("Result = " + result2); // Result = 11
        System.out.println("Result in binary string = " + Integer.toBinaryString(result2) + "\n"); // Result in binary string = 1011


        int a3 = 10;
        int b3 = 11;
        int result3 = a3 ^ b3;
        System.out.println(a3 + " ^ " + b3); // 10 ^ 11
        System.out.println("Result = " + result3); // Result = 1
        System.out.println("Result in binary string = " + Integer.toBinaryString(result3) + "\n"); // Result in binary string = 1


        int a4 = 10;
        int b4 = 1;
        int c = a4 >> b4;
        System.out.println(c); // 5
        System.out.println(-11 >> 1); // -6
        System.out.println();


        for (int i = 1; i <= 10; i++) {
            int shiftOperationResult = 2048 >> i;
            int devideOperationResult = 2048 / (int) Math.pow(2, i);

            System.out.println(shiftOperationResult + " - " + devideOperationResult);
        }
        System.out.println();


        int result5 = -1;
        System.out.println(result5 + " - " + Integer.toBinaryString(result5));

        for (int i=0; i<10; i++) {
            result5 = result5 >>> 1;
            System.out.println(result5 + " - " + Integer.toBinaryString(result5));
        }


        System.out.println();
        int a6 = 16;
        if (a6 % 2 == 0) {
            System.out.println(a6 + " a is even (четное)");
        } else {
            System.out.println(a6 + " a is odd (нечетное)");
        }
        System.out.println();


        /* Поиск максимального элемента в массиве */
        int[] array = {1, 2, 3, 100, 4, 5, 6};
        // Assuming the array is not empty
        int max = array[0];
        for (int a7: array) { // 1 < 6(array.length)? = true и т.д перебираем все элементы массива
            if(a7 > max) { // 1 > 1? = false. 2>1? = true и т.д
                max = a7;
            }
        }
        System.out.println("Array maximum is: " + max); // 100
        System.out.println();


        int[] arr = {10, 7, 1, 4, 7, 4, 11};
        int max9 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max9) {
                max9 = arr[i];
            }
        }
        System.out.println(max9); // => 11
    }
}