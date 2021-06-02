class Demo1
{
    static boolean search(int arr[],int a)
    {
        for(int i:arr)
        {
            if(a==i)
                return true;
        }
        return false;
    }
    static int ArrayChallenge(int arr[])
    {
        int min=arr[0];
        int max=arr[0];

        for(int i:arr)
        {
            if(min>i)
            min=i;
        }
        for(int i:arr)
        {
            if(max<i)
            max=i;
        }
        int count=0;       
        for(int i=min+1;i<max;i++)
        {   
            if(!search(arr, i))
                count++;
            
        }
        return count;
    }

    public static void main(String ar[])
    {
        // int a[]={-2,10,4};
        // System.out.println(ArrayChallenge(a));
        
        int i=0;
        while(i<17)
        {
            System.out.println(i);
            i-=3;
            i+=5;
        }

    }
}