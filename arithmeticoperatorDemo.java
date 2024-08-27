public class arithmeticoperatorDemo {
    public static void main(String[] args) {
        //++ 和--
        int a =10;
        //表示把变量a里面的值+1
        ++a;
        System.out.println(a);//11
        //表示把变量a里面的值+1
        a++;
        System.out.println(a);//12
        //表示把变量a里面的值-1
        a--;
        System.out.println(a);//11
        //表示把变量a里面的值-1
        --a;
        System.out.println(a);//10


        //参与计算时，
        int x = 10;
        //后++；先用后加
        int y = x++;
        //先++；先加后用
        int z = ++x;
        System.out.println("x:" + x);//x:12
        System.out.println("y:" + y);//y:10
        System.out.println("z:" + z);//z：12


        //+=
        //将左边和右边相加，然后把结果赋值给左边
        int c = 10;
        int b = 20;
        c += b;
        //等同于 c = (int类型)(c + b);
        System.out.println(c);//30
        System.out.println(b);//20

        //细节：
        short s = 1;
        s += 1;
        //等同于:s = (short类型) (s + 1);
        System.out.println(s);//2








    }

}
