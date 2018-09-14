package designpattern.abstractFactory.first;

public class Client {
	public static void main(String[] args) {
		User user = new User();
		
		//直接实例化SqlserverDAO实例，当需要替换其它数据库时就必须做修改
		SqlserverUserDAO sqlserverDAO = new SqlserverUserDAO();
		sqlserverDAO.insert(user);
		sqlserverDAO.getUser(1);
	}
}
