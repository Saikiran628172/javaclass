import java.io;
public class Onesixone
{
public static void main(string[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("get n=");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("input of array=");
for(int i=0;i<n;i++)
{
int arr[i]=sc.nextInt[];
}
System.out.println(arr[i]);
System.out.println("n-1 th smallest element=");
Arrays.sort(arr);
System.out.println(arr[n-1]);
System.out.println("n-1th largest element");
Arrays.sort(arr,Collections.reverseOrder());
System.out.println(arr[n-1]);
}
}