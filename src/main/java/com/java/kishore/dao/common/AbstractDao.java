package com.java.kishore.dao.common;

import javax.transaction.Transactional;

@Transactional
public abstract class AbstractDao {

	/*@Autowired
	ConnectionFactory connectionFactory;

	// Saving object
	public Serializable save(Object object) {
		connectionFactory.getSession().persist(object);
		return null;///connectionFactory.getSession().save(object);

	}

	// delete object
	public void delete(Object object) {
		connectionFactory.getSession().delete(object);

	}*/
	
	

	/*// Update object
	public Object update(Object object) { // merge is used to update the few fields/ given fields
		Session session = connectionFactory.getSession(); 
		session.find(entityClass, primaryKey)
		connectionFactory.getSession().update(object);
		 return null;

	}*/

	/*public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}*/

}
