package com.java.kishore.jpa.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "POSTS")
public class Post implements Serializable {
	private static final long serialVersionUID = -5865487794789834906L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POST_ID")
	private Integer id;
	@Column(name = "CONTENT")
	private String content;
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "POSTED_ON")
	private Date postedOn;

    @JsonManagedReference
	@OneToMany(mappedBy = "post", fetch = FetchType.EAGER, targetEntity = Comment.class, cascade = CascadeType.ALL)
	private Set<Comment> comments;
	
    
    @PrePersist
	void onCreate() {
		this.postedOn = new java.util.Date();
	}
    
	public Integer getId() {
		return id;
	}

	public Post setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getContent() {
		return content;
	}
	
	
	public Post setContent(String content) {
		this.content = content;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Post setDescription(String description) {
		this.description = description;
		return this;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public Post setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
		return this;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public Post setComments(Set<Comment> comments) {
		if (comments == null) {
			comments = new HashSet<Comment>();
		}
		this.comments = comments;
		return this;
	}

}
