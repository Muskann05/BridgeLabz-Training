import java.util.Scanner;

public class DynamicTemplate{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){

            String s=sc.nextLine();

            while(s.contains("${")){

                int start=s.indexOf("${");
                int end=s.indexOf("}",start);

                String exp=s.substring(start+2,end);

                String[] p=exp.split(":");

                String type=p[0];
                String val=p[1];

                String rep="INVALID";

                try{

                    if(type.equals("UPPER"))
                        rep=val.toUpperCase();

                    else if(type.equals("LOWER"))
                        rep=val.toLowerCase();

                    else if(type.equals("DATE")){

                        String[] d=val.split("-");
                        rep=d[2]+"/"+d[1]+"/"+d[0];
                    }

                    else if(type.equals("REPEAT")){

                        String[] r=val.split(",");
                        String word=r[0];
                        int c=Integer.parseInt(r[1]);

                        rep="";
                        for(int j=0;j<c;j++)
                            rep+=word;
                    }

                }catch(Exception e){
                    rep="INVALID";
                }

                s=s.substring(0,start)+rep+s.substring(end+1);
            }

            System.out.println(s);
        }
    }
}