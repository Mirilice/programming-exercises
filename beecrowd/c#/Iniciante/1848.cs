using System; 

class URI {

    static void Main(string[] args) {
        int caw = 0;
        int total = 0;
        int[] pesos = new int[3] {4, 2, 1};
        while (caw < 3) {
            string linha = Console.ReadLine();
            if (linha != "caw caw")
            {
                for (int i = 0; i < 3; i++)
                {
                    if (linha[i] == '*')
                    {
                        total += pesos[i];
                    }

                }
                
            }else{
                Console.WriteLine(total);
                caw += 1;
                total = 0;
            }
        }

    }

}