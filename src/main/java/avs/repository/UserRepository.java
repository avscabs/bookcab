package avs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import avs.pojo.User;


public interface UserRepository extends CrudRepository<User,Long> {
	 List<User> findByUserId(String userId);
}
