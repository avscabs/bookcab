package avs.pojo;

import javax.persistence.Entity;

@Entity
public class User extends MainPOJO {
	private String userId;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString(){
		return String.format(
                "Customer[id=%d, userId='%s', password='%s']",
                getId(), userId, password);
	}

}
