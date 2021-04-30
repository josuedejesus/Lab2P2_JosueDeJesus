/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_josuedejesus;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author josue
 */
public class Lista 
{
        //att
    private int largo;
    private int ancho;
    private String modelo;
    private int serie;
    private String disco;
    private int pantalla;
    private String procesador;
    private String grafica;
    private String sistema;
    private int tiempo;
    private int capBat;
    private int durBat;
    private ArrayList<String> kit=new ArrayList();
    
    //cons
    public Lista(){        
    }
    
    public Lista(String m, int s, String d, int p, String pr, String g, String sis, int t, int cB, int dB){
        setModelo(m);  
        setSerie(s);        
        setDisco(d);
        setPantalla(p);
        setProcesador(pr);
        setGrafica(g);
        setSistema(sis);
        setTiempo(t);
        setCapBat(cB);
        setDurBat(dB);
    }
    
    //mut
 
    public void setModelo(String m){
        modelo=m;
    }
    
    public String GetModelo(){
        return modelo;
    }
    
    public void setSerie(int s){
        serie=s;
    }
    
    public int GetSerie(){
        return serie;
    }
    
    public void setDisco(String d)
    {
        disco = d;
    }
    
    public String getDisco()
    {
        return disco;
    }
    
    public void setPantalla(int p)
    {
        pantalla = p;
    }
    
    public int getPantalla()
    {
        return pantalla;
    }
    
    public void setProcesador(String pr)
    {
        procesador = pr;
    }
    
    public String getProcesador()
    {
        return procesador;
    }
    
    public void setGrafica(String g)
    {
        grafica = g;
    }
    
    public String getGrafica()
    {
        return procesador;
    }
    
    public void setKit(ArrayList<String>  k){
        kit=k;
    }
    
    public void setKit(String e){
        kit.add(e);
    }
    
    public ArrayList<String> getKit(){
        return kit;
    }
    
    public String getKit(int p){
        return kit.get(p);
    }
    
    public void setSistema(String sis)
    {
        sistema = sis;
    }
    
    public String getSistema()
    {
        return sistema;
    }
    
    public void setTiempo(int t)
    {
        tiempo = t;
    }
    
    public int getTiempo()
    {
        return tiempo;
    }
    
    public void setCapBat(int cB)
    {
        capBat = cB;
    }
    
    public int setCapBat()
    {
        return capBat;
    }
    
    public void setDurBat(int dB)
    {
        durBat = dB;
    }
    
    public int setDurBat()
    {
        return durBat;
    }
        
    
    //ma
    //representacion en cadena del nuevo tipo
    @Override
    public String toString(){
        return " |Modelo: "+modelo+" |Numero de serie: "+serie+" |Capacidad de disco duro: "+disco+" |Tamano de pantalla: "+pantalla+" |Tipo de procesador: "+procesador+" |Tipo de grafica: "+grafica+" |Sistema operativo: "+sistema+
                " |Tiempo de fabricacion: "+tiempo+" |Capacidad de bateria: "+capBat+" |Duracion de bateria: "+durBat;
    }
    
}
