 package WebApp.Com.Controller;




import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WebApp.Com.Entity.UserEntity;
import WebApp.Com.Service.UserService;
@RestController
@RequestMapping("/api/jdbc")
public class UserController {
	
	
	@Autowired
	private UserService userService; 
	
	
	 
	 @PostMapping("/create")
	 public UserEntity create( @RequestBody  UserEntity request) {
				
//		       userService.save(request);
			return request;
	}
	@GetMapping("/addUs/{id}")
	public UserEntity getUserEntityById(@PathVariable UUID id) {
		
		return userService.getUserEntityById(id);
	}

//	@GetMapping("/UserEntitys")
//    public UserEntity getAllUserEntitys(){
//	
//	return userService.getUserEntitys();
//	
//}
//	@PutMapping("/updateUserEntity")
//    public UserEntity updateUserEntity(@RequestBody UserEntity userentity) {
//		return userService.updateUserEntity(userentity);
//    	
//    }
//	@DeleteMapping("/UserEntity/{id}")
//	public String deleteUserEntity(@PathVariable UUID id) {
//		return userService.deleteUserEntityById(id);
//		
	} 
	
	

