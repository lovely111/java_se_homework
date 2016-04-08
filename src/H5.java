/**
 * Created by Administrator on 2016/3/31.
 * <p>
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        System.out.println("请输入一个1——100之间的分数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        fenlei(i);
    }

    public static void fenlei(int i) {
        if (i > 100 | i < 0) {
            System.out.println("输入的成绩有误");
        } else {
            char ch = i >= 90 ? (char) 65 : i >= 60 ? (char) 66 : 67;
            System.out.println(ch);
        }
    }
}

