import java.util.Scanner;

public class Email {

    static boolean check(String email){

        if(email.contains(" "))
            return false;

        try{

            String[] p=email.split("@");

            String user=p[0];
            String domain=p[1];

            if(!domain.equals("company.com") && !domain.endsWith(".company.com"))
                return false;

            String[] parts=user.split("\\+");
            String name=parts[0];
            String digits=parts[1];

            if(digits.length()<4)
                return false;

            for(char c:digits.toCharArray())
                if(!Character.isDigit(c))
                    return false;

            String[] names=name.split("\\.");

            String f=names[0];
            String l=names[1];

            if(f.length()<3 || l.length()<3)
                return false;

            for(char c:f.toCharArray())
                if(!Character.isLowerCase(c))
                    return false;

            for(char c:l.toCharArray())
                if(!Character.isLowerCase(c))
                    return false;

            String dept=domain.split("\\.")[0];

            if(!(dept.equals("sales")||
                 dept.equals("marketing")||
                 dept.equals("IT")||
                 dept.equals("product")))
                return false;

        }
        catch(Exception e){
            return false;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String email=sc.nextLine();

            if(check(email))
                System.out.println("Access Granted");
            else
                System.out.println("Access Denied");
        }
    }
}