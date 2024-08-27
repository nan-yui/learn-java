public class demo2 {
    public static void main(String[] args){

        byte x = 10;//0000 1010
        int y = x;//0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(y);//10

        int a = 300;// 0000 0000 0000 0000 0000 0001 0010 1100
        byte b = (byte)a;// 0010 1100
        System.out.println(b);//44

        int c =200;//0000 0000 0000 0000 0000 0000 1100 1000
        byte d = (byte)c;//1100 1000
        System.out.println(d);//-56

        int e = 200;//0000 0000 0000 0000 0000 1100 1000
        byte f = 10;//0000 0000 0000 0000 0000 0000 1010
        //&：0为false，1为true，结果含false都为false，结果都是true才为true
        //结果为1000
        System.out.println(e & f);//8

        int g = 200;//0000 0000 0000 0000 0000 1100 1000
        int h = 10;//0000 0000 0000 0000 0000 0000 1010
        //|：0为false 1为true，结果只要有true，结果就死true，其他都是false。
        //结果为1100 1010
        System.out.println(g | h);//202

        int i = 200;
        //<< 左移，低位补0.
        //（左移一次乘以2，两次乘以4...）
        System.out.println(i << 2);//800


        int j = 200;
        //>> 右移，高位补0或1（符号位为0补0，为1补1）
        //（右移一次除以2，两次除以4...）
        System.out.println(j >> 2);//50






    }
}
