package devoir_johan;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		int a=5, b=25, c=30;
		List<Integer> test2=new ArrayList<>();
		List<Integer> test3=new ArrayList<>();
		test2=retournA(a,b,c);
		for(int nb: test2) {
		test3.add(nb);
		System.out.println(test3);
		}
	}
	public static List retournA(int a ,int b ,int c) {
		int[] tab =new int[2];
		int test=0;
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list1.add(a);
		list1.add(b);
		list1.add(c);
		

		for(Integer nb:list1) {
			if(nb>15) {
				//System.out.println(nb);
				list2.add(nb);
				return list2;
			}
			
		}
		return list2;
		
	}
}

