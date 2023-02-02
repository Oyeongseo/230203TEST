package com.korea1.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardVO {

	private int bno;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private String updatedate;



}
