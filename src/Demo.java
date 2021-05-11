public class Demo {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10,12};
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int j=arr1.length+1;j<arr3.length;j++){
            arr3[j]=arr2[j-arr1.length];
        }
        for(int a:arr3){
            System.out.print(a + " ");
        }
    }
}
