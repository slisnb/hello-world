package abstractfactory;

public class WindowsSystem implements OperatingSystem {
	public Oracle oracle(){
		return new OracleInWindows();

	}
	public MySQL mysql(){
		return new MySQLInWindows();
	}
}
