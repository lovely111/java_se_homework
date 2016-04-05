/**
 * Created by Administrator on 2016/3/31.
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class H10 {
    public static void main(String[] args) {
        double h=100;
        double t=Math.pow(2,10);
        double h10=h/t;
        System.out.println("第十次反弹"+h10);
        double   sum=0;         //        每次J++后sum值更换
        for (int j=1;j<10;j++){
            h /=2;
            sum +=h*2;
        }  System.out.println("第10次落地时共经过"+(sum+100));
    }
}
