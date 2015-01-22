package abstractfactory;

public class OracleInLinux implements Oracle {

	@Override
	public void query() {
		System.out.println("OracleInLinux query");

	}

	@Override
	public void delete() {
		System.out.println("OracleInLinux delete");

	}

	@Override
	public void insert() {
		System.out.println("OracleInLinux insert");

	}

	@Override
	public void update() {
		System.out.println("OracleInLinux update");

	}

}
