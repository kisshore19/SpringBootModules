package com.java.kishore.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.kishore.jpa.beans.Post;
import com.java.kishore.service.PostService;

@RestController
@RequestMapping("comment")
public class CommentsRestController {

	@Autowired
	PostService postService;

	@RequestMapping(value = "/save", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
	MediaType.APPLICATION_JSON_VALUE }, method = { RequestMethod.POST })
	public Post savePost(@RequestBody Post post) {
		postService.savePost(post);
		return post;
	}

	@RequestMapping(value="/list", produces = {MediaType.APPLICATION_JSON_VALUE }, 
	method = { RequestMethod.GET})
	public List<Post> listPosts() {
		List<Post> posts = postService.listPost();
		if(null == posts){
				posts = new ArrayList<>();
		}
		return posts;
	}
}
