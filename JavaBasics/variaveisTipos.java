package JavaBasics;

public class variaveisTipos {

    public static void main(String[] args){
        
        // Tipos Literais
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        System.out.println(capitalC +"\n"+ b);
        System.out.println(s + "\n" + i);

        // Números base
        // Decimal
        int decVal = 26;
        // Hexadecimal
        int hexVal = 0x1a;
        // Binary
        int binVal = 0b11010;
        System.out.println(decVal+" "+ hexVal +" "+ binVal);

        //Números reais
        double d1 = 123.4;
        double d2 = 1.234e2;
        float f1 = 123.4f; 
        System.out.println(d1+" "+ d2+" "+ f1 +"\n");

        //Números de escrita longa
        long creditCardNumber = 1234_5678_9012_3456L;
        long cadastroPessoaFisica = 123_456_789_01L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        System.out.println(creditCardNumber);
        System.out.println(cadastroPessoaFisica);
        System.out.println(pi);
        System.out.println(hexBytes);
        System.out.println(hexWords);
        System.out.println(maxLong);
        System.out.println(nybbles);
        System.out.println(bytes);
    }
}