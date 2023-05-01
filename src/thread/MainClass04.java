package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread{
	JFrame frame;
	JLabel label;
	public A04(){
		frame = new JFrame("label example");
		Container con = frame.getContentPane();
		label = new JLabel("test label");
		label.setText("aaaa");
		Font font = new Font(null,Font.ITALIC,32);
		label.setFont(font);
		con.add(label);
		frame.setLocation(1000,200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void run() {
		frame.setVisible(true);
		
		while(true) { 
			Date date = new Date();
			SimpleDateFormat d = new SimpleDateFormat("aa hh시 mm분 ss초");
			String s = d.format(date);
			label.setText(s); 
			}
	}
}
public class MainClass04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	A04 a = new A04();
	int num=0;
	String id=null,pwd=null,inputId,inputPwd;
	
	while(true) {
		
		System.out.println("1.로그인  2.회원가입  3.로그아웃");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("아이디 입력: ");
			inputId = input.next();
			System.out.print("비밀번호 입력: ");
			inputPwd = input.next();

			if(id.contains(inputId)) {
				if(pwd.contains(inputPwd)) {
					System.out.println("인증통과");
					a.start();
					System.out.println("==== 환영합니다 ====");
//					System.out.println("1.기능");
//					System.out.println("2.off");
//					System.out.print(">>> ");
				}else {
					System.out.println("인증 실패");
				}
				
			}
			break;
		case 2:
			System.out.print("새로운 아이디 입력: ");
			id = input.next();
			System.out.print("새로운 비밀번호 입력: ");
			pwd = input.next();
			System.out.println("회원가입 완료");
			break;
		case 3:
			System.out.println("로그아웃");
			System.exit(1);
		}

	}
}
}
