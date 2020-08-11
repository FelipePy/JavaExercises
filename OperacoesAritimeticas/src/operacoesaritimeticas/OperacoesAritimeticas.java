package operacoesaritimeticas;

public class OperacoesAritimeticas {

    public static void main(String[] args) {
       /* int number1 = 3, number2 = 5;
         float average = (number1 + number2) / 2;
         System.out.format("A média é igual a: %.1f \n", average);
        */
        
       /* int number = 10, number2 = 10;
         int value = 5 + ++number; //Incrementa antes da operação entre value e number ser feita, ou seja, a soma fica 5+11 = 16;
         int value2 = 5 + number2++; //Incrementa depois da operação, ou seja, ele faz a soma, e guarda 10+5 em value2, e depois incrementa na variavel number.
         System.out.printf("%d \n", value);
         System.out.printf("%d \n", value2);
        */
        
        /*float squareRoot = (float) Math.sqrt(25); //Raiz quadrada de 25
        float exponentiation = (float) Math.pow(5, 2); //5 elevado a 2
        float rootCubic = (float) Math.cbrt(27); //Raiz cubica de 27
        float pi = (float) Math.PI; //Pi
        System.out.println("Raiz quadrada: " + squareRoot); 
        System.out.println("Exponenciação: " + exponentiation);
        System.out.println("Raiz cubica: " + rootCubic);
        System.out.println("Pi: " + pi);
        
        float valueAbsolute = (float) Math.abs(-10); //Qualquer valor sera transformado em seu valor absoluto
        float forDown = (float) Math.floor(6.9); //Arredonda o valor para baixo, não importa o quão perto ele estiver do proximo número
        float forUp = (float) Math.ceil(3.1); //Ao contrario do acima, esse arredonda para cima
        float arithmeticRounding = (float) Math.round(10.4); //Arredonda aritimeticamente, ou seja, se estiver acima de .5 ele arredonda para cima, se não, arredonda para baixo
        
        System.out.println("Valor absoluto, sem sinal e casa decimal: " + valueAbsolute);
        System.out.println("Valor arredondado para baixo: " + forDown);
        System.out.println("Valor arredondado para cima: " + forUp);
        System.out.println("Arredondado aritmeticamente: " + arithmeticRounding);
        
        float random = (float) Math.random(); //randomiza um valor aleatório de 0 a 1
        int randomize = (int) (5 + random * (11-5)); 
        /*Para gerar numero aleatorio de acordo com pré incio e fim, precisamos utilizar da matemática
        * como por exemplo acima, o valor minimo é 5, e o maximo é 10.
         
        System.out.println(randomize);
        */
        //OPERADOR TERNÁRIO//
        
        /*int n1=5, n2=2, bigger;
        
        bigger = n1 > n2 ? n1:n2; //Se n1 for maior que n2 bigger recebe n1, se não, bigger recebe n2
        System.out.println(bigger);*/
        
        /*String name = "Felipe";
        String name2 = "Felipe";
        String name3 = new String("Felipe");
        String res, res2, res3;
        
        res = name == name2 ? "Igual":"Diferente"; //Aqui daria igual, pois realmente o conteudo de name é igual ao do name2
        System.out.println(res);
        res2 = name == name3 ? "Igual":"Diferente"; //Aqui é diferente pois o objeto name3 foi instanciado de um jeito diferente do name2 e do name, ou seja, o conteudo é igual, mas a forma como foram criados, não são
        System.out.println(res2);
        /*Para que name ou name2 seja igual a name3, temos que utilizar o .equals, que serve para ver se o conteudo dos objetos são iguais
        
        res3 = name.equals(name3)? "Igual":"Diferente"; //Aqui retorna-ra que eles são iguais
        System.out.println(res3);
        */
        //O .equals serve para qualquer classe involucro
       
        //OPERADOR LÓGICO
        /*int number = 5, number2 = 6, number3 = 10;
        boolean r;
        
        r = number < number2 ^ number2 == number3 ? true : false; //Pode somente um ser exclusivamente verdadeiro
        System.out.println(r);
        
        System.out.println(r);*/
       }
    
} 
