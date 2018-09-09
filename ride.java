/*
ID: nikhita1
LANG: JAVA
PROG: ride
*/
import java.io.*;
public class ride {
	public ride () {
		
	}

	public static void main(String[] args) {
		String[] arr = new String[2];
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 1;
		}
		String thisLine = null;
		String data = "";
		int count = 0;
		BufferedReader br = null;
		 try {
		      
	         br = new BufferedReader(new FileReader("ride.in"));
	         
	         while ((thisLine = br.readLine()) != null) {
	        	 arr[count] = thisLine;
	        	 count++;
	         }       
	      } catch(Exception e) {
	         e.printStackTrace();
	     
	    }
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				char c = arr[i].charAt(j);
				arr2[i] *= (c - 'A' +1);
			}
		}
		
	    if ((arr2[0] % 47) == (arr2[1] % 47)) {
	    	 data = "GO\n";
	    } else {
	         data = "STAY\n";	
	    }
	    
	    FileOutputStream out;
		try {
			out = new FileOutputStream("ride.out");
			out.write(data.getBytes());
		    out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    try {
		   br.close();
	    } catch (IOException e) {
		   e.printStackTrace();
	    }      
	
	}

}

