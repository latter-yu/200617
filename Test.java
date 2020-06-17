import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        String s1 = "abc" + "edf";
        String s2 = new String(s1);
        if (s1.equals(s2)) {
            System.out.println("equals"); // equals
        }
        if (s1 == s2) {
            System.out.println("==");
            // 不运行
        }
    }

    public static void main2(String[] args) {
        System.out.println("value: " + switchit(4));
    }
    public static int switchit(int x) {
        int j = 1;
        switch (x) {
            case 0:
                j++;
            case 1:
                j++;
            case 2:
                j++;
            case 3:
                j++;
            case 4:
                j++;
            case 5:
                j++;
            default:
                j++;
        }
        return j + x;
    }
}

class Main {

    public static void main1(String[] args) {

        /*
        组个最小数:
        * 题目描述
        * 给定数字 0 - 9 各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
        * 目标是使得最后得到的数尽可能小（注意0不能做首位）。
        * 例如：给定两个0，两个1，三个5，一个8(输入为: 210030010)，我们得到的最小的数就是 10015558。
        * 现给定数字，请编写程序输出能够组成的最小的数。

        * 输入描述:
        * 每个输入包含 1 个测试用例。
        * 每个测试用例在一行中给出 10 个非负整数，顺序表示我们拥有数字 0、数字 1、…… 数字 9 的个数
        * 整数间用一个空格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
        * 输出描述:
        * 在一行中输出能够组成的最小的数。

        * 输入例子:
        * 2 2 0 0 0 3 0 0 1 0
        * (输入为: 00115558)
        * 输出例子:
        * 10015558
        * */

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int ch = 0;
        int count = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            // 将输入的十个整数放进 arr 数组
            arr[i] = sc.nextInt();
            sum += arr[i];
            // sum 为输入的整数翻译后的长度
        }
        int[] array = new int[sum];
        for (int i = 0; i < arr.length; i++) {
            // 翻译输入的整数, 放进 array 数组.
            count = arr[i];
            while (count != 0) {
                array[ch] = t;
                ch++;
                count--;
            }
            t++;
        }
        int sh = 1;
        while (array[0] == 0) {
            // 如果翻译出的数列首位为 0, 则需将其与后面的数字调换位置
            // 直至首位不为 0 为止.
            int tmp = array[0];
            array[0] = array[sh];
            array[sh] = tmp;
            sh++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {

        /*
        验证尼科彻斯定理，即：任何一个整数 m 的立方都可以写成 m 个连续奇数之和。
        例如：
        1^3=1
        2^3=3+5
        3^3=7+9+11
        4^3=13+15+17+19

        要求:
        输入一个 int 整数
        输出分解后的 String

        例如:
        输入: 6
        输出: 31+33+35+37+39+41
        */

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long num = n * n * n;
            int sum = 0;
            int tmp = n * n - n + 1;
            // 由题推出: 首位为 n * n - n + 1;
            StringBuffer s = new StringBuffer() ;
            // 将输出设为 String 类型

            for (int i = 1; i < n; i++) {
                // 将(n - 1)个元素放入 s 内.
                // 这样不会多输出一个 "+".
                sum += tmp;
                s.append(tmp + "+");
                tmp += 2;
            }
            s.append(tmp);
            System.out.println(s);
        }
    }
}