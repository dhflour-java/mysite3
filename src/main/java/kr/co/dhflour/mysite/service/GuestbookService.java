package kr.co.dhflour.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dhflour.mysite.repository.GuestbookDao;
import kr.co.dhflour.mysite.vo.GuestbookVo;

@Service
public class GuestbookService {
	@Autowired
	private GuestbookDao guestbookDao;
	
	public List<GuestbookVo> getMessageList() {
		return guestbookDao.fetchList();
	}
	
	public void insertMessage(GuestbookVo vo) {
		guestbookDao.insert(vo);
	}
	
	public void deleteMessage(GuestbookVo vo) {
		guestbookDao.delete(vo);
	}	
}
