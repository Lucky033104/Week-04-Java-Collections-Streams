package Exceptions;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = null;
        if (size > 0) {
            array = new int[size];
            System.out.println("Enter " + size + " integer values for the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        }
        System.out.print("Enter the index to retrieve value: ");
        int index = scanner.nextInt();
        try {
            if (array == null) {
                throw new NullPointerException();
            }
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized");
        } finally {
            scanner.close();
        }
    }
}

