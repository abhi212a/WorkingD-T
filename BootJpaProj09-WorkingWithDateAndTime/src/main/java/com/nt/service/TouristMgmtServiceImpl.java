package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Tourist;
import com.nt.repository.ITouristRepository;

@Service("touristService")
public class TouristMgmtServiceImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepository touristRepo;
	@Override
	public String registerTourist(Tourist tourist) {
		int idVal=touristRepo.save(tourist).getTid();
		return idVal+"Tourist is registered";
	}
	@Override
	public List<Tourist> getAllTourists() {
		
		return touristRepo.findAll();
	}
	@Override
	public float showTouristAgeTid(int id) {
		
		return touristRepo.fetchTouristAgeByTid(id);
	}
	

}
