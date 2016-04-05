/**
 * Created by Administrator on 2016/3/31.
 * <p>
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class H5 {
    public static void main(String[] args) {

        int studentScore = 98;
        if (studentScore >= 90)
        {System.out.println('A');}
            else if (studentScore >= 60 & studentScore <= 89)
        {System.out.println('B');}
        else if (studentScore<60)
        {System.out.println('C');}
        }
    }

