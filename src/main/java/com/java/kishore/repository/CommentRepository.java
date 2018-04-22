package com.java.kishore.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.kishore.jpa.beans.Comment;

public interface CommentRepository extends  JpaRepository<Comment, Serializable> {

	//Like operator on one table
	@Query("SELECT C FROM Comment C WHERE C.comment LIKE %:cmtTxt%")
	public List<Comment> findComments(@Param("cmtTxt") String commentText);
	
	
	// Inner join on two tables with condition
	@Query("SELECT C,P FROM Comment C JOIN Post P ON C.id=P.id AND C.comment LIKE %:cmtTxt%")
	public List<Comment> findCommentsAndItsPosts(@Param("cmtTxt") String commentSearchKey);
}
