package com.mlbeez.feeder.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;
@Entity
@Table(name = "feeds")
public class Feed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Use GenerationType.IDENTITY for auto-generated IDs
	@Column(columnDefinition = "bigint")
	@ColumnTransformer(read = "id::bigint")
	private Long id;

	private String title;
	
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String link;
	
	private String description;
	private String author;
	private String category;
	private String tags;
	private String img;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
