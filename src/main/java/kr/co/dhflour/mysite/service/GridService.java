package kr.co.dhflour.mysite.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dhflour.mysite.repository.GridDao;
import kr.co.dhflour.mysite.vo.GridVo;

@Service
public class GridService {

	@Autowired
	private GridDao gridDao;
	
	public List<Map<String, Object>> getGridList(){
		List<GridVo> list = gridDao.getList();
		
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		
		for( GridVo vo : list ) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put( "Name", vo.getName() );
			map.put( "Age", vo.getAge() );
			map.put( "Country", vo.getCountry() );
			map.put( "Address", vo.getAddress() );
		
			
			if( "0".equals(vo.getMarried()) == true ) {
				map.put( "Married", false );
			} else {
				map.put( "Married", true );
			}
			
			result.add( map );
		}
		
		return result;
	}
}
