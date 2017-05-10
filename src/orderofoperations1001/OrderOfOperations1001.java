/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orderofoperations1001;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
public class OrderOfOperations1001 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
    }
    
    public static void question1() {
        Scanner in = new Scanner(System.in);
        /* The equation is 18 ÷ 6² + 18 - 3 + 5² % 7
            The answer is 19.5
            It is solved via this method:
            18 ÷ 6² + 18 - 3 + 5² % 7
            18 ÷ 36 + 18 - 3 + 25 % 7
            18 ÷ 36 + 18 - 3 + 4
            0.5 + 18 - 3 + 4
        `   18.5 - 3 + 4
            15.3 + 4
            19.3
        */
        System.out.print("\n1.) Given x = 18 ÷ 6² + 18 - 3 + 5² % 7, what is x?");
        double answer = in.nextDouble();
        if(answer == 19.5) {
            System.out.print("\nThat's correct! Would you like to see the work involved? (Y for yes, N for no)");
            char choice = in.next().charAt(0);
            if(Character.toLowerCase(choice) == 'y') {
                System.out.print("\n18 ÷ 6² + 18 - 3 + 5² % 7\n18 ÷ 36 + 18 - 3 + 25 % 7\n18 ÷ 36 + 18 - 3 + 4\n0.5 + 18 - 3 + 4\n18.5 - 3 + 4\n15.3 + 4\n19.3");
            }
            else {
                
            }
        }
        else {
            System.out.print("\nThat's incorrect. The answer is 19.5 and it is solved via this method:\n18 ÷ 6² + 18 - 3 + 5² % 7\n18 ÷ 36 + 18 - 3 + 25 % 7\n18 ÷ 36 + 18 - 3 + 4\n0.5 + 18 - 3 + 4\n18.5 - 3 + 4\n15.3 + 4\n19.3");
        }
    }
    
    public static void question2() {
        Scanner in = new Scanner(System.in);
        /* The equation is 15 ÷ 5² + 16 + 2 * 5²
            The answer is 66.6
            It is solved via this method:
            15 ÷ 5² + 16 + 2 * 5²
            15 ÷ 25 + 16 + 2 * 25
            0.6 + 16 + 50
            16.6 + 50
            66.6
        */
        System.out.print("\n2.) Given x = 15 ÷ 5² + 16 + 2 * 5², what is x?");
        double answer = in.nextDouble();;
        if(answer == 66.6) {
            System.out.print("\nThat's correct! Would you like to see the work involved? (Y for yes, N for no)");
            char choice = in.next().charAt(0);
            if(Character.toLowerCase(choice) == 'y') {
                System.out.print("\n15 ÷ 5² + 16 + 2 * 5²\n15 ÷ 25 + 16 + 2 * 25\n0.6 + 16 + 50\n16.6 + 50\n66.6");
            }
            else {
                
            }
        }
        else {
            System.out.print("\nThat's incorrect. The answer is 66.6 and it is solved via this method:\n15 ÷ 5² + 16 + 2 * 5²\n15 ÷ 25 + 16 + 2 * 25\n0.6 + 16 + 50\n16.6 + 50\n66.6");
        }
    }
    
    public static void question3() {
        Scanner in = new Scanner(System.in);
        /* The equation is 5 + 4² + 2 - 9 + 3²
            The answer is 23
            It is solved via this method:
            5 + 4² + 2 - 9 + 3²
            5 + 16 + 2 - 9 + 9
            21 + 2 - 9 + 9
            23 - 9 + 9
            23
        */
        System.out.print("\n3.) Given x = 5 + 4² + 2 - 9 + 3², what is x?");
        double answer = in.nextDouble();;
        if(answer == 23) {
            System.out.print("That's correct! Would you like to see the work involved? (Y for yes, N for no): ");
            char choice = in.next().charAt(0);
            if(Character.toLowerCase(choice) == 'y') {
                System.out.print("\n5 + 4² + 2 - 9 + 3²\n5 + 16 + 2 - 9 + 9\n21 + 2 - 9 + 9\n23 - 9 + 9\n23");
            }
            else {
                
            }
        }
        else {
            System.out.print("\nThat's incorrect. The answer is 23 and it is solved via this method:\n5 + 4² + 2 - 9 + 3²\n5 + 16 + 2 - 9 + 9\n21 + 2 - 9 + 9\n23 - 9 + 9\n23");
        }
    }
    
    public static void question4() {
        Scanner in = new Scanner(System.in);
        /* The equation is 4 + 4 + 4 + 3² - 8
            The answer is 13
            It is solved via this method:
            4 + 4 + 4 + 3² - 8
            4 + 4 + 4 + 9 - 8
            12 + 9 - 8
            21 - 8
            13
        */
        System.out.print("\n4.) Given x = 4 + 4 + 4 + 3² - 8, what is x?");
        double answer = in.nextDouble();;
        if(answer == 13) {
            System.out.print("\nThat's correct! Would you like to see the work involved? (Y for yes, N for no)");
            char choice = in.next().charAt(0);
            if(Character.toLowerCase(choice) == 'y') {
                System.out.print("\n4 + 4 + 4 + 3² - 8\n4 + 4 + 4 + 9 - 8\n12 + 9 - 8\n21 - 8\n13");
            }
            else {
                
            }
        }
        else {
            System.out.print("\nThat's incorrect. The answer is 13 and it is solved via this method:\n4 + 4 + 4 + 3² - 8\n4 + 4 + 4 + 9 - 8\n12 + 9 - 8\n21 - 8\n13");
        }
    }
    
    public static void question5() {
        Scanner in = new Scanner(System.in);
        /* The equation is 7² + 8 / 4 + 2² - 5²
            The answer is 30
            It is solved via this method:
            7² + 8 / 4 + 2² - 5²
            49 + 8 / 4 + 4 - 25
            49 + 2 + 4 - 25
            51 + 4 - 25
            55 - 25
            30
        */
        System.out.print("\n5.) Given x = 7² + 8 / 4 + 2² - 5², what is x?");
        double answer = in.nextDouble();;
        if(answer == 30) {
            System.out.print("\nThat's correct! Would you like to see the work involved? (Y for yes, N for no)");
            char choice = in.next().charAt(0);
            if(Character.toLowerCase(choice) == 'y') {
                System.out.print("\n7² + 8 / 4 + 2² - 5²\n49 + 8 / 4 + 4 - 25\n49 + 2 + 4 - 25\n51 + 4 - 25\n55 - 25\n30");
            }
            else {
                
            }
        }
        else {
            System.out.print("\nThat's incorrect. The answer is 30 and it is solved via this method:\n7² + 8 / 4 + 2² - 5²\n49 + 8 / 4 + 4 - 25\n49 + 2 + 4 - 25\n51 + 4 - 25\n55 - 25\n30");
        }
    }
}
