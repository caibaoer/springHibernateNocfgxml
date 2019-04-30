package com.huangpan.daoImpl;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.huangpan.dao.UserDao;
import com.huangpan.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Override
	public void insert(User user) {
		this.getHibernateTemplate().save(user);

	}

}
