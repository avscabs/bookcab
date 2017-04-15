package avs.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import avs.pojo.BasePOJO;

public abstract class BaseDAO extends  HibernateDaoSupport {
	
	
	
	@Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
	
	public abstract void save(BasePOJO obj);
	
	public abstract void update(BasePOJO obj);
	
	public abstract void delete(BasePOJO obj);

}
