package com.got.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.got.api.model.ListModel;


public interface BattleRepository extends CrudRepository<ListModel, String>  {
	
	public static final String FIND_PROJECTS ="SELECT location,region FROM battle_info";
			
	@Query(value = FIND_PROJECTS, nativeQuery = true)
	public List<Object[]> findEmp_name();
	
	 int counts();
	 ListModel findByBattle(String id);
	 Optional<ListModel> checkBattle(String id);
}
