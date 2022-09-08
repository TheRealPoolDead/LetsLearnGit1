import java.io.*;
public class maxRepeat
{
    
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i;
        int [] arr= new int [256];
        System.out.println("Please Enter the String");
        String s=br.readLine();
        int l=s.length();
        for(i=0;i<l;i++)
        {
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;  
        }
        int max=-1;
        char c=' ';
        for(i=0;i<l;i++)
        {
            if(max<arr[s.charAt(i)])
            {
            max=arr[s.charAt(i)];
            c=s.charAt(i);
            }
        }
        System.out.println("The Max repeating character is: " +c);
		System.out.println("Adding new changes for git");
    }
}