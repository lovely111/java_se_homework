/**
 * Created by Administrator on 2016/3/31.判断101-200之间有多少个素数，
 * 并输出所有素数。素数：只能被1和它本身整除的正整数（1不是素数）
 */
public class H2 {
    public static void main(String[] args) {
        int count = 0;
        boolean b = false;
        for (int i = 101; i < 200; i += 2) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j != 0) {
                    b = true;
                } else {
                    b = false;break;
                }
            }
            if (b == true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("素数个数为: " + count);//        输出的结果必须在psvm里面
    }
}
