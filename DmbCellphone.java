package Inheritance;

public class DmbCellphone extends Cellphone { //�ڽ�Ŭ����
	
	int channel;

	public DmbCellphone(int channel,String color,String model) {
		super(); //�θ� ������ ȣ���ϴ� �޼ҵ�. ���⼭�� �����ڰ� ���ǵǾ����� �ʾƼ� �⺻ �����ڰ� ȣ��Ǿ�����.
		this.channel = channel;
		this.color=color;
		this.model=model;
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
		
	}
	
	void turnOffDmb() {
		System.out.println("DMB��� ������ ����ϴ�.");
	}
	
}
