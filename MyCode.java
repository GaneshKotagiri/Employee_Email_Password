import java.util.Locale;
import java.util.Scanner;

public class MyCode {
    //Writing a code to create an email id for a company
    String firstName;String lastName;String userName;String department;String password;
    String email;String altEmail;
    //int capacity;
    String organization;
    Scanner sc=new Scanner(System.in);
    public MyCode(){
        System.out.println(this.userName=setUser());
        System.out.println(this.organization=setOrg());
       System.out.println( this.department=setDep());
          System.out.println(this.email=setEmail());
        System.out.println(this.password=setRandPass());
    }
    private String setUser(){
        System.out.println("Enter first name and last name:");
        //Scanner sc=new Scanner(System.in);
        firstName=sc.nextLine();
        lastName=sc.nextLine();
        return this.firstName+" "+this.lastName;
    }
    private String setOrg(){
        System.out.println("Organization:\n1 Micron\n2 Wipro\n3 Accenture");
        int org=sc.nextInt();
        if(org==2){return "Wipro";
        }else if (org==1){return "Micorn";
        } else if (org==3) {return "Accenture";
        }else {return"Error";
        }

    }
    private String setDep(){
        System.out.println("Department:\n1 Developer\n2 Data Engineer\n3 Sales\n4 Security Analyst");
        //Scanner sc=new Scanner(System.in);
        int dep=sc.nextInt();
        System.out.println("This is  your department :");
        if(dep==1){return "Dev";
        }else if (dep==2){return "DA";
        } else if (dep==3) {return "Sal";
        } else if (dep==4) {return "Sec";
        } else {return "none";}

    }
    private String setEmail(){
        System.out.println("This is your official email id:");
        return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"."+organization+".com";
    }
    private String setRandPass(){
        System.out.print("This your random password:\n");
        int len=8;
        char[] ranPass=new char[len];
        String allKeys="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*/?";
        for(int i=0;i<len;i++){
            int rand=(int)(Math.random()*allKeys.length());
           ranPass[i]=allKeys.charAt(rand);
        }
        return new String(ranPass);
    }
    public void setNewPass(String password){this.password=password;}
    public String getNewPass(){return password;}
    public void setAltEmail(String altEmail){
        this.altEmail=altEmail;
    }
    public String  getAltEmail(){
        return altEmail;
    }
}
