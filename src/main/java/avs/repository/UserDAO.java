package avs.repository;

import java.util.List;

import avs.pojo.BasePOJO;
import avs.pojo.User;

public class UserDAO extends BaseDAO{

	@Override
	public void save(BasePOJO obj) {
		getHibernateTemplate().save(obj);
		
	}

	@Override
	public void update(BasePOJO obj) {
		getHibernateTemplate().update(obj);
		
	}

	@Override
	public void delete(BasePOJO obj) {
		getHibernateTemplate().delete(obj);
		
	}

	public User findByID(long id) {
		List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",id
           );
	return (User)list.get(0);
	}
	
}
