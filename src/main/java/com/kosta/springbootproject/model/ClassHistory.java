package com.kosta.springbootproject.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Builder
@EntityListeners(AuditingEntityListener.class)
public class ClassHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long classHistoryNo;
	
	@Enumerated(EnumType.STRING)
	private ClassHistoryEnumType classHistoryState;
	
	@CreatedDate
	private LocalDateTime classHistoryDate;
	
	//양방향
	@ManyToOne
	private User user;
	
	//양방향
	@ManyToOne
	private Classes classes;
}
