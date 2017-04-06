package avs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import avs.pojo.MainPOJO;
import avs.pojo.User;


public interface UserRepository extends CrudRepository<User,Long> {
	 List<MainPOJO> findByUserId(String userId);
}
