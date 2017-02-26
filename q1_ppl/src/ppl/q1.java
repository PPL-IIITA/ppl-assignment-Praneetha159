
package ppl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class q1 {
    static void function(girl[] g,boy[] b) throws IOException{
        PrintStream out = new PrintStream(new FileOutputStream("out.txt"));
               System.setOut(out);
         System.out.println("Couples");
         System.out.println("B-id"+" "+"G-id");
        for(int i=0;i<15;i++) {
            
            if(g[i].criteria == 1){
                for(int j = 0;j<20;j++) {
                    if (b[j].att > 5 && b[j].cmt == 0 && b[j].budget > g[i].mtnce_budget) {
                        System.out.print(b[j].name);
                        System.out.println(" "+g[i].name);
                        b[j].gf = g[i].name;
                        b[j].cmt = 1;
                        g[i].cmt = 1;
                        break;
                    }
                }
                if(g[i].cmt==0){
                    for(int j=0;j<20;j++) {
                    if(b[j].cmt == 0){
                        System.out.print(b[j].name);
                        
                        System.out.println(" "+g[i].name);
                        b[j].cmt = 1;
                         b[j].gf = g[i].name;
                         g[i].cmt = 1;
                         break;
                    }
                }
                }
            }  else if(g[i].criteria == 2){
                for(int j = 0;j<20;j++) {
                    if (b[j].intl > 250 && b[j].cmt == 0 && b[j].budget > g[i].mtnce_budget) {
                    System.out.print(b[j].name);
                        System.out.println(" "+g[i].name);
                        b[j].cmt = 1;
                         b[j].gf = g[i].name;
                         g[i].cmt = 1;
                        break;
                    }
                }
                if(g[i].cmt==0){
                    for(int j=0;j<20;j++) {
                    if(b[j].cmt == 0){
                        System.out.print(b[j].name);
                        
                        System.out.println(" "+g[i].name);
                        b[j].cmt = 1;
                         b[j].gf = g[i].name;
                         g[i].cmt = 1;
                         break;
                    }
                }
                }
            } else  {
                for(int j = 0;j<20;j++) {
                    if (b[j].budget > 35000 && b[j].cmt == 0 && b[j].budget > g[i].mtnce_budget) {
                       System.out.print(b[j].name);
                        
                        System.out.println(" "+g[i].name);
                        b[j].cmt = 1;
                         b[j].gf = g[i].name;
                         g[i].cmt = 1;
                         break;
                    }
                }
            }
            if(g[i].cmt==0){
                    for(int j=0;j<20;j++) {
                    if(b[j].cmt == 0){
                        System.out.print(b[j].name);
                        
                        System.out.println(" "+g[i].name);
                        b[j].cmt = 1;
                         b[j].gf = g[i].name;
                         g[i].cmt = 1;
                         break;
                    }
                }
                }
        }
        
    }
}