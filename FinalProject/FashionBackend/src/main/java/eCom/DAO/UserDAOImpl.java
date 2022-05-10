package eCom.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eCom.Model.UserDeatials;

@Repository("UserDetails")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean registerUser(UserDeatials user) {

		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateUser(UserDeatials user) {

		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public UserDeatials getUser(String userName) {

		Session session = sessionFactory.openSession();

		UserDeatials userDeatials = (UserDeatials) session.get(UserDeatials.class, userName);

		session.close();
		return userDeatials;
	}

}
