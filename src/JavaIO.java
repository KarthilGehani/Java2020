import java.io.*;
import java.util.*;
public class JavaIO{
    public static void main (String [] args) throws FileNotFoundException {
    File f = new File ("Text.txt");
    Scanner input = new Scanner(f);
    while(input.hasNext()){
        System.out.println(input.next());
    }
    }
}
