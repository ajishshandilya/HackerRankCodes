import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        
        double ti_p=(double)tip_percent;
        double ta_p=(double)tax_percent;
        
        double tip,tax,totalcost;
        
        tip=meal_cost*(ti_p/100);
        tax=meal_cost*(ta_p/100);
        
        totalcost=meal_cost+tip+tax;
        
        int t_c=(int)totalcost;
        
        if((totalcost-t_c)>0.5)
        {
            t_c++;
        }
        
        System.out.println("The total meal cost is "+t_c+" dollars.");
        
        in.close();
    }
}