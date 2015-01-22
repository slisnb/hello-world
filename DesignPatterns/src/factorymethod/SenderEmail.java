package factorymethod;

public class SenderEmail implements Sender {

	@Override
	public void send() {
        System.out.println("send Email!");
	}

	@Override
	public void receive() {
		System.out.println("receive Email!");
	}

}
