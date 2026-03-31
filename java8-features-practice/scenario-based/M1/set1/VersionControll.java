import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VersionControll {

    static class FileVersion{
        String version;
        int size;

        FileVersion(String v,int s){
            version=v;
            size=s;
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        Map<String,List<FileVersion>> map=new HashMap<>();

        for(int i=0;i<n;i++){

            String line=sc.nextLine();
            String[] p=line.split(" ");

            String cmd=p[0];

            if(cmd.equals("UPLOAD")){

                String name=p[1];
                String ver=p[2];
                int size=Integer.parseInt(p[3]);

                map.putIfAbsent(name,new ArrayList<>());

                boolean exists=false;

                for(FileVersion f:map.get(name))
                    if(f.version.equals(ver))
                        exists=true;

                if(!exists)
                    map.get(name).add(new FileVersion(ver,size));

            }

            else if(cmd.equals("FETCH")){

                String name=p[1];

                if(!map.containsKey(name)){
                    System.out.println("File Not Found");
                    continue;
                }

                List<FileVersion> list=new ArrayList<>(map.get(name));

                list.sort((a,b)->{
                    if(a.size!=b.size)
                        return a.size-b.size;
                    return a.version.compareTo(b.version);
                });

                for(FileVersion f:list)
                    System.out.println(name+" "+f.version+" "+f.size);
            }

            else if(cmd.equals("LATEST")){

                String name=p[1];

                if(!map.containsKey(name)){
                    System.out.println("File Not Found");
                    continue;
                }

                List<FileVersion> list=map.get(name);

                FileVersion f=list.get(list.size()-1);

                System.out.println(name+" "+f.version+" "+f.size);
            }

            else if(cmd.equals("TOTAL_STORAGE")){

                String name=p[1];

                if(!map.containsKey(name)){
                    System.out.println("File Not Found");
                    continue;
                }

                int sum=0;

                for(FileVersion f:map.get(name))
                    sum+=f.size;

                System.out.println(name+" "+sum);
            }
        }
    }
}