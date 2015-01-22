package abstractfactory;

public class MySQLInWindows implements MySQL {

	@Override
	public void query() {
		System.out.println("MySQLInWindows query");

	}

	@Override
	public void delete() {
		System.out.println("MySQLInWindows delete");

	}

	@Override
	public void insert() {
		System.out.println("MySQLInWindows insert");

	}

	@Override
	public void update() {
		System.out.println("MySQLInWindows update");

	}

}
