package kaiwa;

import java.util.Scanner;

public class kaiwa {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("[�����̒��q�͂ǂ��ł����H]");
		System.out.println("1:�����ǂ���B");
		System.out.println("2:��D��"); 
		System.out.println("3:�̒�������");
		System.out.println("4:�`���x���O�ł��B");
		System.out.print("�I���F"); int n = stdIn.nextInt();
		 
		
	switch (n) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
	if(n == 1) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("�I���F"); int x = stdIn.nextInt();
	}else if(n == 2) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("�I���F"); int x = stdIn.nextInt();
	}else if(n == 3) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("�I���F"); int x = stdIn.nextInt();
	
	}else if(n == 4) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("�I���F"); int x = stdIn.nextInt();
	}
}
}