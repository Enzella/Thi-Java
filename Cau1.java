import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Cau1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
double weight, height, bmi;
System.out.print("Cân nặng:");
weight = scanner.nextDouble();

System.out.print("Chiều cao:");
height = scanner.nextDouble();
         
          bmi = weight / Math.pow(height, 2);
System.out.print("BMI:"+bmi);
 if (bmi < 18) {
        System.out.println("Bạn là người gầy!");
    } else if (bmi <= 24.9) {
        System.out.println("Bạn là người bình thường");
    } else if (bmi <= 29.9) {
        System.out.println("Bạn bị béo phì độ I");
    } else if (bmi <= 34.9) {
        System.out.println("Bạn bị béo phì độ II");
    } else {
        System.out.println("Bạn bị béo phì độ III");
    }
    
    }
}
