package abstractfactory;

public class LinuxSystem implements OperatingSystem {
	public Oracle oracle(){
		return new OracleInLinux();
	}
	public MySQL mysql(){
		return new MySQLInLinux();
	}
}
