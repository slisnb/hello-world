package factorymethod;

public class SenderSmsFactory implements Provider{

	@Override
	public Sender provide() {
		return new SenderSms();
	}

}
