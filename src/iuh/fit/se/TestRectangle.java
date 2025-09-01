package iuh.fit.se;

import java.util.Scanner;

/**
 * @description: Lớp Main để minh họa việc sử dụng lớp Hình chữ nhật
 * @author: Bao
 * @version: 1.0
 * @created: Sep 1, 2025 12:53:18 PM
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap chieu dai: ");
            double length = sc.nextDouble();
            System.out.print("Nhap chieu rong: ");
            double width = sc.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);

            System.out.println(rectangle.toString());
            System.out.printf("Chu vi: %.2f\n", rectangle.getPerimeter());
            System.out.printf("Dien tich: %.2f\n", rectangle.getArea());
        } catch (IllegalArgumentException loi) {
            System.out.println("Loi: " + loi.getMessage());
        } finally {
            sc.close();
        }
    }
}
