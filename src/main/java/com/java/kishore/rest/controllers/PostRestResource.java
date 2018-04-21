package com.java.kishore.rest.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.kishore.date.util.CustomDateUtil;
import com.java.kishore.jpa.beans.Post;
import com.java.kishore.service.PostService;

@RestController
@RequestMapping("post")
public class PostRestResource {

	@Autowired
	PostService postService;

	@RequestMapping(value = "save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Post> savePost(@RequestBody Post post) {
		return new ResponseEntity<Post>(postService.savePost(post), HttpStatus.OK);
	}

	@RequestMapping(value = "find/id/{pid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Post> findPostById(@PathVariable(name = "pid") Optional<Integer> postId) {

		Post response = new Post();
		if (postId.isPresent()) {
			response = postService.findPostById(postId.get());
		} else {
			return new ResponseEntity<Post>(HttpStatus.BAD_REQUEST);
		}

		if (null != response) {
			return new ResponseEntity<Post>(response, HttpStatus.OK);
		}
		return new ResponseEntity<Post>(HttpStatus.NO_CONTENT);

	}
	
	@RequestMapping(value = "update", method = RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Post>> updatePost(@RequestBody Optional<List<Post>> posts) {

		if(posts.isPresent() && !posts.get().isEmpty()){
			return ResponseEntity.ok(postService.updatePosts(posts.get()));
		}else{
			return ResponseEntity.badRequest().build();
		}

	}

	@RequestMapping(value = "find/content/{content}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Post>> findPostByContent(@PathVariable(name = "content") Optional<String> content) {
		Optional<List<Post>> response;
		if (content.isPresent()) {
			response = Optional.ofNullable(postService.findPostByContent(content.get()));
		} else {
			return new ResponseEntity<List<Post>>(HttpStatus.BAD_REQUEST);
		}

		if (response.isPresent() && !response.get().isEmpty()) {
			return new ResponseEntity<List<Post>>(response.get(), HttpStatus.OK);
		}
		throw new PostNotFoundException("No post found");
	}

	@RequestMapping(value = "find/description/{description}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Post>> findPostByDescription(
			@PathVariable(name = "description") Optional<String> description) {
		Optional<List<Post>> response;
		if (description.isPresent()) {
			response = Optional.ofNullable(postService.findPostByDescription(description.get()));
		} else {
			return new ResponseEntity<List<Post>>(HttpStatus.BAD_REQUEST);
		}

		if (response.isPresent() && !response.get().isEmpty()) {
			return new ResponseEntity<List<Post>>(response.get(), HttpStatus.OK);
		}
		throw new PostNotFoundException("No post found");
	}

	@RequestMapping(value = "find/postedon/{postedon}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Post>> findPostByPostedOn(@PathVariable(name = "postedon") Optional<String> postedon) {
		Optional<List<Post>> response;
		try {
			if (postedon.isPresent()) {
				Optional<Date> formatedDate = Optional
						.ofNullable(CustomDateUtil.convertGivenDateStringToDate(postedon.get()));

				if (formatedDate.isPresent()) {
					response = Optional.ofNullable(postService.findPostByPostedOn(formatedDate.get()));
				} else {
					return new ResponseEntity<List<Post>>(HttpStatus.BAD_REQUEST);
				}
			} else {
				return new ResponseEntity<List<Post>>(HttpStatus.BAD_REQUEST);
			}

			if (response.isPresent() && !response.get().isEmpty()) {
				return new ResponseEntity<List<Post>>(response.get(), HttpStatus.OK);
			}
			// throw new PostNotFoundException("No post found");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
