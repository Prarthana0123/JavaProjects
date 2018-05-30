package Sample;

import java.util.ArrayList;

class emp {
   	 int id ;
    	String name;
    String address;
     int salary;
    public emp(int i, String name, String add, int sal) 
    {
        super();
       this.id = i;
        this.name = name;
       this.address=add;


       this.salary=sal;

    }
}
public class ArrayList {
            public static void main(String[] args) 
            {
                int givenEmpId = 3;
 	 String givenEmpName = "Pinky";
                ArrayList<emp> empList = new ArrayList<emp>();
                empList.add(new emp(1,"Priya","Hyderabad",10000));
                empList.add(new emp(2,"Vijaya","Banglore",20000));
                empList.add(new emp(3,"Pinky","Mysore",30000));
                  for ( emp currEmp : empList)  
                        {  
                            
if(currEmp.id==givenEmpId && currEmp.name==givenEmpName)
                            {
                                System.out.println("Employee details are===>>"+"\nEmployee id is:"+currEmp.id+"\nEmployee name is:"+currEmp.name+"\nEmployee address is:"+currEmp.address+"\nEmployee salary is:"+currEmp.salary);
                            }
                        }
            }
}

