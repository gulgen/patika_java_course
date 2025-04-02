package week3;

public class GenericPrint {
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer [] intArray = {7,8,9,10};

        String [] strArray = {"Java" , "Generics", "Work" };

        Double [] dblArray = {1.1, 2.2, 3.3};

        printArray(intArray);
        printArray(strArray);
        printArray(dblArray);
    }
}
