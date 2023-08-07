

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Br {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brightness you want to set: ");
        int value = sc.nextInt();

        java.io.File file = new java.io.File("/sys/class/backlight/intel_backlight/brightness");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(value);
        pw.close();
	
	System.out.println("Done");


    }
}
