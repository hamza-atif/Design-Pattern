
package GOF.Strategy.Operations;

/**
 *
 * @author fa20-bse-018
 */
public class OperationAdd extends Computer {
    
    public OperationAdd(){}
    
    public OperationAdd(OperationSubstract nextStrategy){
        this.nextStrategy = nextStrategy;
    }
    
    @Override
    public int doOperation(int num1, int num2) {
       return num1 + num2;
    }


    @Override
    public int ComputeInRange(int num1, int num2) {
//        if(num1<= 100 &&  num1>=1 && num2<=100 && num2>=1){
        if(num1<= 200 &&  num1>=100 && num2<=100 && num2>=11){
            return num1 + num2;
        }
        if(nextStrategy==null){
            System.out.println("Support not available...");
        }
        else{
            nextStrategy.ComputeInRange(num1, num2);
        }
    
        return 0;
        
    }
}