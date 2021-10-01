package org.zerock.controller;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class BoardDAOTest {

  @Inject
  private BoardDAO dao;

  private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

	/*
	 * @Test public void testCreate() throws Exception {
	 * 
	 * BoardVO board = new BoardVO(); board.set스타일("MAWUEXY0104");
	 * board.set태그가(111000); board.setBno(11); dao.create(board); }
	 */

//@Test
//	public void testListCriteria()throws Exception{
//	Criteria cri = new Criteria();
//	cri.setPage(2);
//	cri.setPerPageNum(3);
//	
//	List<BoardVO> list = dao.listCriteria(cri);
//	
//	for(BoardVO boardVO : list) {
//		logger.info(boardVO.getBno() + " : " + boardVO.get스타일());
//	}
//}

@Test
public void testDynamic() throws Exception{
	SearchCriteria cri = new SearchCriteria();
	cri.setPage(1);
	cri.setKeyword("ME");
	cri.setSearchType("t");
	
	logger.info("=============@@@@@@@@@@@@@@@@@==============");
	
	List<BoardVO> list = dao.listSearch(cri);
	
	for(BoardVO boardVO : list) {
		logger.info(boardVO.getBno() + " : " + boardVO.get스타일());
	}
	logger.info("================@@@@@@@@@@@@@@@============");
	logger.info("count : " + dao.listSearchCount(cri));
	
	
}

}
