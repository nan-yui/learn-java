import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args){
        //1.键盘录入两只老虎体重
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一支老虎体重");
        int weight1 = sc.nextInt();
        System.out.println("第二只老虎体重");
        int weight2 = sc.nextInt();

        //2.比较
        //true false
        //相同 不同
        //System.ou.println(weight1 == weight2);

        String result = weight1 == weight2 ? "相同":"不同";
        System.out.println(result);


    }




}
