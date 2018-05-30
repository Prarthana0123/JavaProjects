package Sample;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String string) {
		
    	super(string);
	}


}
public class CLA
{
public static void main(String args[])
{
if(args.length>0)
{
try{
       String Name =args[0];
        int age = Integer.parseInt(args[1]);  
        if(age<18 && age >60)
           throw new InvalidAgeException("Age is Invalid");
        else
            System.out.println("Name:"+Name+" Age:"+age);
    }
catch(InvalidAgeException exp){
System.out.println("Catch block");
System.out.println(exp);
}
}
}
}
