import java.util.Properties;
import java.util.Enumeration;
//import java.io.*;
public class SystemPropertyUse {
    public static void main(String[] args){
        Properties pr=new Properties();     // Properties is a predefine Class presented by Sun. which in java.util Package.


        pr.setProperty("sId","101");
        pr.setProperty("sName","Pratik Bera");
        pr.setProperty("course","Core Java");
        pr.setProperty("fee","2500");


        /*Case 1 : If We Know the Property names then we can access in that way. */
        System.out.println("Displaing Property Key(names) and values directly using pr obj and key name :");
        System.out.println("sId="+pr.getProperty("sId"));
        System.out.println("sName="+pr.getProperty("sName"));
        System.out.println("course="+pr.getProperty("course"));
        System.out.println("fee="+pr.getProperty("fee"));
        System.out.println();
        System.out.println();


        /*Case 2 : If we don't know the Property Name How we can access the value ? 
         *  by using  Enumeration we can access all names and values. Let's see
        */
        Enumeration e=pr.propertyNames();       //Here we are Creating Enumeration e and store the p1 object in it;
                                                // impoert java.util for using Enumeration.
        System.out.println("Displing Property key(Names) and values using nextElement() method and Enumeration repeatedly :");
        String propValue=(String)e.nextElement();
        System.out.println(propValue+" = "+pr.getProperty(propValue));
        propValue=(String)e.nextElement();
        System.out.println(propValue+" = "+pr.getProperty(propValue));
        propValue=(String)e.nextElement();
        System.out.println(propValue+" = "+pr.getProperty(propValue));
        propValue=(String)e.nextElement();
        System.out.println(propValue+" = "+pr.getProperty(propValue));
        //propValue=(String)e.nextElement();                                // That will giving EE because there are not available any property.
        //System.out.println(propValue+" = "+pr.getProperty(propValue));    //  Hashtable Enumerator Error.
        System.out.println();
        System.out.println();

        /* Case 3: To avoid this Code repeatation we need to use loop . Let's Try */
        Enumeration e2=pr.propertyNames();      // here we assign new variable named e2 of Enumeration because we already display all name
                                                // and value of e variable with nextElement() method.
        System.out.println("Displaing the Names and values using loop :");
        while(e2.hasMoreElements()){            //hasMoreElements() returns true and false if there any key available in e2.nextElement() method.
            propValue=(String)e2.nextElement();
            System.out.println(propValue+" = "+pr.getProperty(propValue));
        }


    }
    
}
