package UserInput;

import java.util.Scanner;

public class ScannerUserInput {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Entered number is " + a);

        String b = sc.nextLine();
        System.out.println("Entered input is --> " + b);

    }
}
