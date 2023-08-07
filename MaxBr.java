

import java.io.*;
import java.util.Scanner;

public class MaxBr {

    public static void main(String[] args) throws IOException {


        File file = new File("/sys/class/backlight/intel_backlight/max_brightness");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\\Z");
        String content = scan.next();
        System.out.println(content);


    }
}
