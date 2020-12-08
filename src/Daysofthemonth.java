//import java.util.*;
//public class Daysofthemonth {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many dates are there in the month you choose?");
//        int dates = scan.nextInt();
//        System.out.println("Pick  a date between 1 and 7 for your first Sunday?");
//        int FirstSunday = scan.nextInt();
//        DaysoftheWeek();
//        Divider();
//        System.out.println();
//        Days(dates, FirstSunday);
//        Divider();
//    }
//
//    public static void DaysoftheWeek() {
//        System.out.print("|   Sun  |   Mon  |   Tue  |   Wed  |   Thu  |   Fri  |   Sat  |");
//        System.out.println();
//    }
//
//    public static void Divider() {
//        for (int i = 1; i <= 7; i++) {
//            System.out.print("+------");
//        }
//        System.out.print("+");
//    }
//    public static void Days(int days, int sun)  {
//
//    }
//    public static String padded(int n, int width){
//        String s = "" + n;
//        for (int i = s.length(); i < width; i++){
//            s = " " + s;
//        }
//        return s;
//    }
//}