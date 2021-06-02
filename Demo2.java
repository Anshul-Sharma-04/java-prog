import java.util.*;
class Demo2
{
public static int call(int n,int arr[])
{
    int days=0;
    ArrayList<Integer> al=new ArrayList<>();
    
    for(int i:arr)
        al.add(i);

    for(int i=0; i < n; i++){  
        // boolean t=false;    
        for(int j=1; j < (n); j++)
             {  
                 System.out.println(al);
                 
                     if( al.get(j-1) < al.get(j)  ){  
                            al.remove(al.get(j));
                            // t=true;
                            n=al.size();
                     }  
                    days++;     
             }

            //  if(!t)
            //  return days;
            }
    return days;         
}


public static void main(String ar[])
{
    int a[]={6,5,8,4,7,10,9};
    System.out.println(call(7, a));

}
}