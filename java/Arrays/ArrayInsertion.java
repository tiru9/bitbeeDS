package Arrays;

public class ArrayInsertion{
    public static void main(String[] args) {
        String arr[] = new String[]{"Java","C","C++","Python","JS","HTML",null};
        int insertAt = 2;
        String newName = ".Net";

        System.out.println();
        System.out.println("===Array Before insertion===== ");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println();

        //shift elements towards end from given index to insert
        for(int i = arr.length-1 ; i >= insertAt; i--){
            arr[i] = arr[i-1];
        }
        arr[insertAt] = newName;

        //Printing after insertion at index 2
        System.out.println("===Array after insertion===== ");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}