package newyear;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main_class {
	
	public static void updateObj(String str,Dairy_milk e,wish a,laddu l,sundae gu,kalakan k,gifts g) {
		if(str.equals("wish")) {
			a.update();
			g.updatewt(a.wt);
	}
		else if(str.equals("Dairy_milk")){
			e.update();
			g.updatewt(e.wt);
		}
		else if(str.equals("sundae")) {
			gu.update();
			g.updatewt(gu.wt);
		}
		else if(str.equals("kalakan")) {
			k.update();
			g.updatewt(k.wt);
		}
		else if(str.equals("laddu")) {
			l.update();
			g.updatewt(l.wt);
		}
	}
	public static void printGiftItems(String gifts) {
		if(gift.equals("chocolate")) {
			System.out.println("Dairy_milk,wish");
		}
		else{
			System.out.println("sundae,kalakan,laddu");
		}
	}
	public static void main(String[] args)throws IOException {
BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
gifts g =new gifts();
Dairy_milk e = new Dairy_milk();
wish a = new wish();
laddu l = new laddu();
sundae gu=new sundae();
kalakan k = new kalakan();
System.out.print("Enter the name of the gifts:");
String gift1=inp.readLine();
System.out.print("Enter the number of "+gift1+":");
int n = Integer.parseInt(inp.readLine());
System.out.print("\nselect one of the "+gift1+":");
printGiftItems(gift1);
for(int i=0;i<n;i++) {
	System.out.println();
	
	System.out.print(gift1+" name:");
	String str = inp.readLine();
	updateObj(str,e,a,l,gu,k,g);
	
}
System.out.print("Enter the name of the gift:");
String gift2=inp.readLine();
System.out.print("Enter the number of "+gift2+":");
int m = Integer.parseInt(inp.readLine());
System.out.print("\nselect one of the "+gift2+":");
printGiftItems(gift2);
for(int i=0;i<m;i++) {
System.out.println();
	
	System.out.print(gift2+" name:");
	String str = inp.readLine();
	updateObj(str,e,a,l,gu,k,g);
}

System.out.print("Total weight of the gifts:");
System.out.println(g.weight);
System.out.println("Total gifts are");
System.out.print("Dairy_milk:");
System.out.println(e.count);
System.out.print("wish:");
System.out.println(a.count);
System.out.print("Laddu:");
System.out.println(l.count);
System.out.print("Kalakan:");
System.out.println(k.count);
System.out.print("sundae:");
System.out.println(gu.count);
System.out.print("Enter the range of the price for chocolate:");
int rc = Integer.parseInt(inp.readLine());
System.out.println("Find chocolates of price less than "+rc);
if(e.count>0 && e.cp<rc) {
	System.out.print("Dairy_milk\t");
}
	if(a.count>0 && a.cp<rc) {
		System.out.print("wish");
	}
	System.out.println();
System.out.println("Enter the range of the price for sweets");
int rs = Integer.parseInt(inp.readLine());
System.out.println("\nFind sweets of price less than "+rs);
if(k.count>0 && k.cp<rs) {
	System.out.print("Kalakan\t");
}
if(l.count>0 && l.cp<rs) {
	System.out.print("Laddu\t");
}
if(gu.count>0 && gu.cp<rs) {
	System.out.print("sundae");
}
	}
	
}
