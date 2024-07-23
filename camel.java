import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String str=s.nextLine();
        
        int count=0;
        for(char i:str.toCharArray())
        {
            count++;
        }
        char[] ch=str.toCharArray();
        char[] res=new char[count];
        int ans=0;
        int isFirst=1;
         for (int i=0;i<count;i++) {
            char c=ch[i];
            if (c==' '){
                if(i+1<count){
                    c = ch[++i];
                    if (c>='a'&&c<='z') {
                        c-=32;
                    }
                }
            } else{
                if(isFirst==1) {
                    if (c>='a' && c<='z') {
                        c-=32; 
                    }
                    isFirst = 0;
                } else {
                    if (c>='A'&&c<='Z') {
                        c+=32; 
                    }
                }
            }
            res[ans++] = c;
        }
            for(int i=0;i<ans;i++){
                System.out.print(res[i]);
            }

    
}}
