package model;

import java.util.ArrayList;

public class DepartBean {
	public ArrayList getAdvice(String depart){
		ArrayList advice = new ArrayList();
		if(depart.equals("kor")){
			advice.add("1.국어를 잘해야 한다.");
			advice.add("2.국어를 사랑해야 한다.");
		}
		else if(depart.equals("eng")){
			advice.add("1.영어를 잘해야 한다.");
			advice.add("2.영어를 사랑해야 한다.");
		}
		else{
			advice.add("1.컴퓨터를 잘해야 한다.");
			advice.add("2.컴퓨터를 사랑해야 한다.");
		}
		return advice;
	}
}
