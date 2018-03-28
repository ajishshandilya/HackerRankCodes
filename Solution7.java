//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> directory=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
			System.out.println("Enter the contact name:");
            String name = in.next();
			System.out.println("Enter the contact name:");
            int phone = in.nextInt();
            
            directory.put(name,phone);
        }
        while(in.hasNext()){
			System.out.println("Enter the contact name you want to search:");
            String s = in.next();
            if(directory.get(s)==null)
            {
                System.out.println("Not found");
            }
            else{
                System.out.println(s+"="+directory.get(s));
            }
        }
        in.close();
    }
}
