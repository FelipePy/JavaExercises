package primeiroprograma;
    
import java.util.Scanner; //Importação que traz entradas de dados

public class PrimeiroPrograma {
    
    public static void main(String[] args){
        
        int number = 55; // Declaração de variavel int
        int age = (int) 18; //Também uma declaração de variavel int mas é chamada de typecast
        Integer value = new Integer (9); //Classe involucro. É um objeto e não uma variavel, e sabe-se que é um objeto, pois se for new, ela é considerada objeto
        
        byte number3; //byte tem um valor maximo aceitavel de 127
        short number4; //short valor maximo aceitavel de 32767
        long number5; //long valor maximo aceitavel de 2 elevado a 63
        
        float salary = 192.5f; //Declaração de uma variavel float
        float payment = (float) 200.99; //Também a de declaração de uma variavel float mas é chamada de typecast
        Float accounts = new Float (1076.55); //Classe involucro. É um objeto e não uma variavel, e sabe-se que é um objeto, pois se for new, ela é considerada objeto
        
        double number6; //double tem um valor maximo aceitavel de 1.8*e elevado a +308
                
        char name = 'F'; //Declaração de uma variavel char
        char letter = (char) 'B'; //Também uma declaração de uma variavel char  mas é chamada de typecast
        Character name2 = new Character ('C'); //Classe involucro. É um objeto e não uma variavel, e sabe-se que é um objeto, pois se for new, ela é considerada objeto
        
        boolean married = true; // Declaração de uma variavel boolean
        boolean haveBear = (boolean) false; //Também uma declaração de variavel boolean mas é chamada de typecast
        Boolean haveCat = new Boolean (true); //Classe involucro. É um objeto e não uma variavel, e sabe-se que é um objeto, pois se for new, ela é considerada objeto  
        
        Scanner keyboard = new Scanner (System.in); //Scanner e o (System.in), servem para que possamos ler o que foi digitado no teclado.
        
        System.out.print("Type student name: "); //print normal
        String salaryFolks = keyboard.nextLine(); //salaryFolks esta recebendo o que foi digitado no teclado como string.
        
        System.out.print("Type your note: "); //print normal
        float note = keyboard.nextFloat(); //note esta recebendo o que for digitado no teclado como valor float.
        
        System.out.printf("A nota de %s é: %.1f\n", salaryFolks, note); //printf é o print formatado.
        
        String number2 = "30.5";
        String value2 = Integer.toString(number); //Integer.toString converte uma variavel de int para String.
        //int value3 = Integer.parseInt(number2);  //Integer.parseInt converte uma string numérica inteira para int
        float value4 = Float.parseFloat(number2); //Float.parseFloat converte uma string numerica Real para float
        
        int haveDog = 189;

        Float dog = Float.intBitsToFloat(haveDog);
        
        
        System.out.printf("%.2f\n", dog);
    }
}

