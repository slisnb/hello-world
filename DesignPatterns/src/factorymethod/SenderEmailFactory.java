package factorymethod;

public class SenderEmailFactory implements Provider{

	@Override
	public Sender provide() {
     return new SenderEmail();		
	}

}
