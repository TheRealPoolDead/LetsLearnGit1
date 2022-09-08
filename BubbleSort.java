public class BubbleSort
{
    public static void main(String[] args)
    {
        int a[]={0,4,1,2,96};
        int i,j,temp;
        for(i=0;i<a.length;i++)
        {
            int flag=0;
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        for(i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
    }
}