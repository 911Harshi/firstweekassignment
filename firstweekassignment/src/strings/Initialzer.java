import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



package strings;

public class Initialzer {

	static int B,H;
	static boolean flag=false;
	static{
	    
	    Scanner s=new Scanner(System.in);
	    B=s.nextInt();
	    H=s.nextInt();
	    
	    if(B>0&&H>0)
	        flag=true;
	    else
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}

	}

