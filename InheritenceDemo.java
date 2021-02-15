package lab4;


class Account{
	String name,address,type;
	int accNum,bal,age;

	Account(String n,int no,int b,int a) {
		name=n; 
		accNum=no; 
		bal=b; 
		age=a;
	}
	 Account(String n,int no,String addr,String t,int b,int a) {
		name=n; 
		accNum=no;
		address=addr;
		type=t; 
		bal=b;
		age=a;
}
void deposite(int a) {
	bal+=a;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getAccNum() {
	return accNum;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public int getBal() {
	return bal;
}
public void setBal(int bal) {
	this.bal = bal;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
void withdraw(int a) { 
	bal-=a; 
	}
int getbalance() {
	return(bal);
	}
void show() {
	System.out.println("________________________");
	System.out.println(" ACCOUNT DETAILS");
	System.out.println("------------------------");
	System.out.println("Name : "+name);
	System.out.println("Account No : "+accNum);
	System.out.println("Address : "+address);
	System.out.println("Type : "+type);
	System.out.println("Balance : "+bal);
	System.out.println("Age:"+age);
	System.out.println("-------------------------");
}
}
class InheritenceDemo{
	public static void main(String arg[])throws Exception{
		Account a1=new Account("Rahul",21232,12322,20); 
		Account a2=new Account("Sneha",1000,"Rahul","Current Account",300000,32);
		a1.address="Manipur";
		a1.type="fixed deposite";
		a1.deposite(5000);
		a2.withdraw(350);
		a2.deposite(a2.getbalance());
		a1.show();
		a2.show();
}
}