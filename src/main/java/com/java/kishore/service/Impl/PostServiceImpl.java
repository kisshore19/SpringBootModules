package com.java.kishore.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.jpa.beans.Post;
import com.java.kishore.repository.PostRepository;
import com.java.kishore.service.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;
	
	@Override
	public void savePost(Post post) {
		
	}

	@Override
	public void savePostWithComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Post> listPost() {
		List<Post> posts = new ArrayList();
		postRepository.findAll().forEach(e->posts.add(e));
		return posts;
	}
	/*@Autowired
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
	}*/
	
	

}
