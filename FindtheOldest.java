package FindtheOldest.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FindtheOldest {
//main function
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 HashMap<String, Integer> map = new HashMap<>();
		 //create the object for Scanner class
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the file name with path: ");
		//read input
		 String input =scn.next(); 
		
		
		BufferedReader inFile = new BufferedReader(new FileReader(input));
	    Scanner in = new Scanner(inFile);
		
	    String[] info;
		String[] name1 = new String[100];
		int[] age1 = new int[100];
		String nextLine;
		int i=0;
		int temp1=0;
		
		while((nextLine = inFile.readLine()) != null)
		{
			
		    info  = nextLine.split(" ");
		    
		    int num = Integer.parseInt(info[1]);
		   
		    map.put(info[0], num);
		   
		    if(num>temp1) {
		    	temp1=num;
		    	
		    }

		}
		
		for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(temp1)) {
                System.out.println(entry.getKey());
            }
        }
		
	}

}

