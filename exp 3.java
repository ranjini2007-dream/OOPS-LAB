import java.io.*; importjava.lang.*; import java.util.*; class Employee
{
Stringemp_name; int emp_id;
String address; String mail_id; Stringmob_number;
Employee(Stringemp_name,intemp_id,Stringaddress,Stringmail_id, String mob_number)
{
this. emp_name = emp_name; this.emp_id = emp_id; this.address = address; this.mob_number=mob_number;
}
voiddisplay()
{
System.out.println("EmployeeName:"+emp_name); System.out.println("Employee_ID: "+ emp_id); System.out.println("Address: "+ address);
System.out.println("MobileNumber:"+mob_number);
}

}
classProgrammer extendsEmployee
{
doublebasicpay,da,hra,pf,fund,netsalary,grosssalary;

Programmer(Stringemp_name,intemp_id,Stringaddress,Stringmail_id, String mob_number,double bp)
{
super(emp_name,emp_id,address,mail_id,mob_number); basicpay = bp;
}
publicvoidgetPaySlip()
{
da=basicpay * 97/100; hra=basicpay* 10/100; pf=basicpay* 12/100; fund=basicpay*0.1/100;
netsalary=grosssalary-pf-fund;
}
voiddisp()
{
System.out.println("NameofTheEmployee:"+emp_name+"*****payslip****"); display();
System.out.println("Grosssalary="+grosssalary); System.out.println(" Netsalary ="+ netsalary);
}
}
classAssistantProfessorextendsEmployee
{
doublebasicpay,da,hra,pf,fund,netsalary,grosssalary;
AssistantProfessor(Stringemp_name,intemp_id,Stringaddress,Stringmail_id, String mob_number,double bp)
{
super(emp_name,emp_id,address,mail_id,mob_number); basicpay = bp;
}
publicvoidgetPaySlip()
{
da=basicpay * 97/100; hra=basicpay* 10/100; pf=basicpay* 12/100; fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra+pf+fund; netsalary = grosssalary-pf-fund;
}
voiddisp()
{
System.out.println("NameofTheEmployee:"+emp_name+"*****payslip****"); display();
System.out.println("Grosssalary="+grosssalary); System.out.println(" Netsalary ="+ netsalary);
}
}
classAssociateProfessorextendsEmployee
{
doublebasicpay,da,hra,pf,fund,netsalary,grosssalary;
AssociateProfessor(Stringemp_name,intemp_id,Stringaddress,Stringmail_id, String mob_number,double bp)
{
super(emp_name,emp_id,address,mail_id,mob_number); basicpay = bp;
}
publicvoidgetPaySlip()
{
da=basicpay * 97/100; hra=basicpay* 10/100; pf=basicpay* 12/100; fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra+pf+fund; netsalary = grosssalary-pf-fund;
}
voiddisp()
{
System.out.println("NameofTheEmployee:"+emp_name+"*****payslip****"); display();
System.out.println("Grosssalary="+grosssalary); System.out.println(" Netsalary ="+ netsalary);
}
}
classProfessor extendsEmployee
{
doublebasicpay,da,hra,pf,fund,netsalary,grosssalary;
Professor(Stringemp_name,intemp_id,Stringaddress,Stringmail_id, String mob_number,double bp)
{
super(emp_name,emp_id,address,mail_id,mob_number); basicpay = bp;
}
publicvoidgetPaySlip()
{
da=basicpay * 97/100; hra=basicpay* 10/100; pf=basicpay* 12/100; fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra+pf+fund; netsalary = grosssalary-pf-fund;
}
voiddisp()
{
System.out.println("NameofTheEmployee:"+emp_name+"*****payslip****"); display();
System.out.println("Grosssalary="+grosssalary); System.out.println("Netsalary ="+ netsalary);
}
}
publicclassEmployeePayslip
{
publicstaticvoidmain(Stringarg[])throwsIOException
{
Stringname,add,mail,mob; int id,desg;
doublebp;
DataInputStreamin=newDataInputStream(System.in); System.out.println("Enter Name of Employee :"); name=in.readLine();
System.out.println("EnterIDofEmployee:"); id= Integer.valueOf(in.readLine());
System.out.println("EnterAddressofEmployee:"); add=in.readLine();
System.out.println("EnterMailIDofEmployee:"); mail=in.readLine();
System.out.println("EnterMobileNumberofEmployee:"); mob=in.readLine();
System.out.println("Enter the Basicpay :"); bp=Double.valueOf(in.readLine()); System.out.println("EntertheDesignation:");
System.out.println("1.Programmer\n2.AssistantProfessor\n3.
AssociateProfessor\n4.Professor \n5. Exit"); desg= Integer.valueOf(in.readLine());
switch(desg)
{
case1:Programmerp=newProgrammer(name,id,add,mail,mob,bp);
p.getPaySlip(); p.disp();
break;
case2:AssistantProfessorap=newAssistantProfessor(name,id,add,mail,mob,bp); ap. getPaySlip ();
ap.disp(); break;
case3:AssociateProfessorassp=newAssociateProfessor(name,id,add,mail,mob,bp); assp. getPaySlip ();
assp.disp();
break;
case4:Professorpf=newProfessor(name,id,add,mail,mob,bp); pf. getPaySlip ();
pf.disp();
break;
case5: System.exit(0);
default:System.out.println("Invaliddesignation");
}
}
}
OUTPUT:

D:\JavaPrograms>javaEmployeePayslip Enter Name of Employee :
Raj
EnterIDofEmployee:
327
EnterAddressofEmployee:
Villupuram
EnterMailIDofEmployee:
raj@gmail.com
EnterMobileNumberofEmployee:
9994191599
EntertheBasicpay:
15000
EntertheDesignation:
1.	Programmer
2.	AssistantProfessor
3.	AssociateProfessor
4.	Professor
5.	Exit

2
NameofTheEmployee:Raghu*****payslip**** Employee Name: Raghu
Employee_ID: 327 Address:Villupuram
MobileNumber: 9994191599
Grosssalary=32865.0
Netsalary=31050.0








grosssalary=basicpay+da+hra+pf+fund;
