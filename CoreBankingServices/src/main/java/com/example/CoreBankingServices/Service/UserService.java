package com.example.CoreBankingServices.Service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.CoreBankingServices.ModelResponse.CommonResponse;
import com.example.CoreBankingServices.Repository.UserRepository;
import com.example.CoreBankingServices.Utils.Constants;
import com.example.CoreBankingServices.Utils.Messages;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService<T> {

	@Autowired
	UserRepository userRepository;

	@SuppressWarnings("unchecked")
	public T readuser(String identification) {
		if (!identification.isEmpty()) {
			return (T) userRepository.findByIndentificationNumber(identification);
		} else {
			return (T) new CommonResponse(Messages.SWW, Constants.ERROR);
		}

	}
	
	 @SuppressWarnings("unchecked")
	public T readUsers( Pageable pageable)
	 {
		 
		 return (T) userRepository.findAll((Example) pageable) ;
	 }
	
	

}
