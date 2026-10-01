import java.io.*; interfaceMystack
{
public void pop(); public void push(); publicvoiddisplay();
}
classStack_arrayimplementsMystack
{
finalstaticintn=5;
intstack[]=newint[n]; int top=-1;
publicvoidpush()
{
try
{
BufferedReaderbr=newBufferedReader(newInputStreamReader(System.in)); if(top==(n-1))
{
System.out.println("StackOverflow"); return;
}
else
{
System.out.println("Entertheelement"); int ele=Integer.parseInt(br.readLine()); stack[++top]=ele;
}
}
catch(IOExceptione)
{
System.out.println("e");
}
}
publicvoidpop()
{
if(top<0)
{
System.out.println("Stack underflow"); return;
}
else
{
intpopper=stack[top]; top--;
System.out.println("Poppedelement:"+popper);
}
}

publicvoiddisplay()
{
if(top<0)
{
System.out.println("Stackisempty"); return;
}
else
{
Stringstr="";
for(int i=0; i<=top; i++) str=str+""+stack[i]+"<--";
System.out.println("Elementsare:"+str);
}
}
}

classStackADT
{
publicstaticvoidmain(Stringarg[])throwsIOException
{
BufferedReaderbr=newBufferedReader(newInputStreamReader(System.in)); System.out.println("Implementation of Stack using Array");
Stack_arraystk=newStack_array(); int ch=0;
do
{
System.out.println("1.Push2.Pop3.Display4.Exit); System.out.println("Enter your choice:"); ch=Integer.parseInt(br.readLine());
switch(ch)
{
case1:
stk.push(); break;
case2:
stk.pop(); break;
case3:
stk.display(); break;
case4:
System.exit(0);
}
}
while(ch<5);
}
}

Output
ImplementationofStackusingArray
1.Push2.Pop3.Display4.Exit Enter your choice:
1
Entertheelement 10
1.Push2.Pop3.Display4.Exit Enter your choice:
1
Entertheelement 15
1.Push2.Pop3.Display4.Exit Enter your choice:
1
Entertheelement 25
1.Push2.Pop3.Display4.Exit5.UseLinkedList Enter your choice:
3
Elements are:10<--15<--25<--
1.Push2.Pop3.Display4.Exit2
Poppedelement: 25



