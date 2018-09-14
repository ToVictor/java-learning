package designpattern.abstractFactory.second;

import designpattern.abstractFactory.first.User;

public class Client {
	public static void main(String[] args) {
		// 如果需要切换数据库，只需要改成 new OracleUserFactory()即可
		IFactory factory = new SqlserverFactory();
		
		IUserDAO userDAO = factory.createUserDAO();
		userDAO.insert(new User());
		userDAO.getUser(1);
	}
}
