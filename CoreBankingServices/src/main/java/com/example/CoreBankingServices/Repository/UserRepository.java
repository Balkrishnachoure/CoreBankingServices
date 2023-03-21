package com.example.CoreBankingServices.Repository;

import java.awt.print.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.CoreBankingServices.Model.UserEntity;

@Repository
public interface UserRepository<T>  extends JpaRepository<UserEntity, Long>{
	
	@Query(value="SELECT * FROM corebankingservices.banking_core_user  WHERE identification_number =:identification ",nativeQuery = true)
	 public T findByIndentificationNumber(String identification);

	

}
