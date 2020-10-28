package pac1;

class Student extends People{
	int grade;
	int state;
	String ownclass;
	public String getOwnclass() {
		return ownclass;
	}
	public void setOwnclass(String ownclass) {
		this.ownclass = ownclass;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	Student(){
		
	}
	Student(int id,String name,String sex,int tele,int grade,String ownclass,String major){
		super(id,name,sex,tele,major);
		this.grade=grade;
		this.ownclass=ownclass;
	}
	/*public void choosecourse(String owncourse1,String owncourse2){
	this.owncourse=owncourse1;
	this.owncourse=owncourse2;
	if(owncourse1==owncourse2){
		System.out.println("可以选课");
		System.out.println("选课成功");
		state=1;
	}else{
	   System.out.println("选课失败");
	   System.exit(0);
	}
	}
	public void exitcourse(){
		state=0; 
		System.out.println("退课成功");
		System.out.println("id="+null+",name="+null+",sex="+null+",tele="+null+",geade="+null+",selecourse="+null+",ownclass="+null);
		System.exit(0);
	}*/
	public String toString() {
		return "id="+getId()+",name="+getName()+",sex="+getSex()+",tele="+getTele()+",geade="+getGrade()+",ownclass="+getOwnclass();
	}
	public static void main(String[] args) {
	//	Test test=new Test(int state);
	}
}
