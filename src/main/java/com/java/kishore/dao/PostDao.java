package com.java.kishore.dao;

import java.util.List;

import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.jpa.beans.Post;

public interface PostDao {
	public void savePost(Post post);
	public void savePostWithComment(Comment comment );
	public List<Post> listPost();
}
