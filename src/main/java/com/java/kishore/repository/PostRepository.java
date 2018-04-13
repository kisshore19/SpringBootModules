package com.java.kishore.repository;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.kishore.jpa.beans.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Serializable>{
	
	@Override
	@Transactional
	Iterable<Post> findAll();

}
