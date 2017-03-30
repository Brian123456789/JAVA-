package pkg02add;

public class Main {

  
    public static void main(String[] args) {
        //float num1 = 6.4;//In Java, all decimal values are double by default.
        //float num2 = 3.3;//You have to force it to use float to work.
        float num1 = 6.4f; 
        float num2 = 3.3f;//using f forces 3.3 to float value
        
        System.out.println (num1+num2);
        
        double num3 = 6.4;
        double num4 = 3.3;//also using double works but is wasteful if you
                          //are trying to save on resources.
                          
        System.out.println (num3+num4);                 
    }
    
}
