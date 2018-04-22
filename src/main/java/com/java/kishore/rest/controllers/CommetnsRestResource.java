package com.java.kishore.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.kishore.jpa.beans.Comment;
import com.java.kishore.jpa.beans.Post;
import com.java.kishore.service.CommentService;
import com.java.kishore.service.PostService;

@RestController
@RequestMapping("comments")
public class CommetnsRestResource {

	@Autowired
	CommentService commentService;

	@Autowired
	PostService postService;

	@RequestMapping(value = "save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Comment> save(@RequestBody Optional<Comment> comment) {

		Comment saveComment = null;
		if (comment.isPresent()) {
			Post findPostById = postService.findPostById(comment.get().getPost().getId());
			Comment commentsToSave = comment.get();
			commentsToSave.setPost(findPostById);
			saveComment = commentService.saveComment(comment.get());
		}
		return ResponseEntity.ok(saveComment);

	}

	@RequestMapping(value = "search/{key}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Comment>> searchComment(@PathVariable("key") Optional<String> searchKey) {

		List<Comment> searchComment = null;
		if (searchKey.isPresent()) {
			searchComment = commentService.searchComment(searchKey.get());
		}
		return ResponseEntity.ok(searchComment);
	}

	@RequestMapping(value = "searchWithPost/{key}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Comment>> searchCommentWithPost(@PathVariable("key") Optional<String> searchKey) {
		
		List<Comment> searchComment = null;
		if (searchKey.isPresent()) {
			searchComment = commentService.searchCommentAndItsPost(searchKey.get());
		}
		return ResponseEntity.ok(searchComment);
	}

}
