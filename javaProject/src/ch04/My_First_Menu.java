package ch04;

import java.util.Scanner;

public class My_First_Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		off ://라벨
		while(true) {
			int tmp2 = 0;
			System.out.println("== [메 뉴] ==");
			System.out.printf("(1) 한식\n(2) 양식\n(3) 중식\n");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0) > ");
			input = sc.next();
			int tmp = Integer.parseInt(input);
			menu://라벨
			switch (tmp) {
			case 0:
				break off;
			case 1:
				while(true) {
					System.out.println("[한식메뉴]");
					System.out.printf("1.김치찌개\n2.된장찌개\n3.삼겹살\n4.비빔밥\n");
					System.out.println("한식메뉴를 선택하세요.(한식메뉴선택종료 : 0, 전체종료 : 99) > ");
					input = sc.next();
					tmp2 = Integer.parseInt(input);
					switch (tmp2) {
					case 1:
						System.out.println(">>고객님은 김치찌개를 선택하셨습니다.");
						continue;
					case 2:
						System.out.println(">>고객님은 된장찌개를 선택하셨습니다.");
						continue;
					case 3:
						System.out.println(">>고객님은 삼겹살을 선택하셨습니다.");
						continue;
					case 4:
						System.out.println(">>고객님은 비빔밥을 선택하셨습니다.");
						continue;
					case 99:
						break off;
					case 0:
						break menu;
					default:
						System.out.println("잘못 입력하셨습니다 다시 선택해주세요.");
						continue;
					}
				}
			case 2:
					while(true) {
					System.out.println("[양식메뉴]");
					System.out.printf("1.돈까스\n2.비프스테이크\n3.카레라이스\n");
					System.out.println("양식메뉴를 선택하세요.(양식메뉴선택종료 : 0, 전체종료 : 99) > ");
					input = sc.next();
					tmp2 = Integer.parseInt(input);
					switch (tmp2) {
					case 1:
						System.out.println(">>고객님은 돈까스를 선택하셨습니다.");
						break;
					case 2:
						System.out.println(">>고객님은 비프스테이크를 선택하셨습니다.");
						break;
					case 3:
						System.out.println(">>고객님은 카레라이스를 선택하셨습니다.");
						break;
					case 99:
						break off;
					case 0:
						break menu;
					default:
						System.out.println("잘못 입력하셨습니다 다시 선택해주세요.");
						continue;
					}
				}
			case 3:
					while(true) {
					System.out.println("[중식메뉴]");
					System.out.printf("1.짜장면\n2.짬뽕\n3.탕수육\n");
					System.out.println("중식메뉴를 선택하세요.(중식메뉴선택종료 : 0, 전체종료 : 99) > ");
					input = sc.next();
					tmp2 = Integer.parseInt(input);
					switch (tmp2) {
					case 1:
						System.out.println(">>고객님은 짜장면을 선택하셨습니다.");
						break;
					case 2:
						System.out.println(">>고객님은 짬뽕을 선택하셨습니다.");
						break;
					case 3:
						System.out.println(">>고객님은 탕수육을 선택하셨습니다.");
						break;
					case 99:
						break off;
					case 0:
						break menu;
					default:
						System.out.println("잘못 입력하셨습니다 다시 선택해주세요.");
						continue;
					}
				}
			default:
				System.out.println("잘못 입력하셨습니다 다시 선택해주세요.");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
