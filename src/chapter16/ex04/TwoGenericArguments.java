package chapter16.ex04;

// 제너릭 클래스 : 타입변수가 2개인 제너릭 클래스.
//
class KeyValue<k,v>{
	private k key;
	private v value;
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
	
}

public class TwoGenericArguments {

	public static void main(String[] args) {
		// 	1. <String,Integer> 타입으로 객체 생성
		KeyValue<String,Integer> kv1 = new KeyValue<>();
		
		//setter 를 사용해서 값 할당
		kv1.setKey("사과");	//String
		kv1.setValue(1000);	//Integer
		
		//getter 를 사용해서 값 출력
		String key1 = kv1.getKey();
		Integer value1 = kv1.getValue();
		
		//2. <Integer, String> 
		KeyValue<Integer , String> kv2 = new KeyValue<>();
		
		//setter 를 사용해서 값 입력.
		kv2.setKey(404);
		kv2.setValue("NotFound : 요청한 페이지를 찾지 못했습니다.");
		
		//getter를 사용해서 값 출력.
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		//3. <String , Void > <==== void 는 해당 필드,메소드를 사용하지 않음.
		KeyValue<String,Void> kv3 = new KeyValue<>();
		kv3.setKey("키 값만 사용");
		System.out.println(kv3.getKey());
		
		
	}

}
