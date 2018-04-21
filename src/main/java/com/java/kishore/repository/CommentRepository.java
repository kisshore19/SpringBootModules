package com.java.kishore.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.kishore.jpa.beans.Comment;

public interface CommentRepository extends  JpaRepository<Comment, Serializable> {

	
}
