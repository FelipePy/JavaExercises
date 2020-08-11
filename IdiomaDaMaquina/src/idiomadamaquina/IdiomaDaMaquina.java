/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadamaquina;

import java.util.*;

public class IdiomaDaMaquina {

    public static void main(String[] args) {
        Locale language = Locale.getDefault();
        String language2 = language.getDisplayLanguage();
        
        System.out.printf("Seu sistema está em %s\n", language2);
    }
    
}
