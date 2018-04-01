package com.java.kishore.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.kishore.dao.PostDao;
import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.jpa.beans.Post;
import com.java.kishore.service.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {
	@Autowired
	PostDao postDao;

	public void savePost(Post post) {
		postDao.savePost(post);
	}

	public void savePostWithComment(Comment comment) {
		postDao.savePostWithComment(comment);
	}

	@Override
	public List<Post> listPost() {
		return postDao.listPost();
	}

}
