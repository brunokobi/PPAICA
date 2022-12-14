

package paaica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;
import static paaica.Generico_teste.merge;


public class Merge_Sort {    

 public static void merge(int arr[], int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 =  r - m; 
  
    /* create temp arrays */
    int[]L = new int[n1];
    int[]R = new int[n2];
    
  
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++) 
        L[i] = arr[l + i]; 
    for (j = 0; j < n2; j++) 
        R[j] = arr[m + 1+ j]; 
  
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray 
    j = 0; // Initial index of second subarray 
    k = l; // Initial index of merged subarray 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
  
    /* Copy the remaining elements of L[], if there 
       are any */
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 
  
    /* Copy the remaining elements of R[], if there 
       are any */
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
  
/* l is for left index and r is right index of the 
   sub-array of arr to be sorted */
public static void mergeSort(int arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        // Same as (l+r)/2, but avoids overflow for 
        // large l and h 
        int m = l+(r-l)/2; 
  
        // Sort first and second halves 
        mergeSort(arr, l, m); 
        mergeSort(arr, m+1, r); 
  
        merge(arr, l, m, r); 
    } 
} 

   
   public static void main(String[] args) {
        int tam;    // tamanho do vetor
        int j=0,y=0,k=0,i=0,numero=0,cont=0;
        String letra="AD";
        
  for(j=0;j<18;j++){
      tam= 100000;
      
      if(2<j&&j<6)
         letra="CD";
      else if(5<j&&j<9)
          letra="DD";
       else if(8<j&&j<12)
          letra="AR";
      else if(11<j&&j<15)
          letra="CR";
      else if(14<j&&j<18)
          letra="DR";
      
      if(k>=3)
          k=0;
      k++;
      
         
          
      
      
    for(i=0;i<11;i++){
    Scanner keyboard = new Scanner(System.in);
    //System.out.print("Informe a quantidade de numeros ");
    //tam = keyboard.nextInt();  
    int[] vetor = new int[tam];
   
       
        try {
                  
            // Le o arquivo
            FileReader ler = new FileReader("B"+tam+letra);
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                //System.out.println(linha);
                numero=parseInt(linha);
                vetor[cont]=numero;                
                cont++;
            }

           
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        System.out.println("Ordena????o MergeSort arquivo:"+ tam + letra+" - teste:"+k);        
        long tempoInicial = System.currentTimeMillis();
        mergeSort(vetor,0,tam-1);
        System.out.println("****** o metodo executou em:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s *****");
        System.out.println("quantidade de numeros Ordenados= "+cont);
        System.out.println("");
        /*for(y=0;y<tam;y++){
            System.out.println(vetor[y]);
        }*/
        cont=0;
        tam+=60000; 
    } 
   
  }
        
        
        /* for(i=0;i<tam;i++){
            System.out.println(vetor[i]);
        }*/
        
       // System.out.println("quantidade de numeros Ordenados= "+cont);   

}
   
  

}