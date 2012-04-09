package exercise;

import exercise.connection.*;

public class E08_ConnectionManager {
	public static void main(String[] args) {
		Connection connection = ConnectionManager.getConnection();
		while (connection != null) {
			System.out.println(connection);
			connection.doSomething();
			connection = ConnectionManager.getConnection();
		}
	}
}
