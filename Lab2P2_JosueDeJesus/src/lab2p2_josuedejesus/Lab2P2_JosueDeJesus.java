/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_josuedejesus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Lab2P2_JosueDeJesus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int opcion = 0, respuesta;
        int opcionM = 0;
        String enter;
        Scanner enterKey = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner respuestaIn = new Scanner(System.in);  
                
        ArrayList lista = new ArrayList();
        
        do
        {

            opcion=Integer.parseInt(
                    JOptionPane.showInputDialog("1- Crear\n"
                            + "2- Listar\n"
                            + "3- Eliminar\n"
                            + "4- Modificar\n"
                            + "5- Salir")
            );
            
            switch(opcion)
            {
                case 1:
                    int opcionSis = 0, tipoGraf = 0;
                    String modelo,disco,teclado,procesador,grafica="",sistema="";
                    int serie,pantalla,tiempo,capBat,durBat;
                    modelo = (JOptionPane.showInputDialog("Ingrese el modelo"));
                    serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie"));
                    disco = (JOptionPane.showInputDialog("Ingrese capacidad de disco duro"));
                    pantalla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano de la pantalla"));
                    procesador = (JOptionPane.showInputDialog("Ingrese el tipo de procesador"));
                    tipoGraf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de grafica 1.Normal 2.Gamer"));
                    opcionSis = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sistema operativo 1.Windows 2.ChromeOS"));
                    tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo que tardo en fabricarse"));
                    capBat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de la bateria"));
                    durBat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la bateria"));
                    
                    if(opcionSis==1)
                        sistema = "Windows";
                    else
                        if(opcionSis == 2)
                            sistema = "ChromeOS";
                    
                    if(tipoGraf==1)
                        grafica = "Normal";
                    else
                        if(tipoGraf == 2)
                            grafica = "Gamer";
                    
                    lista.add(new Lista(modelo,serie,disco,pantalla,procesador,grafica,sistema,tiempo,capBat,durBat));
                    break;
                    
                case 2:
                    if(lista.isEmpty())
                    {
                        String salida="";
                        JOptionPane.showMessageDialog(null, salida); 
                    }
                    else
                    {
                        String salida="";
                        for (Object t : lista) 
                        {
                            if (t instanceof Lista) 
                            {
                                salida+=lista.indexOf(t)+"- "+t+"\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida); 
                    }
                    break;
                    
                case 3:
                    int p;
                    p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie de la computadora a eliminar"));
                     if (lista.get(p)  instanceof Lista) 
                     {                   
                        lista.remove(p);
                    
                     } else 
                     {
                        JOptionPane.showMessageDialog(null, "El numero de serie no existe");
                     }
                    break;
                     
                case 4:
                    int i = 0;
                    int opc = 0;
                    opc=Integer.parseInt(
                    JOptionPane.showInputDialog("1- Modelo\n"
                            + "2- Capacidad del disco duro\n"
                            + "3- Tipo de procesador\n"
                            + "4- Tipo de grafica\n"
                            + "5- Sistema operativo\n"
                            + "6- Tiempo de fabricacion"
                            + "7- Capacidad de bateria\n"
                            + "8- Duracion de bateria\n")
                    );
                    p=Integer.parseInt(JOptionPane.showInputDialog("posicion a modificar"));
                    if ( lista.get(p)  instanceof Lista ) 
                    {
                        String m;
                        m=(JOptionPane.showInputDialog("Ingrese el modelo"));
                        (  (Lista)lista.get(i)  ).setModelo(m);
                    
                        (  (Lista)lista.get(i)  ).getKit().set(0, "");
                    
                    
                    } else {
                        JOptionPane.showMessageDialog(null, "la posicion seleccionada no es una pizarra");
                    }
                    break;

            }

        }while (opcion >= 1 && opcion <= 6);
    }
    
}
