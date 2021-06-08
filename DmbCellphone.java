package Inheritance;

public class DmbCellphone extends Cellphone { //자식클래스
	
	int channel;

	public DmbCellphone(int channel,String color,String model) {
		super(); //부모 생성자 호출하는 메소드. 여기서는 생성자가 정의되어있지 않아서 기본 생성자가 호출되어진다.
		this.channel = channel;
		this.color=color;
		this.model=model;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
		
	}
	
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
}
