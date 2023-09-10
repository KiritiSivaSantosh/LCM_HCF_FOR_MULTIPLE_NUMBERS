import java.util.Scanner;
public class LCM_HCF {
    // finding the lcm of multiple numbers

    static void lcm(int a[])
    {    
        // finding the largest number
         int max = a[0];
         for(int i=1;i<a.length;i++)
         {
            if(a[i]>max)
            {
              max = a[i];
            }
         }

        // finding the multiplication of the numbers
        int m =1;
        for(int i=0;i<a.length;i++)
        {
                  m= m*a[i];
        } 
        boolean te = true;
        
        for(int i=max;i<=m;i+=max)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i%a[j]!=0)
                {
                    te = false;
                    break;
                }
                else{
                    te = true;
                }
               
            }
            if(te==true)
            {
                System.out.println("The lcm of given numbers are :"+i);
                break;
            }
        }
    }

     // Finding hcf of multiple numbers

    static void hcf(int a[])
    {
        // finding the least number
        int l = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<a[0])
            {
                l=a[i];
            }
        }
        boolean f= true;
        for(int i=l;i>0;i--)
        {
           for(int j=0;j<a.length;j++)
           {
            if(a[j]%i!=0)
            {
                f=false;
                break;
            }
            else{
                f=true;
            }
           }
           if(f==true)
           {
            System.out.println("The hcf of the entered numbers is : "+i);
            break;
           }
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of numbers you enter :"); 
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the values :");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        lcm(a);
        hcf(a);
    }
}
