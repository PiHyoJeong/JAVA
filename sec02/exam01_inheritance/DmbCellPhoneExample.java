package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10); //자식 객체 생성

		System.out.println("모델 : " + dmbCellPhone.model); //부모의 필드를 읽을 수 있다.
		System.out.println("색상 : " + dmbCellPhone.color); //
		
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 홍길동입니다.");
		dmbCellPhone.sendVoice("아 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
	}
	

}
