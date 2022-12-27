package WebApp.Com.Service;


import java.sql.SQLException;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApp.Com.Dao.UserDAO;

import WebApp.Com.Entity.UserEntity;

@Service
@Transactional
public class UserService {

@Autowired
private UserDAO dao;



 public void save(UserEntity request) throws ClassNotFoundException, SQLException {
	 dao.save(request);
	
}


//private userRepository UserRepository;
//
///*
// * public UserEntity createUserEntity(UserEntity userEntity) { return
// * UserRepository.save(userEntity);
// */
//
//public List<UserEntity> createUserEntitys(List<UserEntity> userEntitys) {
//		return  UserRepository.saveAll(userEntitys); 
//}
public UserEntity getUserEntityById(UUID id) {
	return UserRepository.findById(id).orElse(null);
}
}
//	public UserEntity getUserEntitys() {
//		return (UserEntity) UserRepository.findAll();
//	
//}
//	public UserEntity updateUserEntity(UserEntity userEntity) {
//		
//		UserEntity oldUserEntity=null;
//		
//		Optional<UserEntity>OptionalEntity=UserRepository.findById(userEntity.getId());
//		
//		if(OptionalEntity.isPresent()) {
//			
//			UserEntity UserEntity=OptionalEntity.get();
//			UserEntity.setId(userEntity.getId());
//			UserEntity.setName(userEntity.getName());
//			UserEntity.setShortName(userEntity.getShortName());
//			UserEntity.setChooseCurrency(userEntity.getChooseCurrency());
//			UserEntity.setCountryPhoneCode(userEntity.getCountryPhoneCode());
//			UserEntity.setRegion(userEntity.getRegion());
//			UserRepository.save(UserEntity);
//			
//		}else {
//			 
//			return new UserEntity();
//			
//		}
//		
//		return oldUserEntity;
//	}
//	public String deleteUserEntityById(UUID id) {
//		UserRepository.deleteById(id);
//		return "UserEntity got deleted" ;
//	}
	