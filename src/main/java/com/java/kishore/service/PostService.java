package com.java.kishore.service;

import java.util.Date;
import java.util.List;

import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.jpa.beans.Post;

public interface PostService {
	public Post savePost(Post post);

	public Post findPostById(Integer postId);

	public List<Post> findPostByContent(String content);

	public List<Post> findPostByDescription(String descrition);

	List<Post> findPostByPostedOn(Date postedOn);
	
	List<Post> updatePosts(List<Post> posts);

	public void savePostWithComment(Comment comment);

	public List<Post> listPost();

}
