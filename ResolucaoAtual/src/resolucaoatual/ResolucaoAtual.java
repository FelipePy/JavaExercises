/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaoatual;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoAtual {
    
    public static void main(String[] args) {
        
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screen.getWidth();
        int hight = (int) screen.getHeight();
        System.out.printf("Sua resolução atual é de %dx%d\n", width, hight);
    }
    
}
