package Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        String arr[] = new String[]{"Java","C",".Net","C++","Python","JS","HTML"};
        int deleteAt = 3;

        System.out.println();
        System.out.println("===Array Before Deletion===== ");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        //shift elements towards deletion index
        for(int i = deleteAt-1 ; i < arr.length-1;){
            arr[i] = arr[++i];
        }
        arr[arr.length-1] = null; //update last elemeent with default or null value

        //Printing after Deletion at index 0
        System.out.println("===Array after Deletion===== ");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
