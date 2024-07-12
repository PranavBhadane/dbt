package com.app.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="railways")

public class RailwayEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name",nullable=false)
	private String name;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="category")
	private Category category;
	
	@Column(name="start_time",nullable = false)
	private String start_time;
	
	@Column(name="end_time",nullable = false)
	private String end_time;
	
	@Column(name="Source",nullable = false)
	private String source;
	
	@Column(name="destintion",nullable = false)
	private String destination;
	
	@Column(name="station_code",nullable = false)
	private String station_code;
	
	@Column(name="distance",nullable = false)
	private long distance;
	
	@Column(name="frequency",nullable = false)
	private long frequence;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStation_code() {
		return station_code;
	}

	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	public long getFrequence() {
		return frequence;
	}

	public void setFrequence(long frequence) {
		this.frequence = frequence;
	}
	
	

}
