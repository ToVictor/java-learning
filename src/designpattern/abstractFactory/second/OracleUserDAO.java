package designpattern.abstractFactory.second;

import designpattern.abstractFactory.first.User;

public class OracleUserDAO implements IUserDAO {

	@Override
	public void insert(User user){
		System.out.println("在Oracle中给User表增加一条记录");
	}
	
	@Override
	public User getUser(int id){
		System.out.println("在Oracle中根据ID得到User表的一条记录");
		return null;
	}

}
