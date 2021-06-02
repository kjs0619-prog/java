package mycompany.learn.java;

import java.util.*;
/**
 * 
 * @author 김진숙
 *
 */
class TestJavaCollection1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        //외국인
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		//한국인 
		list.add("김가");// Adding object in arraylist
		list.add("이가");
		list.add("박가");
		list.add("최가");
		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}  

/**
출력결과:
Ravi
Vijay
Ravi
Ajay
김가
이가
박가
최가

 */