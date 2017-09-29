
public class Fila 
{
    
    int [] vet;
    int inicio, fim, max;
           
    public Fila(int Max)
    {
        
        vet = new int [Max];
        max = Max;
        inicio = fim = 0;
 
    }
    
    public void enfileira(int novo)
    {
        if(inicio != max)   //tem espaço na fila
        {
         vet[fim] = novo;
        fim++;
            
        }
        else
        {
            System.out.println("Fila Cheia!");
            
        }
    }
    
    public int desenfileira()       
    {
        int x;
        
        
        if(inicio != fim)   //tem alguem na fila
        {
         x = vet[inicio];  
         inicio++;
            
        }
        else
        {
            x = Integer.MAX_VALUE;
            System.out.println("Fila Vazia!");
        }
        
        return x;
        
    }
    
    
    public String toString()
    {
      String srt = "";
      for(int i = inicio; i < fim; i++)
          srt += vet[i] + " ";
      
      return srt;    
        
    }
 
}
