
package ppl;

public class girl {
    int name;
    int intl;
    int att;
    int mtnce_budget;
    int happiness;
    int compatability;
    int criteria;
    int type;
    int cmt;
    
    girl(int i){
        Random r=new Random(); 
        criteria=r.getRandomNumberInRange(1,3);
        att=r.getRandomNumberInRange(1,10);
        intl=r.getRandomNumberInRange(1, 10);
        mtnce_budget=r.getRandomNumberInRange(1000,9000);
        name=i;
        type= r.getRandomNumberInRange(1,3);   
        cmt=0;
    }
}
