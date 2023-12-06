import java.util.*;
public class LinearSearch {
    public static void main(String arg[])
    {  int size;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        size=sc.nextInt();
       int[] array=new int[size];
        System.out.println("input array elements");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("enter search element");
       int element=sc.nextInt();
       for(int j=0;j<size;j++)
       {
        if(array[j]==element)
        {
            System.out.println("Element found at index:"+j);
            flag=true;
            break;
        }
       }
       if(flag==false)
       {
        System.out.println("Element not found");
       }
        
    }
    
}
