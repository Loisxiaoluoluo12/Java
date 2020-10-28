package pac1;

public class Course {
   int courseid;
   String coursename;
   String address;
   double time;
   String courseteacher;
   float source;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public String getCourseteacher() {
		return courseteacher;
	}
	public void setCourseteacher(String courseteacher) {
		this.courseteacher = courseteacher;
	}
	public float getSource() {
		return source;
	}
	public void setSource(float source) {
		this.source = source;
	}
	Course(){
		
	}
	Course(int courseid,String coursename,String address,double time,String courseteacher,float source){
		this.courseid=courseid;
		this.coursename=coursename;
		this.address=address;
		this.time=time;
		this.courseteacher=courseteacher;
		this.source=source;
		}
	public String toString() {
			// TODO Auto-generated method stub
			return "courseid="+getCourseid()+"coursename="+getCoursename()+"address="+getAddress()+"time="+getTime()+"courseteacher="+getCourseteacher()+"source="+getSource();
		}
	public static void main(String[] args) {
		
	}
}
