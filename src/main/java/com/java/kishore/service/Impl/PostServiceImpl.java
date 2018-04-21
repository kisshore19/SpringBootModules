package com.java.kishore.service.Impl;

import java.util.Date;
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
	public Post savePost(Post post) {
		return postRepository.save(post);
	}
	
	@Override
	public Post findPostById(Integer postId) {
		return postRepository.findById(postId);
	}
	
	@Override
	public List<Post> findPostByContent(String content) {
		return postRepository.findByContent(content);
	}
	
	@Override
	public List<Post> findPostByDescription(String description) {
		return postRepository.findByDescription(description);
	}
	
	@Override
	public List<Post> findPostByPostedOn(Date postedOn) {
		return postRepository.findByPostedOn(postedOn);
	}
	
	@Override
	public List<Post> updatePosts(List<Post> posts) {
		List<Post> save = postRepository.save(posts);
		postRepository.flush();
		return save;
	}
	
	///////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	@Override
	public void savePostWithComment(Comment comment) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> listPost() {
		/*
		 * List<Post> posts = new ArrayList();
		 * postRepository.findAll().forEach(e->posts.add(e)); return posts;
		 */
		return postRepository.findAll();
	}
	/*
	 * @Autowired PostDao postDao;
	 * 
	 * public void savePost(Post post) { postDao.savePost(post); }
	 * 
	 * public void savePostWithComment(Comment comment) {
	 * postDao.savePostWithComment(comment); }
	 * 
	 * @Override public List<Post> listPost() { return postDao.listPost(); }
	 */

}
