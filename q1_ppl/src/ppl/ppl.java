package ppl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class ppl {
    

    public static void main(String[] args) throws IOException {

    girl[] g = new girl[15];
    boy[] b = new boy[20];
    gift[] gt = new gift[50];
    int l=5677;
    for(int i=0;i<15;i++){
        g[i] = new girl(l);
        l++;
    }
    int j,k=7899;
    for( j=0;j<20;j++){
        b[j] = new boy(k);
        k++;
    } 
    q1.function(g,b);
    
    for(int i=0;i<50;i++){
        gt[i]= new gift();
    }
    
}
}
