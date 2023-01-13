package ch07;

public class Radio {
	String[] name = {"브리츠","아이리버"};
	double[] ch = {89.1,95.1};
	int[] vo = {12,9};
	boolean[] of = {true,false};
	
	public void print() {
		for(int i=0; i<name.length; i++) {
			System.out.printf("[%s 라디오]\n",name[i]);
			if(of[i] == true) {
				System.out.printf("라디오가 커져있습니다\n",name[i]);
			}else {
				System.out.printf("라디오가 꺼져있습니다\n",name[i]);
			}
			System.out.printf("현재 채널은 %.1f입니다.\n",ch[i]);
			System.out.printf("볼륨은 %d입니다.\n\n",vo[i]);
		}
	}
}
