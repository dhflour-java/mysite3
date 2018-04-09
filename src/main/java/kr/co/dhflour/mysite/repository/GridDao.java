package kr.co.dhflour.mysite.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.dhflour.mysite.vo.GridVo;

@Repository
public class GridDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<GridVo> getList(){
		List<GridVo> list = sqlSession.selectList( "grid.getList" );
		return list;
	}
}
