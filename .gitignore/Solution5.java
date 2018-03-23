import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("how many string you want to check:");
        int a=sc.nextInt();
        sc.nextLine();
		System.out.println("Enter String");
        for(int i=0;i<a;i++)
		{
			String b=sc.nextLine();
			for(int j=0;j <b.length();j=j+2)
				{
					System.out.print(b.charAt(j));
				}
				System.out.print(" ");
			for(int j=1;j < b.length();j=j+2)
				{
					System.out.print(b.charAt(j));
				}
				System.out.println();
		}
    }
}