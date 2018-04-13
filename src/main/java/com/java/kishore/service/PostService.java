package com.java.kishore.service;

import java.util.List;

import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.jpa.beans.Post;

public interface PostService {
	public void savePost(Post post);
	public void savePostWithComment(Comment comment );
	public List<Post> listPost();
}
