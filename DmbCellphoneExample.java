package Inheritance;

public class DmbCellphoneExample { //자식클래스사용

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone(10,"자바폰","검정");
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델:" + dmbCellphone.model);
		System.out.println("색상:" + dmbCellphone.color);
		
		//DmbCellphone 의 필드
		System.out.println("채널 : " + dmbCellphone.channel);
		
		//Cellphone으로부터 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요 ! 저는 홍길동인데요");
		dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		dmbCellphone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
	}

}
