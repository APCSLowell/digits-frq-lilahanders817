import java.util.ArrayList;

public class Digits{

	private ArrayList<Integer> digitList;

	public Digits(int num){ 
		int myNum = num;
		while(myNum >= 10){
			digitList.add(0, myNum%10);
			myNum = myNum/10;
		}
		if(myNum < 10){
			digitList.add(0, myNum);
		}
	    
	}

	public boolean isStrictlyIncreasing(){
		for(int i = 0; i< digitList.size()-1; i++){
			if(digitList.get(i) >= digitList.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public String toString(){
		return digitList.toString();
	}
}
