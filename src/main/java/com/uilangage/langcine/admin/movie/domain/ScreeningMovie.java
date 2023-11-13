package com.uilangage.langcine.admin.movie.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name="screening_info")
@Entity
public class ScreeningMovie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="theaterId")
	private int theaterId;
	
	@Column(name="movieId")
	private int movieId;
	
	@Column(name="movieTime")
	private String movieTime;
	
	@UpdateTimestamp
	@Column(name="createdAt", updatable=false)
	private Date createdAt;
	@UpdateTimestamp
	@Column(name="updatedAt")
	private Date updatedAt;
	
	
	
}
