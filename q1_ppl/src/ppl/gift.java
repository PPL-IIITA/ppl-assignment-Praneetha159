
package ppl;

public class gift {
    int value;
    int price;
    int type;
    
    gift(){
        Random r=new Random(); 
        value=r.getRandomNumberInRange(500,1000);
        price=r.getRandomNumberInRange(100,1000);
        type=r.getRandomNumberInRange(1,3);
    }
}
