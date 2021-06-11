package sec02.exam01_inheritance;
 
public class DmbCellPhone extends CellPhone { //부모 class와 같은 package에 있기 때문에 필드와 메소드가 모두 상속된다. 
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model; //부모 class
		this.color = color; //부모 class
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다");
	}
	
	void turnOffDmb() {
		System.out.println("dmb 방송 수신을 멈춥니다.");
	}
	
}
