package com.java.kishore.dao.impl;

import com.java.kishore.dao.PostDao;
import com.java.kishore.dao.common.AbstractDao;

/*@Repository
@Transactional*/
public class PostDaoImpl extends AbstractDao implements PostDao {

	/*@Autowired
	ConnectionFactory connectionFactory;*/

	/*public void savePost(Post post) {
		save(post);
	}

	public void savePostWithComment(Comment comment) {
		save(comment);
	}
	
	@Override
	public List<Post> listPost() {
//		return connectionFactory.getSession().createCriteria(Post.class).list();
		Post post = connectionFactory.getSession().get(Post.class, 1);
		List<Post> posts  = new ArrayList<>();
		posts.add(post);
		return null;
	}*/
}
