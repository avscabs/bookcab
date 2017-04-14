package avs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="application_id")
	private Long applicatonId;
	
	public Long getApplicatonId() {
		return applicatonId;
	}
	
	public void setApplicatonId(Long applicatonId) {
		this.applicatonId = applicatonId;
	}
	
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

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return String.format(
                "Customer[id=%d, userId='%s', password='%s']",
                getId(), userId, password);
	}

}
