package test;

import java.util.ArrayList;
import java.util.List;

public class AmazonTest {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(3);
		list.add(3);
		list.add(1);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		calculateMachineEfficieny(list);
		
	}

	private static void calculateMachineEfficieny(List<Integer> list) {
		//List tempList = list;
		int efficiencyInitial = calculateEfficiency(list);
		System.out.println("efficiencyInitial::"+efficiencyInitial);
		for(int i=0; i<list.size(); i++) {
			List<Integer> tempList = new ArrayList<Integer>(list);
			tempList.remove(i);
			
			//System.out.println("efficiencyInitialRemoved::"+calculateEfficiency(tempList));
			if(calculateEfficiency(tempList) == efficiencyInitial) {
				list = tempList;
			}
		}
		System.out.println("Smallest list::::"+list);
	}
	
	private static int calculateEfficiency(List<Integer> list) {
		int efficiency = 0;
		
		for(int i=0; i<list.size()-1; i++) {
			efficiency += Math.abs(list.get(i+1)-list.get(i)) ;
		}
		
		return efficiency;
	}
	
	
}
