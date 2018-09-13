package com.aaron.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaron.dao.AaronDao;
import com.aaron.model.ThreeD;
import com.aaron.service.AaronService;

@Service
public class AaronServiceImpl implements AaronService{
	
	@Autowired
	private AaronDao aaronDao;
	@Override
	public void batchInsertData(List<ThreeD> threeDList) {
		aaronDao.saveAll(threeDList);
	}

}
