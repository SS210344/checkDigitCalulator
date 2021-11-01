package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        String barcode = "";
        while (valid == true) {


            try {
                System.out.println("type 13 digit barcode");
                barcode = input.next();
                valid = false;
            } catch (Exception e) {
                System.out.println("exception error" + e);
                input.next();
            }
        }
        int evenAddition = 0;
        int oddAddition = 0;
        int number = 0;
        for (int i = 0; i < 12; i++) {
            number=Integer.parseInt(barcode.charAt(i)+"");
            if (i%2 == 1 ){
                evenAddition = evenAddition+number;
            }
            else{
                oddAddition = oddAddition+number;
            }

        }
        System.out.println(evenAddition);
        System.out.println(oddAddition);

        evenAddition=evenAddition*3;
        System.out.println(evenAddition);
        int total =evenAddition+oddAddition;

        number=Integer.parseInt(barcode.charAt(13)+"");
        total=total+number;
        System.out.println(total);

        int check = total%10;

        System.out.println(check);
        if (check == 0){
            System.out.println("valid barcode");
        }
        else{
            System.out.println("invalid barcode");
        }
    }
}
