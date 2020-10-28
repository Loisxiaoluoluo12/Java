# Java
Java第二次作业提交10月26日
# 实验内容
1.project：Studentmanager  
2.Package:pac1   
3.Class:Course   People   Student    Teacher  Test    

(1)Course类
* Course类中先定义Course的属性   
* 建立Pc的两个构造方法，一个是无参的构造方法，另一个是有两个参数的构造方法   
* 得到属性相关的set和get方法用来传值   
* 重写Course的toString方法，用来输出Course的信息。     

(2)People类
* People中先定义People的属性  
* 建立Cpu的两个构造方法，一个为无参的构造方法，一个是有多个参数的构造方法。   
* 得到属性相关的set和get方法用来传值   
    

(3)Student类  
* Student类中先定义Student的属性
* 建立Student的两个构造方法，一个是无参的构造方法，另一个是有多个参数的构造方法。  
* 得到属性相关的set和get方法用来传值
* 创建toString（）方法，用来输出学生的相关信息。   

(4)Teacher类  
* Teacher类中先定义Teacher的属性
* 建立Teacher的两个构造方法，一个是无参的构造方法，另一个是有多个参数的构造方法。  
* 得到属性相关的set和get方法用来传值
* 创建toString（）方法，用来输出教师的相关信息。   

(5)Test类   
* Test类中分别实例化Course   Student    Teacher   Test，通过构造方法对这几个属性进行设置。   
* 创建了choosecourse（）和exitcourse（）分别进行选课和退课的操作。  
## 实验目的
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法     
2.掌握面向对象的类设计方法（属性、方法）  
3.掌握类的继承用法，通过构造方法实例化对象  
4.学会使用super()，用于实例化子类  
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  

## 实验过程
1.分析题目的相关需求，people具有Student和Teacher的共同属性，所以Student和Teacher通过super继承父类的属性。
2.根据上述需求分析，首先建立五个不同的类。  
3.根据不同的类需要的业务，完善类中的内容。   
4.调用类中的相关信息。  
5.运行程序，展示结果。  
## 核心方法
(1)构造方法
```
无参   
People(){
		
	}
有参   
People(int id,String name,String sex,int tele){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.tele=tele;
	}
```
(2)set和get方法
```
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
```
(3)重写的toString方法
```
  public String toString() {
			// TODO Auto-generated method stub
			return "courseid="+getCourseid()+"coursename="+getCoursename()+"address="+getAddress()+"time="+getTime()+"courseteacher="+getCourseteacher()+"source="+getSource();
		}
```
(4)运用super关键字调用父类的构造方法
```
Student(int id,String name,String sex,int tele,int grade,String ownclass){
		super(id,name,sex,tele);
		this.grade=grade;
		this.ownclass=ownclass;
	}
```
## 实验结果
(1)运行结果1
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/ruAMsa53pVQWN7FLK88i5j2kyiSsRZVekjkWTORWi49rhUKnotedxKNak4un1n5CDPYGzfVuHTaNeRQ6iNb4se0EIXBDea3FjdqmODkkBjU!/b&bo=JASHAAAAAAADB4U!&rf=viewer_4)   
(2)运行结果2
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/45NBuzDIW489QBoVep5mcaMtIlgBMdpc.XEpqJyxJe.c8N0gobLqjD9NaKbU1fi8ZSFfx5RRV6u7nteZT2OFVo6sqyQK1zs6Iu0ETtAex*I!/b&bo=lgOLAAAAAAADFyw!&rf=viewer_4) 
(3)运行结果3
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/45NBuzDIW489QBoVep5mcSXsy9Vk4kFbiGhJnCiSpq3q5LvNAlEDL2I554PhcsMASu2HyK0zaaDUVBAXmkvatzcNV6nUDKP*MLOgOOCydKs!/b&bo=dwOZAAAAAAADF98!&rf=viewer_4) 
## 实验感想 
在该实验中，我掌握如何写构造方法、掌握了权限的使用要求，并知道了如何继承父类的属性和方法，熟悉了通过super关键字调用父类的构造方法。希望在以后的学习中能够了解到更多的编程信息。  
