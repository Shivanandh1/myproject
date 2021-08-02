package javap;
import java.util.ArrayList;
import java.util.List;
public class Arraylistdemo {

	public static void main(String[] args) {
		List<Integer> arraylist=new ArrayList<>(6);
                  for(int i=0;i<=5;i++) { 
                   arraylist.add(i);	
                  }
                  
                  System.out.print(arraylist);
                  arraylist.remove(3);
  System.out.println(arraylist);                 
  for(int i=0;i<arraylist.size();i++) {
	  System.out.print(arraylist.get(4)+" ");
	  
  }
  for(int i:arraylist)
   
  System.out.println(i+" ");
  
  
  
	}

}
