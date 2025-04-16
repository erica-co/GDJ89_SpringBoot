package com.winter.app.board;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardVO {
	
	//DTO : Data Transfer Object
	//VO : Value Object (읽기 전용, 수정 불가, setterX)

	private Long boardNum;
	private String boardTitle;
	private String boardContents;
	private Date boardDate;
	private Long boardHit;
	private String userName;

}
