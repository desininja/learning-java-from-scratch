package breakRoomSnack;

import java.util.Scanner;

public class breakRoomSnackCode {


    public static void main(String[] args){
        boolean toKeepRunning = true;
        Scanner scanner = new Scanner(System.in);
        while (toKeepRunning){
            try{
                System.out.println("Pick a choice for your Snack in Break Room");
                System.out.println("1. Fruits");
                System.out.println("2. Candy");
                System.out.println("3. Chips");

                int selection = Integer.parseInt(scanner.nextLine());

                if (selection==1){
                    System.out.println("Fruits");
                    toKeepRunning=false;
                } else if (selection==2) {
                    System.out.println("Candy");
                    toKeepRunning=false;

                } else if (selection==3) {
                    System.out.println("Chips");
                    toKeepRunning=false;

                }else {
                    System.out.println("Please enter a number between 1 and 3");
                }
            } catch (Exception ex){
                System.out.println("\n Error - Invalid Input\n");
                ex.getLocalizedMessage();
            }
        }

    }
}
