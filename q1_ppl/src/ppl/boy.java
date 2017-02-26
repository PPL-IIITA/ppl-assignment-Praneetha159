
package ppl;

public class boy {
    int name;
    int intl;
    int att;
    int budget;
    int happiness;
    int cmt;
    int type;
    int gf;
    boy(int i){
        Random r=new Random(); 
        
        att=r.getRandomNumberInRange(1,10);
        intl=r.getRandomNumberInRange(1, 10);
        budget=r.getRandomNumberInRange(1000,9000);
        name=i;
        cmt=0;
        type=r.getRandomNumberInRange(1, 3);
    }
}
