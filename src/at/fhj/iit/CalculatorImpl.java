package at.fhj.iit;

import java.util.*;

public class CalculatorImpl implements Calculator  {
	//Attributes
	private List<Integer> numbersList = new ArrayList<Integer>();
	
	//Methods
	//-----------------------------------------------------------
	
	//Getter minimum
	public int getMinimum() {
		int temp = numbersList.get(0);
		for(int x = 1; x < numbersList.size(); x++) {
			if(temp >= numbersList.get(x)){
				temp = numbersList.get(x);
			}
		}
		return temp;
	}
	
	//Getter maximum
	public int getMaximum() {
		int temp = numbersList.get(0);
		for(int x = 1; x < numbersList.size(); x++) {
			if(temp <= numbersList.get(x)){
				temp = numbersList.get(x);
			}
		}
		return temp;
	}
	
	//Add a values to the Integer-List
	public void addValue(int value) {
		numbersList.add(value);
	}

	//Returns the sum of all Integers of the list
	public int sum() {
		int temp = 0;
		for(int x = 0; x < numbersList.size(); x++) {
			temp += numbersList.get(x);
		}
		return temp;
	}
	
	
}
