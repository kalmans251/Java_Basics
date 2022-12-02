package chapter17.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> aList1 = new ArrayList();
		
		//1. add() : List에 값을 추가할 때 : ArrayList, Vector, LinkedList
			//마지막 방에 값이 들어감.
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		
		System.out.println(aList1);
		
		//2. add (int index, E element) : 특정 방 번호에 값을 넣습니다.
		
		aList1.add(1,0);	//인덱스 방 번호, 저장 리터럴.
		System.out.println(aList1);
		
		//3. addAll(다른 리스트객체) : 다른 컬렉션의 모든 내용을 합해서 출력.
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1); aList2.add(2);
		System.out.println(aList2);
		
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		//4. addAll(int idex, 또다른 리스트)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(4);
		aList3.add(5);
		
		System.out.println(aList3);
		aList3.addAll(aList2);
		System.out.println(aList3);
		
		//6. remove(int index) : 특정 방 번호의 값을 삭제
		aList3.remove(1);
		
		System.out.println(aList3);
		//7. remove(Object o) : 방의 들어간 값으로 삭제
		aList3.remove(new Integer(2));
		System.out.println(aList3);
		
		//8.clear() : 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);
		
		//9. isEmpty() : 값이 없으면:true , 값이 존재하면:false
		System.out.println(aList3.isEmpty());
		
		//10. size() : 방의 갯수
		System.out.println(aList3.size()); 	//0
		aList3.add(1);aList3.add(2);aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());	//3
		
		//11. get(int index) : 방 번호의 값을 가지고 올때.
		System.out.println("0번째 : " + aList3.get(0));
		System.out.println("0번째 : " + aList3.get(1));
		System.out.println("0번째 : " + aList3.get(2));

		
		//12. toArray() :  List ==> Array ( 배열로 변환 )
		Object[] obj = aList3.toArray();
		
		//배열의 값을 출력 : Arrays.toString()
		System.out.println(Arrays.toString(obj));
		
		//13. toArray(T[] t) -- T[]			리스트 ==> 배열{리스트를 배열로 바꿔주는것.}
		Integer[] int1 = aList3.toArray(new Integer[0]);	
			//0 : 변환할 배열 방의 갯수인데, 컬렉션의 배열 방보다 작게 설정된경우. 컬렉션에 저장된 것에 맞추어서 처리됨. 
			//컬렉션에 저장된 것에 맞추어서 처리됨.
		System.out.println(Arrays.toString(int1));
		
		Integer[] int2 = aList3.toArray(new Integer[5]); //5로 초과하면 null값
		System.out.println(Arrays.toString(int2));
		
		
	}

}
