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

  @Test
  public void testRead() throws Exception {

    logger.info(dao.read("MAWUEXY0102").toString());
  }
  
  @Test
  public void testDelete() throws Exception {

    dao.delete("MAWUEXY0104");
  }

}
