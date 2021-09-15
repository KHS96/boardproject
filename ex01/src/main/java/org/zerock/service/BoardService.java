package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;


public interface BoardService {

  public void regist(BoardVO vo) throws Exception;

  public BoardVO read(String 스타일) throws Exception;

  public void modify(BoardVO board) throws Exception;

  public void remove(String 스타일) throws Exception;

  public List<BoardVO> listAll() throws Exception;
}
