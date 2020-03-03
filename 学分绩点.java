package day1;

import java.util.Scanner;
//1.一门课程的学分绩点=该课绩点*该课学分
// 2．总评绩点=所有学科绩点之和/所有课程学分之和

//第一行 总的课程数n（n<10）；
// 第二行 相应课程的学分（两个学分间用空格隔开）；
// 第三行 对应课程的实际得分
public class 学分绩点 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int array[][] = new int[2][n];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = in.nextInt();
                }
            }
            double sum = 0;
            double grade = 0;
            for (int j = 0; j < n; j++) {
                sum += (GPA(array[1][j])* array[0][j]);//绩点*学分
                grade += array[0][j];//所有课程的学分之和
            }
            System.out.printf("%.2f", sum / grade);
        }
    }
    public static double GPA(int grade){//使用成绩返回绩点
        double gpa = 0.0;
        if(grade>=90&&grade<=100)
            gpa=4.0;

        if(grade>=85&&grade<=89)
            gpa=3.7;

        if(grade>=82&&grade<=84)
            gpa=3.3;

        if(grade>=78&&grade<=81)
            gpa=3.0;

        if(grade>=75&&grade<=77)
            gpa=2.7;

        if(grade>=72&&grade<=74)
            gpa=2.3;

        if(grade>=68&&grade<=71)
            gpa=2.0;

        if(grade>=64&&grade<=67)
            gpa=1.5;

        if(grade>=60&&grade<=63)
            gpa=1.0;

        if(grade<60)
            gpa=0.0;

        return gpa;
    }
}

