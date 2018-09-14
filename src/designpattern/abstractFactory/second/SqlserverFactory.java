package designpattern.abstractFactory.second;

public class SqlserverFactory implements IFactory {

	@Override
	public IUserDAO createUserDAO() {
		return new SqlserverUserDAO();
	}

}
