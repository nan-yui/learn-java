import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {


        //练习
        /*录入两个整数，其中一个为6，结果为true。
        如果他们的和为6的倍数，最终结果输出为true，
        其他情况为false。*/

        //.分析
        //1.键盘录入两个整数
        //变量a 变量b

        //2.a == 6 || b == 6 || (a + b) % 6 == 0
        //如果满足其中一个，那么就可以输出true

        //键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number1 = sc.nextInt();
        System.out.println("enter a number");
        int number2 = sc.nextInt();

        //可以短路逻辑运算符去连接三个判断
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 1;
        System.out.println(result);







    }
}
