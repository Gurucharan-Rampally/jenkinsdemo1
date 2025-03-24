class cmdline{
public static void main(string [] args){
int m = Interger.parseInt(args[0]);
int n = Interger.parseInt(args[1]);
int a,b,c,d;
a = m + n;
b = m - n;
c = m * n;
d = m / n;
System.out.println("Addition" + a);
System.out.println("subtraction" + b);
System.out.println("Multiplication" + c);
System.out.println("Division" + d);
}
}
