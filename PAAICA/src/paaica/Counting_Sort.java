

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


public class Counting_Sort {  
    
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
       
        System.out.println("Ordenação CountingSort arquivo:"+ tam + letra+" - teste:"+k); 
        long tempoInicial = System.currentTimeMillis();
        countingSort(vetor,vetor.length);
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

