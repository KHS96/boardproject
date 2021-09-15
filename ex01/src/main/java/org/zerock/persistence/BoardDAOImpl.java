package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

  @Inject
  private SqlSession session;

  private static String namespace = "org.zerock.mapper.BoardMapper";

  @Override
  public void create(BoardVO vo) throws Exception {
    session.insert(namespace + ".create", vo);
  }

  @Override
  public BoardVO read(String 스타일) throws Exception {
    return session.selectOne(namespace + ".read", 스타일);
  }

@Override
public void update(BoardVO vo) throws Exception {
	session.update(namespace+".update",vo);
	
}

@Override
public void delete(String 스타일) throws Exception {
	// TODO Auto-generated method stub
	session.delete(namespace + ".delete", 스타일);
}

@Override
public List<BoardVO> listAll() throws Exception {
	return session.selectList(namespace + ".listAll");
}


}
