import java.util.Scanner;

public class App{
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int input;
    System.out.print("Masukkan panjang array : ");
    input = read.nextInt();
    int[] arr = new int[input];
      for(int j = 0; j < arr.length; j++){
        System.out.print("Angka ke-" + j + " : ");
        arr[j] = read.nextInt();
      }

      System.out.println("Before insertion sort : ");
      for(int b = 0; b < arr.length; b++){
        System.out.print(arr[b] + " ");
      }

    for(int i = 1; i < arr.length; i++){
      for ( int j = i; j > 0; j--){
        if( arr[j] < arr[j-1]){
          int tanda = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = tanda;
        }
      }
    }

    System.out.println();
    System.out.println("Afeter insertion sort : ");
    for(int z = 0; z < arr.length; z++){
      System.out.print(arr[z] + " ");
    }
  
  }
}