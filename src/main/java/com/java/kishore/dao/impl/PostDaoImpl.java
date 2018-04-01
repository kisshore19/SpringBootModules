package com.java.kishore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.kishore.configuration.ConnectionFactory;
import com.java.kishore.dao.PostDao;
import com.java.kishore.dao.common.AbstractDao;
import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.jpa.beans.Post;

@Repository
@Transactional
public class PostDaoImpl extends AbstractDao implements PostDao {

	@Autowired
	ConnectionFactory connectionFactory;

	public void savePost(Post post) {
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
		return posts;
	}
}
