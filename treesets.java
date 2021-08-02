package javap;

import java.util.TreeSet;

public class treesets {

	public static void main(String[] args) {
		TreeSet<String> treeset=new TreeSet<>();
            treeset.add("a");
            treeset.add("c");
            treeset.add("b");
            treeset.add("b");//only print one value
            System.out.println(treeset);
            
            
	}

}
