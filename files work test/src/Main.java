import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        File f = new File("D:/Task text.txt");
        Scanner sc=new Scanner(System.in);
        sc=new Scanner(f);
        String s[]=new String[1000000] ;
        int i=0; int k=0; int d=0;
        String s1; String s2="";
        for(i=0; sc.hasNext(); i++ ){
            s[i]=sc.nextLine();
            if (!s[i].equals("")){
                k++;
            }
            s2=s[i]+s2;
        }
        for (int j=1; j<s2.length(); j++){
            char c=s2.charAt(j);
            if (c==' ') {
                d++;
            }
        }
        if (d>0) {d--;
        }
        String [] words = s2.split(" ");
        d=d-(words.length);
        /*s1 = s2.replace("  "," ");
        s1 = s2.replace("   "," ");
        s1 = s2.replace("    "," ");*/
        int l=s2.length()-d;

        System.out.println("Symbols:"+l);
        System.out.println("Words:"+words.length);
        System.out.println("Lines:" + k);
        sc.close();
    }
}
