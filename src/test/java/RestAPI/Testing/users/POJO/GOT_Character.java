package RestAPI.Testing.users.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GOT_Character {
	public String _id;
	public Boolean male;
	public String house;
	public String name;
	
	
	public GOT_Character() {
	
	}
	public GOT_Character(String id, Boolean male, String house, String name) {
		super();
		this._id = id;
		this.male = male;
		this.house = house;
		this.name = name;
	}
	public String getId() {
		return _id;
	}
	public void setId(String id) {
		this._id = id;
	}
	public Boolean getMale() {
		return male;
	}
	public void setMale(Boolean male) {
		this.male = male;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GOT_Character [id=" + _id + ", male=" + male + ", house=" + house + ", name=" + name + "]";
	}
	
	
}
