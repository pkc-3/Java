package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2021/05/26 
 * 이름 : 고현석
 * 내용 : Java 집합 컬렉션 실습하기
 */
public class CollectionSetTest {
	public static void main(String[] args) {
		
		//Set 생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);
		
		//Set 원소 갯수
		System.out.println("set 원소 갯수 : "+set.size()); // 배열에선 length 집합에선 size
		
		//Set 원소 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+",");
		}
	}
}
