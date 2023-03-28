package com.abhi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	private Integer BookId;
	private String BookName;
	private Double BookPrice;

}
