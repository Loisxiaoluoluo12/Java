package pac1;

class Teacher extends People{
	String rank;

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	Teacher(){
		
	}
	Teacher(int id,String name,String sex,int tele,String rank,String major){
		super(id,name,sex,tele,major);
		this.rank=rank;  
	}


public String toString() {
	// TODO Auto-generated method stub
	return "id="+getId()+",name="+getName()+",sex="+getSex()+",tele="+getTele()+",rank="+getRank();
}
}