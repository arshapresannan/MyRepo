package egprograms;

import java.util.ArrayList;

public class PrgmCollections {

	public static void main(String[] args) {
		
		PrgmCollections obj=new PrgmCollections();
		obj.eglist();

	}
	
public void eglist() {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(20);
		a1.add(30);
		a1.add(50);
		
		for(Integer i:a1)
		{
			System.out.println("Values added "+i);
		}
		
		a1.remove(2);
		int s=a1.size();
		System.out.println("Size is "+s);
		System.out.println("add "+a1.add(20));
		System.out.println("Size is "+a1.size());
		System.out.println("remove "+a1.remove(2));
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.addAll(a1);
		for(Integer l:a2)
		{
			System.out.println("Values added "+l);
		}
	}


}
