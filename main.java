import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        File f = new File("D:/Task text.txt");
        Scanner sc=new Scanner(System.in);
        sc=new Scanner(f);
        String s[]=new String[10000] ;
        int i=0; int k=0;
        String s1; String s2="";
        for(i=0; sc.hasNext(); i++ ){
            s[i]=sc.nextLine();
            if (!s[i].equals("")){
                k++;
            }
            s2=s[i]+s2;
        }
        s1 = s2.replace("  ","");
        s1 = s2.replace("   "," ");
        s1 = s2.replace("    "," ");
        int l=s1.length();
        String [] words = s1.split(" ");
        System.out.println("Symbols:"+l);
        System.out.println("Words:"+words.length);
        System.out.println("Lines:" + k);
    }
}
