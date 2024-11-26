/* On Before approach we can't hide the sensitive data like password,pin,ect... therefore in java 6V introduced 
 * Console Class in java.
 */

import java.io.Console;
class Logger{
    public static void main(String[] args){
        Console cns=System.console();
        System.out.println("User :");
        String user=cns.readLine();
        System.out.println("Password : ");
        char[] password=cns.readPassword();
        System.out.println("Your Entered data is :");
        System.out.println("User : "+user);
        System.out.println("Password : "+new String(password));

    }
}