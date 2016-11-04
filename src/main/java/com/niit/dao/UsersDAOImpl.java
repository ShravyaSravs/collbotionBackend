package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Users;

@SuppressWarnings("deprecation")
@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/* Used for creating or updating user */
	@Transactional
	public void saveOrUpdate(Users users) {
		sessionFactory.getCurrentSession().saveOrUpdate(users);
	}

	/* Used for deleting user */
	@Transactional
	public void delete(Users users) {
		sessionFactory.getCurrentSession().delete(users);
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional
	public List<Users> list() {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Users.class);
		List<Users> list=c.list();
		return list;
	}

	/* Used to retrieve single user based on username 
	@Transactional
	public Users getUser(String username) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Users.class);
		c.add(Restrictions.eq("username", username));
		Users users=(Users)c.uniqueResult();
		return users;
	}

	@Transactional
	public Users viewUser(int userid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Users.class);
		c.add(Restrictions.eq("userid", userid));
		Users blog=(Users) c.uniqueResult();
		return blog;
		
	}*/

}