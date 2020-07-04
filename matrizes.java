/*
    Esse código dedica-se a criar, acessar e manipular matrizes.
*/

public class matrizes {
    
    public static void main(String[] args)
    {
        //Declara matrizes
        String[][] names = {
            {"Sr. ", "Sra. ","Srta. "},
            {"Sálvio", "Marilene"}
        };
        //Acessando a matriz
        System.out.println("Criando e acessando a mensagem...");
        System.out.println(names[0][0] + names[1][0] + " diz: ");
        System.out.println("Olá "+ names[0][1] + names[1][1]+"\n");

        //Copiando um vetor/matriz modo 1
        System.out.println("1 - Copiando...");
        String[][] copyTo = new String[2][2];
        System.arraycopy(names, 0, copyTo, 0, 2);
        System.out.println(copyTo[0][0] + copyTo[1][0]+ " diz: ");
        System.out.println("Olá: " + copyTo[0][1] + copyTo[1][1]+"\n");
        //Copiando vetor/matris modo 2
        System.out.println("2 - Copiando...");
        String[][] copyOf = java.util.Arrays.copyOfRange(names, 0, 2);
        System.out.println(copyOf[0][0] + copyOf[1][0]+ " diz: ");
        System.out.println("Olá " + copyOf[0][1] + copyOf[1][1]+"\n");
        /*
            A classe java.util.Arrays pode ser usada para funções tais:
            - Procura;
            - Comparação;
            - Preenchimento;
            - Ordenamento(sequencial ou paralelo);
        */
    }
    
}