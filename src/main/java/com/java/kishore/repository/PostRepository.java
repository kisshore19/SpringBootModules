package com.java.kishore.repository;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.java.kishore.jpa.beans.Post;

public interface PostRepository extends CrudRepository<Post, Serializable>{
	
	@Override
	@Transactional
	Iterable<Post> findAll();
	
	
	
	

}
