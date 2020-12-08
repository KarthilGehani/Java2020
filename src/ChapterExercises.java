public class ChapterExercises {
    public static void main(String [] Args) {
        printNumbers(8);
        printPowersof2 (4);
        printPowersof2 (10);
        printPowersofN(4,3);
    }
    public static void printNumbers(int length){
        for (int i = 1; i <= length; i++){
            System.out.print(" [" + i + "] ");
        }
        System.out.println();
    }
    public static void printPowersof2(int power) {
        for (int i = 0; i <= power; i++){
            System.out.print((int)Math.pow(2,i)+ " ");
        }
        System.out.println();
    }
    public static void printPowersofN(int base, int power) {
        for (int i = 0; i <= power; i++){
            System.out.print((int)Math.pow(base,i)+ " ");
        }
        System.out.println();
    }
}


