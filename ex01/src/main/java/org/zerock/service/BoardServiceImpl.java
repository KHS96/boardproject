package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

  @Inject
  private BoardDAO dao;

  @Override
  public void regist(BoardVO vo) throws Exception {
    dao.create(vo);
  }

  @Override
  public BoardVO read(String 스타일) throws Exception {
    return dao.read(스타일);
  }

  @Override
  public void modify(BoardVO board) throws Exception {
    dao.update(board);
  }

  @Override
  public void remove(String 스타일) throws Exception {
    dao.delete(스타일);
  }

  @Override
  public List<BoardVO> listAll() throws Exception {
    return dao.listAll();
  }
  

@Override
public List<BoardVO> listCriteria(Criteria cri) throws Exception {
	return dao.listCriteria(cri);
}

@Override
public int listCountCriteria(Criteria cri) throws Exception {
	return dao.countPaging(cri);
}

@Override
public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {
	return dao.listSearch(cri);
}

@Override
public int listSearchCount(SearchCriteria cri) throws Exception {
	return dao.listSearchCount(cri);
}


}
