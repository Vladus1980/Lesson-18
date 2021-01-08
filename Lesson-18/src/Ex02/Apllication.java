package Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Apllication {

	

	public static void main(String[] args) {
		
		
		Map<Integer, String> mapy  = new Map<Integer, String>(123, "123map");
		
		mapy.addObToMap(124, "124map");
		mapy.addObToMap(121, "121map");
		mapy.addObToMap(120, "120map");
		mapy.addObToMap(119, "119map");
		mapy.addObToMap(118, "118map");
		mapy.addObToMap(117, "117map");
		mapy.viewMap();
		System.out.println();
		mapy.addObToMap(125, "125map");
		mapy.viewMap();
		System.out.println();
		mapy.removeObFromMap(124);
		mapy.viewMap();
		System.out.println();
		mapy.removeObFromValue("125map");
		mapy.viewMap();
		mapy.viewKey();
		mapy.viewValue();
		
		
		
		Map<Integer, List<Integers>> mapy1 = new Map<>(100, new ArrayList<Integers>(Arrays.asList(new Integers("25"))));
		
		
		mapy1.viewMap();

	}
	
	
	
	public static class Integers {
		String integer;

		public Integers(String integer) {
			this.integer = integer;
		}

		public String getInteger() {
			return integer;
		}

		public void setInteger(String integer) {
			this.integer = integer;
		}

		@Override
		public String toString() {
			return integer;
		}

	}

}

