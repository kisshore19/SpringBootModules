package com.java.kishore.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.repository.CommentRepository;
import com.java.kishore.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;
	
	
	
	@Override
	public Comment saveComment(Comment comment) {
		
		return commentRepository.save(comment);
	}

	@Override
	public Comment findCommentById(Integer commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findCommentByContent(String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findCommentByDescription(String descrition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findCommentByCommentedOn(Date CommentedOn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> updateComments(List<Comment> Comments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCommentWithComment(Comment comment) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Comment> listComment() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Comment> searchComment(String key) {
		return commentRepository.findComments(key);
	}
}
