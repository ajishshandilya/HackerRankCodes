import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int a=scan.nextInt();
        double b=scan.nextDouble();
        scan.nextLine();
		String c=scan.nextLine();
        
        System.out.println(i+a);
        System.out.println(b+d);
        System.out.println(s+c);

        scan.close();
    }
}