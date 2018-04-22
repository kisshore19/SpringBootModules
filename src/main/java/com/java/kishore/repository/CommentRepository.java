package com.java.kishore.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.kishore.jpa.beans.Comment;

public interface CommentRepository extends  JpaRepository<Comment, Serializable> {

	@Query("SELECT C FROM Comment C WHERE C.comment LIKE %:cmtTxt%")
	public List<Comment> findComments(@Param("cmtTxt") String commentText);
}
