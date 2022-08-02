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
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.R;


public class Generico_teste {
    
    public void ordena(int[] vetor) {
		quicksort(vetor, 0, vetor.length-1);
	}
	
	private static void quicksort (int[] vetor, int esq, int dir) {
		int pivo = vetor[(esq+dir)/2];
		int i = esq, j = dir;
		int troca;
		while (i <= j) {
			while (vetor[i] < pivo) i++;
			while (vetor[j] > pivo) j--;
			if (i <= j) {
				troca = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = troca;
				i++; j--;
			}
		}		
		if (esq < j) {
			quicksort(vetor, esq, j);
		}
		if (dir > i) {
			quicksort(vetor, i, dir);
		}
	}

  
        public static void countingSort(int[] a, int m){
        int n = a.length;
         
        int vetorAuxiliar[] = new int[m];
         
        //1ª - (Inicializar com zero)
        for(int i = 0; i < m; i++){
            vetorAuxiliar[i] = 0;
        }
         
        //2ª - Contagem das ocorrencias
        for(int i = 0; i < n; i++){
            vetorAuxiliar[a[i]]++;
        }
 
        //3ª - Ordenando os indices do vetor auxiliar
        int sum = 0;                
        for(int i = 0; i < m; i++){
            int dum = vetorAuxiliar[i];
            vetorAuxiliar[i] = sum;
            sum += dum;
        }       
        int vetorOrdenado[] = new int[n];
        for(int i = 0; i < n; i++){
            vetorOrdenado[vetorAuxiliar[a[i]]] = a[i];
            vetorAuxiliar[a[i]]++;
        }
         
        //4ª Retornando os valores ordenados para o vetor de entrada
        for (int i = 0; i < n; i++){
            a[i] = vetorOrdenado[i];
        }
    }
    
     
    public static void heapSort(int[] vetor)
        {
            buildMaxHeap(vetor);

            int tamanho = vetor.length;
 
            for (int i = vetor.length - 1; i > 0; i--)
            {
                swap(vetor, i, 0);
                maxHeapify(vetor, 0, --tamanho);
            }
        }


    private static void buildMaxHeap(int[] vetor)
        {
            for (int i = vetor.length / 2 - 1; i >= 0; i--)
            {
                maxHeapify(vetor, i, vetor.length);               
            }     
        
        }

    private static void maxHeapify(int[] vetor, int pos, int tamanho)
        {
            int max = 2 * pos + 1, right = max + 1;
            if (max < tamanho)
            {
                if (right < tamanho && vetor[max] < vetor[right])
                    max = right;
                if (vetor[max] > vetor[pos])
                {
                    swap(vetor, max, pos);
                    maxHeapify(vetor, max, tamanho);
                }
            }
        }
    
    public static void swap(int[] vetor, int j, int aposJ)
        
        {
            int aux = vetor[j];
            vetor[j] = vetor[aposJ];
            vetor[aposJ] = aux;
        }
    
    public static void bubbleSort(int v[]) {
         
        for (int i = v.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (v[j - 1] > v[j]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
       
    }
     
     public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;        
        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }        
    } 
     
     public static void selectionSort(int[] array) {    
    for (int fixo = 0; fixo < array.length - 1; fixo++) {
      int menor = fixo;

      for (int i = menor + 1; i < array.length; i++) {
         if (array[i] < array[menor]) {
            menor = i;
         }
      }
      if (menor != fixo) {
        int t = array[fixo];
        array[fixo] = array[menor];
        array[menor] = t;
      }
    }
   
  }
     
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
     int i=0,numero=0,x=0;
      int tam =100000;    // tamanho do vetor
      long tempoInicial=0;
             
        String l = "";
        String b = "";
        
   Scanner keyboard = new Scanner(System.in);
    System.out.print("Informe a quantidade de numeros: ");
    tam = keyboard.nextInt(); 
    System.out.print("Informe o tipo de ordem AD,AR,CR,CD,DD e DR : ");
    l = keyboard.next();
    System.out.print("Informe o metodo de ordenação B,C,Q,S,H,M e I : ");
    b = keyboard.next();
    
  int[] vetor = new int[tam];  
    
        try {
                  
            // Le o arquivo
            FileReader ler = new FileReader("B"+tam+l);
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                //System.out.println(linha);
                numero=parseInt(linha);
                vetor[i]=numero;
                i++;
            }

           
        } catch (IOException e) {
            e.printStackTrace();
        }
       System.out.println("B"+tam+l);
       switch (b) {
            case "B":
                System.out.println("BubbleSort");
                tempoInicial = System.currentTimeMillis();
                 bubbleSort(vetor);
                System.out.println("****** Tempo:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s ***");
            break;
            
             case "I":
                 System.out.println("InsertionSort");
                tempoInicial = System.currentTimeMillis();
                 insertionSort(vetor);
                System.out.println("****** Tempo:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s ***");
            break;
             
             case "S":
                 System.out.println("SelectionSort");
                tempoInicial = System.currentTimeMillis();
                 selectionSort(vetor);
                System.out.println("****** Tempo:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s ***");
            break;
             case "M":
                 System.out.println("MergeSort");
                tempoInicial = System.currentTimeMillis();
                 mergeSort(vetor,0,vetor.length-1);
                System.out.println("****** Tempo:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s ***");
            break;
            case "H":
                System.out.println("HeapSort");
                tempoInicial = System.currentTimeMillis();
                 heapSort(vetor);
                System.out.println("****** Tempo:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s ***");
            break;
            case "C":
                System.out.println("CountingSort");
                tempoInicial = System.currentTimeMillis();
                 countingSort(vetor,vetor.length);
                System.out.println("****** Tempo:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s ***");
            break;
            case "Q":
                System.out.println("QuickSort");
                tempoInicial = System.currentTimeMillis();
                 quicksort(vetor,0,vetor.length);
                System.out.println("****** Tempo:" + ((System.currentTimeMillis() - tempoInicial)/1000.00)+" s ***");
            break;  
            default:
            System.out.println("Este não é um dia válido!");
       }
       
         for(i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
          
        System.out.println("quantidade de numeros Ordenados= "+i);   

}
   
        
}