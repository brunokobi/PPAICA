

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


public class Heap_Sort {  
    
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

   
  
 
   
   public static void main(String[] args) {       
        int tam;    // tamanho do vetor
        int j=0,y=0,i=0,k=0,numero=0,cont=0;
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
       
        System.out.println("Ordenação HeapSort arquivo:"+ tam + letra+" - teste:"+k); 
        long tempoInicial = System.currentTimeMillis();
        heapSort(vetor);
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
