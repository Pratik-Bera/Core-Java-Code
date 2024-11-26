/* Local Variable Type Inference (take) is used for not declaring the data types of a variable . by using it we can borrow the type of
** variable from right side value types , it can be PDT,RDT,Object type also*/

class LVTypeInference{
    public static void main(String[] args){
        System.out.println("This code is writting for clearence the Local Variable Type Inference");  
        var a=10;       //type  of a is int cause that takes from right side;
        // var b;          //Error :cannot use 'var' on variable without initializer,
        var obj=new LVTypeInference();
        System.out.println("All the instructions are successfully execute.");
    }
}