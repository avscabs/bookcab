package avs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import avs.pojo.User;
import avs.repository.UserRepository;

public class UserController {
	
	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
    @ResponseBody
    public String saveProduct(/*@RequestBody User user*/) {
		User user = new User();
		user.setUserId("ani");
		user.setPassword("ani123");
		
		
		userRepository.save(user);
        return user.getUserId().toString();
    }
}
