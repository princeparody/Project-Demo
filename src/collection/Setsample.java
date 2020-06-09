package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setsample {
	
	public static void main(String[] args) {
		
		Set <String> play = new HashSet<String>();
		
		play.add("Cricket");
		play.add("Kabadi");
		play.add("Baseball");
		play.add("Cricket");
		play.add("Volleyball");
		
		System.out.println(play);
		
		for (String i:play) {
			
			System.out.println(i);
		}
			int s = play.size();
			
			System.out.println(s);
		}
	}


