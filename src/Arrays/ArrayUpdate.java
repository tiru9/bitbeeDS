package Arrays;

public class ArrayUpdate {
    public static void main(String[] args) {
        String arr[] = new String[]{"Java","C","C++","Python","JS","HTML"};
        int updateAt = 1;
        String newName = ".Net";

        System.out.println();
        System.out.println("===Array Before Update===== ");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println();

        arr[updateAt] = newName;//no shifting required

        //Printing after insertion at index 1
        System.out.println("===Array after Update===== ");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}