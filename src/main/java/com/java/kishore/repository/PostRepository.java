package com.java.kishore.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.java.kishore.jpa.beans.Post;

public interface PostRepository extends JpaRepository<Post, Serializable> {

	@SuppressWarnings("unchecked")
	@Transactional
	//public Post save(Iterable<Post> entity);
	/*public List<Post> save(Iterable<Post> entities);*/
	
/*	@Override
	Post findOne(Serializable id);
*/
	public Post findById(Integer postId);

	public List<Post> findByContent(String content);

	public List<Post> findByDescription(String description);

	public List<Post> findByPostedOn(Date postedOn);
	
	

	@Override
	List<Post> findAll();

}
