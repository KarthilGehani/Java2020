public class StepsProgram {
    public static void main(String [] Args) {
        printNumbers(8);
    }
        public static void printNumbers(int length){
        for (int i = 1; i <= length; i++){
            System.out.print(" [" + i + "] ");
        }
        System.out.println();
    }
}
