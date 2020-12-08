//import java.util.*;
//
//public class DaysAverage {
//    public static int days = 30;
//    public static final int temps[] = new int[days];
//    public static double average;
//
//    public static void main(String[] args) {
//        menu();
//    }
//
//    public static void menu() {
//        System.out.println("                  Temperature Average Menu                   ");
//        System.out.println("        1. Input 30 days temperature                         ");
//        System.out.println("        2. Calculate Average                                 ");
//        System.out.println("        3. Amount of days above average                      ");
//        System.out.println("        4. Amount of days below average                      ");
//        System.out.println("        5. Input a new day                                   ");
//        System.out.println("        6. Exit                                              ");
//        Scanner input = new Scanner(System.in);
//        int beloworabove = input.nextInt();
//        switch(beloworabove) {
//            case 1:
//                InputTemperature(input);
//                break;
//            case 2:
//                CalculateAverage();
//                break;
//            case 3:
//                AboveAverage();
//                break;
//            case 4:
//                BelowAverage();
//                break;
//            case 5:
//                addnewTemp();
//                break;
//            case 6:
//                end();
//        }
//        do{
//        }
//        while(answer < 6);
//
//    }
//
//
//
//    public static void menu(Scanner scan){
//
//    }
//        public static void inputTemp(Scanner input){
//        System.out.println("How many Days?");
//           int[] days = new int[30];
//            for (int i = 0; i < days.length; i++) {
//                System.out.print("Whis the temp for day" + i + 1 + " = ");
//                temps[1] = input.nextInt();
//                System.out.print(" " + temps[i] + " ,");
//
//            }
//        }
//        //This method is to calculate the Average
//    public static void average(){
//        average = 0;
//        for (int i = 0; i<temps.length; i++){
//            average+=temps[i];
//        }
//        average=average/temps.length;
//    }
//    public static void inputnewtemp(Scanner inputa){
//
//    }
//}
