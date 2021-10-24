import java.io.*;
import java.util.*;


package strings;

public class Reverse {
	 boolean isPalin = true;
     for (int i=0;i<A.length()/2 ; i++) {
         if (A.charAt(i) != A.charAt(A.length() -i -1)) {
             isPalin = false;
         }
     }

     if (isPalin) {
         System.out.println("Yes");
     } else {
         System.out.println("No");
     }

 }
}

