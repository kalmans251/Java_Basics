package chapter17.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//java.lang 패키지 하위의 클래스는 생략 가능 (Object, String, Integer,....)

public class CreateListobject {

	public static void main(String[] args) {
		
		//참고로 알아듬. 몰라도 상관없는 내용.
		// 1. ArrayList
		List<Integer> aList1 = new ArrayList<>();	//내부적으로 메모리 공간을 10개를 확보.
		List<Integer> aList2 = new ArrayList<>(30);	//값은 들어가지 않고 내부적으로 초기 메모리공간을 30개 확보
		
		// 2. Vector
		List<Integer> aList3 = new Vector<>();	//capacity 10을 확보.
		List<Integer> aList4 = new Vector<>(50);	// 50개의 공간 확보	
		
		// 3. LinkedList
		
		List<Integer> aList5 = new LinkedList<>();	// capacity 10
//		List<Integer> aList6 = new LinkedList<>(57);	//LinkedList는 공간 설정하면 오류남
		
		//컬렉션은 자동으로 방 크기가 늘어나고 줄어든다. (무한정)
		//Arrays.asList( ) 를 사용해서 값을 넣을 경우 방의 크기가 고정되어 버린다.
		//고정된 값만 들어가야 할 경우 : 12달, 요일
		List<Integer> aList7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<String> aList8 = Arrays.asList("월","화","수","목","금","토","일");
		
		//aList7.add(13);  추가할 수 없다.
		//aList7.remove(0); 제거할 수 없다.
		
		//수정은 가능하다.
		aList7.set(1, 7);		// 인덱스 1번을 7로 set.
		
		System.out.println(aList7);
		
		try {
			aList8.add("안녕");

		}catch(UnsupportedOperationException e) {
			e.printStackTrace();
			System.out.println("값을 더할수 없습니다.");
		}
		
		System.out.println(aList8);
		
		try {
			aList8.remove(0);
		}catch(UnsupportedOperationException e) {
			e.printStackTrace();
			System.out.println("리스트 제거 불가능");
		}
		
		
		//수정은 가능하다.
		aList8.set(0, "오늘");
		System.out.println(aList8);
		
		
		
	}

}
