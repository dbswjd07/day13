package thread;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age;
	ArrayList<Integer> age2= new ArrayList<>(); 
	int [] age1 = new int[6];
	
	while(true) {
		System.out.println("인증 프로그램입니다");
		System.out.println("05년생 이상은 '가입불가'");
		System.out.println("04년생 이하는 '가입가능'");
		System.out.println("'A,ㅁ,ㅋ 문자는 잘못 입력'");
		System.out.print("생년 월일 입력 (6자리): ");
		
		
		
		try {
			age2.add(input.nextInt());
			
			if(age2.size() != 6) {
				System.out.println("길이가 틀렸습니다");
			}
			
			switch(age2.get(0)) {
			case 0: 
				if(age2.get(1)<=4) {
					System.out.println("가입 가능");
				}else {
					System.out.println("가입 불가능");
				}
				break;
			case 1: 
				System.out.println("가입 불가능");
				break;
			case 2: 
				System.out.println("가입 불가능");
				break;
			default:
				System.out.println("가입 가능");
			}
			
			
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요!!!");
			// TODO: handle exception
		}
		
		System.out.println();
		
//		
//		try {
//			
//			
//			if(age>= 20050000) {
//				System.out.println("'가입불가'");
//			}else if(age <= 20040000) {
//				System.out.println("'가입가능'");
//				break;
//			} else if (age < 1) {
//				Exception e = new Exception("숫자만 입력하세요!!!");
//				throw e;
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		
		
		
		
		
	}
}
}
