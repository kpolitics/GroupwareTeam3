package com.team3.groupware.eunji.model;

import java.util.List;
import java.util.Map;

public interface BoardDAO {

	// 게시글 db 전달
	void board_write_insert(BoardVO boardVo);

	// 일반게시판 리스트 불러오기
	List<BoardVO> board_selectList(BoardVO boardVo);

	// 게시글 디테일 데이터 불러오기
	Map<String, Object> board_detail(Map<String, Object> map);

	// 게시글 수정
	void board_modify(BoardVO boardVo);



}
