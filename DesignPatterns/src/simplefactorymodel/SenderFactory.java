package simplefactorymodel;

public class SenderFactory {
	public static Sender provideSms(){
		return new SenderSms();
	}
	public static Sender provideEmail(){
		return new SenderEmail();
	}
}
