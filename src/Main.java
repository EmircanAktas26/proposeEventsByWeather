/*
*@Author Emircan Aktaş - 20.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Terms :
            temperature < 5 = ski,
            5 <= temperature < 15 = cinema,
            15 <= temperature < 25 = picnic,
            25 <= temperature = swimming
         */
        int air;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the air temperature :");
        air = inp.nextInt();

        if (air < 5){
            System.out.println("You can ski.");
        }else if (5 <= air && air < 15){
            System.out.println("You can go to the cinema.");
        }else if (15 <= air && air < 25){
            System.out.println("You can go to the picnic.");
        }else if (25 <= air){
            System.out.println("You can go swimming. ");
        }else {
            System.out.println("You entered wrong. Please try again.");
        }

    }
}