/**
 * Created by Administrator on 2016/3/31.
 * 将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。
 */
public class H4 {
    public static void main(String[] args) {
        int i = 90;
        System.out.print("90=");
        for (int j = 2; j <= i; j++) {
              while (i % j == 0 & i != j) {
                i = i / j;
                System.out.print(j + "*");
            }
            if (i==j){
                System.out.print(i);
            }                           //            感受while和if的区别
        }
    }
}
