public class arithmeticoperator {
    public static void main(String[] args){
        //+
        System.out.println(1+1);//2
        //-
        System.out.println(2-1);//1
        //*
        System.out.println(1*0);//0

        //如果有小数参与,结果有可能是不精确的！
        System.out.println(1.1+1.1);//2.2
        System.out.println(1.1+1.01);//2.11

        //练习
        //隐式转换
        int b1 = 10;
        long b2 = 20;
        double b3 = 30;
        System.out.println(b1+b2+b3);

        //强制转换
        byte y1 = 100;
        byte y2 = 100;
        int result = y1 +y2;
        //强制转换需要加括号
        byte result1 =(byte)(y1 + y2);
        System.out.println(result);
        System.out.println(result1);//结果发生错误，因为要转换的数据过大。


        //算术运算符

        int age = 18;
        System.out.println("我的年龄是"+age+"岁");
        System.out.println("我的年龄是"+"age"+"岁");

        System.out.println(1+2+"abc"+1+2);//3abc12












    }
}
