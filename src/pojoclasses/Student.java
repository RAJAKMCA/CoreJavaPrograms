package pojoclasses;

public class Student implements Comparable<Student> {

Integer id;
String name;
String address;

public Student(){}

public Student(Integer id,String name,String address){
	this.id=id;
	this.name=name;
	this.address=address;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

public int compareTo(Student arg0) {
	// TODO Auto-generated method stub
	if(arg0.id>id){
		return -1;
	}else if(arg0.id==id) {
		return 0;
	}else{
		return 1;
	}
	
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address
			+ "]";
}



}
