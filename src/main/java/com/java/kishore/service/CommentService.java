package com.java.kishore.service;

import java.util.Date;
import java.util.List;

import com.java.kishore.jpa.beans.Comment;

public interface CommentService {

	public Comment saveComment(Comment Comment);

	public Comment findCommentById(Integer CommentId);

	public List<Comment> searchCommentAndItsPost(String key);

	public List<Comment> findCommentByContent(String content);

	public List<Comment> findCommentByDescription(String descrition);

	List<Comment> findCommentByCommentedOn(Date CommentedOn);

	List<Comment> updateComments(List<Comment> Comments);

	public void saveCommentWithComment(Comment comment);

	public List<Comment> listComment();

	public List<Comment> searchComment(String key);
}
