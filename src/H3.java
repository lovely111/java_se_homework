/**
 * Created by Administrator on 2016/3/31.打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个“水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class H3 {
   public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            double j=Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
           if (i==j) {System.out.print(i+"\t");}
        }
    }
}


