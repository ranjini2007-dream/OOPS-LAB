packagecurrency; importjava.util.*;
import java.text.DecimalFormat; Class CurrencyConvertor
{
doublerupee,dollar,euro,yen;
Scanner sc = new Scanner(System.in); DecimalFormatf=newDecimalFormat("##.###"); public convertInrToEuro()
{
System.out.println("Enteramountinrupees"); rupee = sc.nextFloat();
euro=rupee/80;
System.out.println("Euro:"+f.format(euro));
}
publicconvertEuroToInr()
{
System.out.println("EnteramountinEuro"); euro = sc.nextFloat();
rupee=euro*80;
System.out.println("Rupees:"+f.format(rupee));
}
publicconvertInrToDollar()
{
System.out.println("Enteramountinrupees"); rupee = sc.nextFloat();
dollar =rupee /66;
System.out.println("Dollar:"+f.format(dollar));
}
publicconvertDollarToInr()
{
System.out.println("EnteramountinDollar"); dollar = sc.nextFloat();
rupee=dollar * 66;
System.out.println("Rupees:"+f.format(rupee))
}
publicconvertInrToYen()
{
System.out.println("Enteramountinrupees"); rupee = sc.nextFloat();
yen = rupee / 0.61;System.out.println("Yen:"+f.format(yen));
}
publicconvertYenToInr()
{
System.out.println("EnteramountinYen"); euro = sc.nextFloat();
rupee =yen*0.61;
System.out.println("Rupees:"+f.format(rupee));
}
}

packagedistance; importjava.util.*;
import java.text.DecimalFormat; Class DistanceConvertor
{
doublemeter,km,miles;
Scanner sc = new Scanner(System.in); DecimalFormatf=newDecimalFormat("##.###"); public convertMeterToKm()
{
System.out.println("Enterthemeter"); meter = sc.nextFloat();
km =	meter * 0.001; System.out.println("Kilometer:"+f.format(km));
}
publicconvertKmToMeter()
{
System.out.println("EntertheKilometer"); km = sc.nextFloat();
meter= km/0.001;
System.out.println("Meter:"+f.format(meter));
}
publicconvertMilesToKm()
{
System.out.println("Enterthemiles"); miles = sc.nextFloat();
km = miles * 1.6093; System.out.println("Kilometer:"+f.format(km));
}
publicconvertKmToMiles()
{
System.out.println("EntertheKilometer"); km = sc.nextFloat();
miles = km / 1.6093; System.out.println("Miles:"+f.format(miles));
}
}
package time; importjava.util.*;
import java.text.DecimalFormat; Class TimeConvertor
{
doublehour,minute,second;
Scanner sc = new Scanner(System.in); DecimalFormatf=newDecimalFormat("##.###"); public convertHourToMinute()
{
System.out.println("EntertheHour"); hour = sc.nextFloat();
minute=hour*60;
System.out.println("Minutes:"+f.format(minute));
}
publicconvertMinuteToHour()
{
System.out.println("EntertheMinute"); minute = sc.nextFloat();
hour=minute/ 60;
System.out.println("Hours:"+f.format(hour));
}
publicconvertHourToSeconds()
{
System.out.println("EntertheHour"); hour = sc.nextFloat();
second = hour * 3600; System.out.println("Seconds:"+f.format(second));
}
publicconvertSecondsToHour()
{
System.out.println("EntertheSeconds"); second = sc.nextFloat();
hour = second / 3600; System.out.println("Hours:"+f.format(hour));
}
}
importcurrency.*; import distance.*; import time.*;\
import java.util.Scanner; public class Convertor
{
publicstaticvoidmain(String[]args)

{
intcode,currency_code,distance_code,time_code;
Scanner sc=newScanner(System.in);
System.out.println("Enterthecode1:Currency\n2:Distance\n3:Time"); code=sc.nextInt();
if(code==1)
{
System.out.println("EntertheCurrecycode1:Euro\n2:Dollar\n3:Yen"); currency_code=sc.nextInt();
if(currency_code==1)
{
convertInrToEuro();
convertEuroToInr()
}
elseif(currency_code==2)
{
convertInrToDollar(); convertDollarToInr();
}
elseif(currency_code==3)
{
 

}
else
{
}
}
 
convertInrToYen(); convertYenToInr();
System.out.println(“InvalidCode”);
 
elseif(code==2)
{
System.out.println("EntertheDistancecode1:Meter\n2:Miles"); distance_code=sc.nextInt();
if(distance_code==1)
{
convertMeterToKm();
convertKmToMeter();
}
elseif(distance_code== 2)
{
convertMilesToKm(); convertKmToMiles();
}
else
{
System.out.println(“InvalidCode”);
}
}
elseif(code==3)
{
System.out.println("EntertheTimecode1:Minutes\n2:Seconds"); time_code=sc.nextInt();
if(time_code==1)
{
convertHourToMinute();
convertMinuteToHour();
}
elseif(time_code==2)
{
 

}
else
{
 
convertHourToSeconds(); convertSecondsToHour();
 
System.out.println(“InvalidCode”);
}
}
else
{
System.out.println(“InvalidCode”);
}
}
}

OUTPUT:
Enterthecode1:Currency\n2:Distance\n3:Time1
EntertheCurrecycode1:Euro\n2:Dollar\n3:Yen2
Enteramountinrupees 6600
Dollar :100
EnteramountinDollar 6
Rupees:396






