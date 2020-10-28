package pac1;

public class People {
   int id;
   String name;
   String sex;
   int tele;
   Course coursename;
   String major;
	public String getMajor() {
	return major;
    }
    public void setMajor(String major) {
	this.major = major;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTele() {
		return tele;
	}
	public void setTele(int tele) {
		this.tele = tele;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	People(){
		
	}
	People(int id,String name,String sex,int tele,String major){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.tele=tele;
		this.major=major;
	}
 }
