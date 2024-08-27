public class text3 {
    public static void main(String[] args) {
        //获取三个和尚最高身高
        // 定义三个变量记录三个和尚身高
        int height1 = 159;
        int height2 = 160;
        int height3 = 161;

        //先拿第一个和尚身高跟第二个比较
        //再拿结果跟第三个和尚比较

        int temp = height1 > height2 ? height1 : height2;
        int max =temp > height3 ? temp : height3;
        System.out.println(max);



    }
}
