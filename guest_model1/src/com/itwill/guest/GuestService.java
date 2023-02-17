package com.itwill.guest;

import java.util.List;

public class GuestService {
	private GuestDao guestDao;
	public GuestService() throws Exception {
		guestDao = new GuestDao();
	}
	/*
	 * 방명록 리스트
	 */
	public List<Guest> findAll() throws Exception {
		return guestDao.findAll();
	}
	
	public Guest findByNo(int no) throws Exception {
		return guestDao.findByNo(no);
	}
	
	public int insert(Guest guest) throws Exception {
		return guestDao.insert(guest);
	}
	
	public int delete(int guest_no) throws Exception {
		return guestDao.delete(guest_no);
	}
	
	public int update(Guest guest) throws Exception{
		return guestDao.update(guest);
	}
}