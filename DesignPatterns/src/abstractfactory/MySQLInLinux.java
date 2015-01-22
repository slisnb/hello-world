package abstractfactory;

public class MySQLInLinux implements MySQL {

	@Override
	public void query() {
System.out.println("MySQLInLinux query");
	}

	@Override
	public void delete() {
		System.out.println("MySQLInLinux delete");

	}

	@Override
	public void insert() {
		System.out.println("MySQLInLinux insert");

	}

	@Override
	public void update() {
		System.out.println("MySQLInLinux update");

	}

}
