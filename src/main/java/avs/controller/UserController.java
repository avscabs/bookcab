package avs.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import avs.pojo.User;
import avs.repository.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userRepository;

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public String saveProduct(/*@RequestBody User user*/) {
		User user = new User();
		user.setUserId("ani");
		user.setPassword("ani123");
		user.setApplicatonId(123l);
		userRepository.save(user);
	
        return user.getUserId().toString();
    }
}
