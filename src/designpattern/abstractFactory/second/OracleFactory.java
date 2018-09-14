package designpattern.abstractFactory.second;

public class OracleFactory implements IFactory {

	@Override
	public IUserDAO createUserDAO() {
		return new OracleUserDAO();
	}

}
