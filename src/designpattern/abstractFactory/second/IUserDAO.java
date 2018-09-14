package designpattern.abstractFactory.second;

import designpattern.abstractFactory.first.User;

public interface IUserDAO {
	void insert(User user);
	User getUser(int id);
}
