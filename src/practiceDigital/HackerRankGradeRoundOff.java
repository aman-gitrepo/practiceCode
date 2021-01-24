package practiceDigital;

import java.util.*;

public class HackerRankGradeRoundOff {

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(23,80,96,18,73,78,60,60,15,45,15,10,5,46,87,0,33,42,38,67);
		System.out.println(new HackerRankGradeRoundOff().roundOff(grades));
	}

	private List<Integer> roundOff(List<Integer> grades) {

//	    List<Integer> rog = new ArrayList(); 
//	    for(int i=0;i<grades.size();i++){
//	    int grade=grades.get(i);
//	    rog.add((grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5))));
//	    }       
//	    
//	    return (rog);
//	    }

		
		List<Integer> rog = new ArrayList<Integer>();

		if (grades.size() <= 100 && grades.size() > 0) {
			
			
			for (int i = 0; i < grades.size(); i++) {
			
				
				if(grades.get(i)!=0 && grades.get(i)<100) {
				
					
					int grade = grades.get(i);
					int multiOfFive = Math.floorDiv(grade, 5) * 5 + 5;
				
				if (multiOfFive - grade < 3 && grade>37) {
//					if(multiOfFive<grade)
//					{
//						rog.add();
//					}
//					else
					rog.add(multiOfFive);
				} 
				
				else if (multiOfFive - grade == 3 && grade>37) {
					rog.add(grade);
				} 
				
				else if (multiOfFive - grade > 3 && grade>37) {
					rog.add(Math.floorDiv(grade, 5) * 5);
				}
				else
					rog.add(grade);
			}
		}
			}
		return rog;

	}
}