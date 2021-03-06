package cn.gree.zz.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 岗位
 * 
 * @author tyg
 * 
 */
public class Role implements java.io.Serializable {
	private Long id;
	private String name;
	private String description;
	private Set<User> users = new HashSet<User>();
	private Set<Privilege> privileges = new HashSet<Privilege>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}
	
	//=============重写equals and hashCode方法================
	 @Override
	 public boolean equals(Object obj) {
         if(!(obj instanceof Role)){
             return false;
         }
         if(obj == this){
             return true;
         }
         return this.name.equals(((Role)obj).name);
     }
	 @Override
	 public int hashCode() {
         return name.length();
     }
	 
}
