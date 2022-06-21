package referesh.test.demo.bo;

import org.springframework.data.annotation.Id;

public class Person {

  @Id private String id;
  private String name;
  private String dob;
  

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}

  
}
