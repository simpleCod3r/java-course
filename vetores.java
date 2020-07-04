public class vetores {
    public static void main (String[] args)
    {
        //Declara vetor de tipo inteiros
        int[] anArray; 
        //Aloca memória para 10 elementos de tipo inteiro
        anArray = new int[10];

        //Inicializa elementos 
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Elemento de índice 0: " + anArray[0]);
        
        //Declara tipos de vetores
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings; 

        //Também é possível criar e declarar de maneira curta
        int[] anShortArray = { 
            100, 200, 300,
            400, 500, 600, 
            700, 800, 900, 1000
        };
        System.out.println(anShortArray[2]);

        //A quantidade de elementos de um vetor
        System.out.println(anShortArray.length);
    }
}