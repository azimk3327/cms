package com.cms.movie.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="movie")
public class MovieEsEntity {
	@Id
	private String id;
	private String name;
	private String title;
	private String shortDescription;
	private String description;
	private List <String> Language;
	private List <String> timeSlot;
	private List <String> actors;
	private List <String> actress;
	private String meta;
	private List <String> tag;
	private Date releaseDate;
	private String banner;
	private Long totalView;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getLanguage() {
		return Language;
	}
	public void setLanguage(List<String> language) {
		Language = language;
	}
	public List<String> getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(List<String> timeSlot) {
		this.timeSlot = timeSlot;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}
	public List<String> getActress() {
		return actress;
	}
	public void setActress(List<String> actress) {
		this.actress = actress;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public List<String> getTag() {
		return tag;
	}
	public void setTag(List<String> tag) {
		this.tag = tag;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public Long getTotalView() {
		return totalView;
	}
	public void setTotalView(Long totalView) {
		this.totalView = totalView;
	}
	
}
