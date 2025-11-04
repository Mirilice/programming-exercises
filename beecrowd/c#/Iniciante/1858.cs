using System; 
using System.Linq;

class URI {

    static void Main(string[] args) { 
        int resposta = 1;
        int N = int.Parse(Console.ReadLine());
        string[] stringsDeGolpes = Console.ReadLine().Split(' ');
        int[] T =  stringsDeGolpes.Select(int.Parse).ToArray();
        int menor = T[0];
        for (int i = 1; i < T.Length; i++){
            if (T[i] < menor){
            menor = T[i];
            resposta = i + 1;
        }
    }
    Console.WriteLine(resposta);

    }

}