public class Main {
     static void helperFunction(int[] nums,int from, int to)
    {
        int i = from;
        int j = to;
        int temp;
        while(i<j)
        {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        helperFunction(nums,0,n-1);
        helperFunction(nums,0,k-1);
        helperFunction(nums,k,n-1);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int n = nums.length;

        int k = 3;

        k = k % n;
        System.out.print("Original Array : "+" ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        rotate(nums,3);
        System.out.print("Rotated Array : " + " ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}