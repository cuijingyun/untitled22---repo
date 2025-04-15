package test;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class demo03 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // 提示用户输入评分人数
            System.out.print("请输入评分人数: ");
            int numOfRatings = scanner.nextInt();

            double totalRating = 0;
            // 循环获取每个评分并累加
            for (int i = 0; i < numOfRatings; i++) {
                System.out.print("请输入第 " + (i + 1) + " 个评分: ");
                double rating = scanner.nextDouble();
                totalRating += rating;
            }

            // 计算平均分
            double averageRating = totalRating / numOfRatings;

            // 输出平均分
            System.out.println("海南旅游景点的平均评分是: " + averageRating);

            scanner.close();
        }
    }

