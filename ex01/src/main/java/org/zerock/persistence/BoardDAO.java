package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardDAO {

  public void create(BoardVO vo) throws Exception;

  public BoardVO read(String 스타일) throws Exception;

  public void update(BoardVO vo) throws Exception;

  public void delete(String 스타일) throws Exception;

  public List<BoardVO> listAll() throws Exception;

}
