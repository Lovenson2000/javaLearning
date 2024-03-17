
public class Operator {

    public static void main(String[] args) {

        int x = 5;

        System.out.println(x > 3 && x < 10); // true
        System.out.println(x > 3 || x < 4); // true
        System.out.println(!(x > 3 && x < 10)); // false

        int a = 5; // binary: 0101
        int b = 3; // binary: 0011
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int leftShiftResult = a << 1;
        int rightShiftResult = a >> 1;

        System.out.println(andResult); // 0101 & 0011 = 0001 = outputs 1
        System.out.println(orResult); // 0101 | 0011 = 0111 = outputs 7
        System.out.println(xorResult); // 0101 ^ 0011 = 0110 = output 6
        System.out.println(leftShiftResult); // 0101 << 1 = 1010 = outputs 10
        System.out.println(rightShiftResult); // 0101 << 1 = 0010 = outputs 2
    }

}