using System; 

class URI {

    static void Main(string[] args) { 

        string linha;
        while ((linha = Console.ReadLine()) != null){ //EOF
            string[] input = linha.Split(); 
            int v = int.Parse(input[0]); 
            int t = int.Parse(input[1]);
            Console.WriteLine(2*v*t);
        }

    }

}