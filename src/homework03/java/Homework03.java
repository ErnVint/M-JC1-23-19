import java.util.*;
import java.io.*;

public class Homework03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i*j;
                if (Integer.toString(result).length() < 2) {System.out.print("0" + i*j + " ");} else {System.out.print(i*j + " ");}
                //System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}
