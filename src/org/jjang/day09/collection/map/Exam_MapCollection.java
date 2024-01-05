package org.jjang.day09.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam_MapCollection {
	public static void main(String[] args) {
		// 컬렉션은 저장소 역할. 데이터 다루는 방법에 따라
		// List Set Map을 선택해서 혼용
		// 대기자 리스트 -> List
		// 순서 상관 x, 중복 제거 -> Set
		// 지역번호 -> Map
		Map<String, String> regionNum = new HashMap<String, String>();
		regionNum.put("02", "서울");
		regionNum.put("031", "경기도");
		regionNum.put("032", "인천광역시");
		regionNum.put("033", "강원특별자치도");
		regionNum.put("041", "충청남도");
		regionNum.put("041", "대전광역시");
		regionNum.put("043", "충청북도");
		regionNum.put("044", "세종특별자치시");
		regionNum.put("051", "부산");
		regionNum.put("052", "울산");
		regionNum.put("053", "대구");
		regionNum.put("054", "경상북도");
		regionNum.put("055", "경상남도");
		regionNum.put("061", "전라남도");
		regionNum.put("062", "광주광역시");
		regionNum.put("063", "전라북도");
		regionNum.put("064", "제주특별자치도");
		                  
		System.out.println("02를 누르면: "+regionNum.get("02"));
		System.out.println("031을 누르면: "+regionNum.get("031"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {			
			System.out.print("지역번호 입력: ");
			String num = sc.next();
			if(num.equals("exit")) {
				break;
			}
			else if(regionNum.get(num)==null) {
				System.out.println("존재하지 않는 지역번호입니다.");
				continue;
			}
			System.out.println("입력하신 지역번호에 대한 지역은: "+regionNum.get(num));
		}
	}
}
