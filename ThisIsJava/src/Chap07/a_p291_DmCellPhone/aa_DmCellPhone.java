package Chap07.a_p291_DmCellPhone;

public class aa_DmCellPhone extends ab_CellPhone{
	//필드
	int channel;
	
	//생성자
	aa_DmCellPhone(String model, String color, int channel){
		this.model = model;// 부모클래스
		this.color = color;// 부모클래스
		this.channel = channel;
	}
	//메소드
	 void turnOnDmb() {
		 System.out.println("채널 "+channel + "번 DMB 방송 수신을 시작합니다");
	 }
	 void changeChannelDmb(int channel) {
		 this.channel = channel;
		 System.out.println("채널 "+ channel + "번으로 바꿉니다");
	 }
	 void turnOffDmb() {
		 System.out.println("DMB 방송 수신을 멈춥니다");
		 
	 }
}


