package Inheritance;

public class DmbCellphoneExample { //�ڽ�Ŭ�������

	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone(10,"�ڹ���","����");
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��:" + dmbCellphone.model);
		System.out.println("����:" + dmbCellphone.color);
		
		//DmbCellphone �� �ʵ�
		System.out.println("ä�� : " + dmbCellphone.channel);
		
		//Cellphone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ��� ! ���� ȫ�浿�ε���");
		dmbCellphone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellphone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
	}

}
