package j12_다형성.인터페이스;

import java.util.Scanner;

import j12_다형성.인터페이스.usb.KeyBoard;
import j12_다형성.인터페이스.usb.Mouse;

public class ComputerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String select = null;
		ConnectionTerminal connetionTerminal = null;
		
		System.out.println("[컴퓨터 전원 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2. 빔프로젝트 연결");
		System.out.println("선택 >> ");
		
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			connetionTerminal = new Monitor(); //HDMI로 만들어짐, 최상위로 업캐스팅
		}else if(select.equals("2")) {
			connetionTerminal = new Beamproject();
		}else {
			System.out.println("메뉴를 잘못 선택하셨습니다.");
		}
		
		
		
		Computer computer = new Computer(connetionTerminal, new Mouse(), new KeyBoard()); //여기안에 넣는값에 따라 결과값이 달라짐, ex) 모니터, 빔 프로젝트
		
		computer.powerOn();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		computer.powerOff();
		
	}

}
