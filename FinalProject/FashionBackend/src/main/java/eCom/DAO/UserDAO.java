package eCom.DAO;

import eCom.Model.UserDeatials;

public interface UserDAO {

	public boolean registerUser(UserDeatials user);
	public boolean updateUser(UserDeatials user);
	
	public UserDeatials getUser(String userName);
}
