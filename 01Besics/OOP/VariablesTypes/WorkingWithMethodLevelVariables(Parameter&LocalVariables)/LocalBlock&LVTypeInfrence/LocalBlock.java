/* Local Block is used for decresing the scope of local variable;*/

class LocalBlock{
    public static void main(String[] args){
        int a=10;
        System.out.println("Before local Block ");
        System.out.println("value of a is :"+a);
        {
            int b=15;       // scope of b variable is only inside LB;
            System.out.println("Inside Local Block");
            System.out.println("value of b is : "+b);
            System.out.println("Value of a is "+a);         // we can access a variable from here because scope of a variable is main method;
            //int a=12;     // error variable a is already declared in method main(); cause the scope of a variable already present in LB also.            
        }
        System.out.println("After Local Block");
        System.out.println("Value of a is "+a);         
        //System.out.println("value of b is : "+b);       // can't find b variable cause scope of b is end with Local Block.
        int b=45;                                          // b var can declare here cause b is not exist after local block;
        System.out.println("value of b is : "+b);       // we can use b after declare here.

        

    }
}