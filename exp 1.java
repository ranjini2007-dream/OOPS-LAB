import java.util.Scanner; public class ElectBill
{	
publicstaticvoidmain(String[]args)
{
Consumerob=newConsumer();
ob.Getdata();
ob.Calc();
ob.Display();
}
}
classConsumer
{
Scanner in = new Scanner (System.in); Scannerins=newScanner(System.in); int cno;
Stringcname,type_of_conn;
doublepre_reading,curr_reading,unit_consumed,tbill;
voidGetdata()
{
 









}
voidCalc()
{
 
System.out.print("\n\tEnterConsumernumber="); cno = in.nextInt();
System.out.print("\n\tEnterConsumername="); cname = ins.nextLine();
System.out.print("\n\tEnterthetypeofconnection="); type_of_conn = ins.nextLine();
System.out.print("\n\tEnterpre_monthreading="); pre_reading = in.nextDouble();
System.out.print("\n\tEntercurrent_monthreading="); curr_reading = in.nextDouble();


unit_consumed=curr_reading-pre_reading; if(type_of_conn.contains("domestic"))
{
 
if (unit_consumed<= 100) tbill=1*unit_consumed;
elseif(unit_consumed>100&&unit_consumed<=200) tbill=2.50* unit_consumed;
elseif(unit_consumed>200&&unit_consumed<=500) tbill=4* unit_consumed;
 
else

}
 
tbill=6*unit_consumed;
 
elseif(type_of_conn.contains("commercial"))
{
if (unit_consumed<= 100) tbill=2*unit_consumed;
elseif(unit_consumed>100&&unit_consumed<=200) tbill=4.50* unit_consumed;
elseif(unit_consumed>200&&unit_consumed<=500) tbill=6* unit_consumed;
else
tbill=7*unit_consumed;

}
}
voidDisplay()
{
System.out.println ("\n\t Customer name = "+cname); System.out.println("\n\tTotalunits="+unit_consumed); System.out.println ("\n\t Total bill = Rs "+tbill);
}
}


OUTPUT:
D:\JavaPrograms>javacElectBill.java D:\Java Programs>java ElectBill
Enter Consumer number = 102 EnterConsumername=Raghav
Enterthetypeofconnection=domestic Enter pre_month reading = 150
Entercurrent_monthreading=800 Customer name = Raghav
Total units = 650.0 Totalbill=Rs3900.0
D:\raghu\JavaPrograms>javacElectBill.java D:\raghu\Java Programs>java ElectBill
EnterConsumernumber=103 Enter Consumer name = Raj
Enterthetypeofconnection=commercial Enter pre_month reading = 1005
Entercurrent_monthreading=1300 Customer name = Raj
Totalunits=295.0
Totalbill=Rs 1770.0





