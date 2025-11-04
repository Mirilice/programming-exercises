using System; 

class URI {

    static void Main(string[] args) { 
        
        int total = 0;
        string T = Console.ReadLine(); 
        string[] competidor = Console.ReadLine().Split();
        for (int i = 0; i < competidor.Length; i++){
            if (competidor[i] == T){
                total+=1;
            }
        }
        Console.WriteLine(total);

    }

}