import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{

    String name,dept;
    int q1,q2,q3;

    Student(String n,String d,int a,int b,int c){
        name=n; dept=d; q1=a; q2=b; q3=c;
    }

    int total(){
        return q1+q2+q3;
    }
}

public class QuizPerformance{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        List<Student> list=new ArrayList<>();

        for(int i=0;i<n;i++){

            String[] p=sc.nextLine().split(" ");

            if(p[0].equals("Record")){

                Student s=new Student(
                    p[1],p[2],
                    Integer.parseInt(p[3]),
                    Integer.parseInt(p[4]),
                    Integer.parseInt(p[5])
                );

                list.add(s);

                System.out.println("Record Added: "+p[1]);
            }

            else if(p[0].equals("Top")){

                if(list.isEmpty()){
                    System.out.println("No Records Available");
                    continue;
                }

                String key=p[1];

                if(key.startsWith("Q")){

                    int quiz=Integer.parseInt(key.substring(1));
                    int max=0;

                    for(Student s:list){
                        int val=(quiz==1?s.q1:(quiz==2?s.q2:s.q3));
                        max=Math.max(max,val);
                    }

                    for(Student s:list){
                        int val=(quiz==1?s.q1:(quiz==2?s.q2:s.q3));
                        if(val==max)
                            System.out.println(s.name+" "+val);
                    }
                }

                else{

                    int max=-1;

                    for(Student s:list)
                        if(s.dept.equals(key))
                            max=Math.max(max,s.total());

                    if(max==-1){
                        System.out.println("Department Not Found");
                        continue;
                    }

                    for(Student s:list)
                        if(s.dept.equals(key)&&s.total()==max)
                            System.out.println(s.name+" "+max);
                }
            }
        }
    }
}