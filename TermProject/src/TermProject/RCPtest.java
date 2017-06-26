package TermProject;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class RCPtest {
	
	private static int usernum;
	private static int comnum;
	private static int coin = 20;
	private static int getcoin;
	
	static void coinCheck() { //user�� ������ check�ϴ� method
		
		System.out.println("����" + coin + "���� ������ ������ �ֽ��ϴ�.");
		
		if(coin == 0) {
			System.out.println("����" + coin + "���� ������ ������ �����Ƿ� ������ ���� �� �� �����ϴ�.");
			System.out.println("1���� ������ �帮�ڽ��ϴ�.");
			coin = coin + 1;
		}
		
	}
		
	static void userInput() { //user���� ���������� �� �Ѱ����� �Է¹޴� method
		
		Scanner scanner = new Scanner(System.in);
		
		if(coin > 0) {
			System.out.printf("�������������� �� ���� �����ϼ���(0. ����, 1. ����, 2. ��) : ");
			usernum = scanner.nextInt();

			if(usernum == 0) {
				System.out.println("����� ������ �����Ͽ����ϴ�.");
				comOutput();
				result();
			}
			else if(usernum == 1) {
				System.out.println("����� ������ �����Ͽ����ϴ�.");
				comOutput();
				result();
			}
			else if(usernum == 2) {
				System.out.println("����� ���� �����Ͽ����ϴ�.");
				comOutput();
				result();
			}
			else {
				System.out.println("�߸� �� �Է��� �Ͽ����ϴ�. 0, 1, 2 �߿� �Է��ϼ���.");
			}
		}
	}
	
	static void comOutput () { //computer�� ���������� �� ������ ������ ������ִ� method
		
		Random random = new Random();
		
		comnum = random.nextInt(3);
		if(comnum == 0) {
			System.out.println("��ǻ�ʹ� ������ �����Ͽ����ϴ�.");
		}
		else if(comnum == 1) {
			System.out.println("��ǻ�ʹ� ������ �����Ͽ����ϴ�.");
		}
		else if(comnum == 2) {
			System.out.println("��ǻ�ʹ� ���� �����Ͽ����ϴ�.");
		}
		
	}
	
	static void getCoin() { //������ ��� method
		
		Random random = new Random();
		
		getcoin = random.nextInt(20) + 1;
		System.out.println(getcoin + "���� ������ ������ϴ�.");
		coin = coin + getcoin;
		System.out.println("��" + coin + "���� ������ ������ �ֽ��ϴ�.");
	
	}
	
	static void result() { //������ ����� �˷��ִ� method
		if(usernum == comnum) {
			System.out.println("�����ϴ�!");
		}
		else if((usernum == 0 && comnum == 1) || (usernum == 1 && comnum == 2) || (usernum == 2 && comnum == 0)) {
			System.out.println("�й��Ͽ����ϴ�!");
			coin = coin - 1;
		}
		else if((usernum == 1 && comnum == 0) || (usernum == 2 && comnum == 1) || (usernum == 0 && comnum == 2)) {
			System.out.println("�¸��Ͽ����ϴ�!");
			getCoin();
		}
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			coinCheck();
			try {
				userInput();
			}
			catch(InputMismatchException ime) {
				System.out.println("���ڿ��� �Է��Ͽ����ϴ�. 0, 1, 2 �߿��� �Է��ϼ���");
			}
		}
	}
}