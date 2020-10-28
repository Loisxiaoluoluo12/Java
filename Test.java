package pac1;

public class Test {
	int state=0;
	public void choosecourse(){
			System.out.println("可以选课");
			System.out.println("选课成功");
		}
	public void exitcourse(){
			System.out.println("退课成功");
			state=0;
			System.out.println("id="+null+",name="+null+",sex="+null+",tele="+null+",geade="+null+",selecourse="+null+",ownclass="+null);
			System.exit(0);
		}
public static void main(String[] args) {
	Course cou=new Course(1021,"java","教201",13.30,"王明",3);
	Student stu=new Student(2020,"happy","女",139008,100,"计G201",cou.getCoursename());
	Teacher tea=new Teacher(100, "王明", "男", 188009,"教授",cou.getCoursename());
	System.out.println(stu.name);
	Test test=new Test();
	if(test.state==0&&stu.major==tea.major){
		test.choosecourse();
		System.out.print("学生姓名="+stu.getName()+"老师姓名="+tea.getName());
		System.out.print(cou);
		test.state=1;
	}else{
		System.out.println("选课失败");
		System.exit(0);
	}System.exit(0);
	if(test.state==1){
		test.exitcourse();
	}
	}

}
