package simplefactorymodel;

public class SenderSms implements Sender {

	@Override
	public void send() {
		System.out.println("send Sms!");
	}

	@Override
	public void receive() {
		System.out.println("receive Sms!");
	}

}
