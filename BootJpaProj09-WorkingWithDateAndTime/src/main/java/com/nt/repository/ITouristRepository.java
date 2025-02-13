package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Tourist;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> {
	@Query(nativeQuery=true,value="SELECT YEAR(CURRENT_TIMESTAMP)-YEAR(DOB) FROM TOURIST WHERE TID=:id")
	public float fetchTouristAgeByTid(int id);

}
