package tl;

import bl.Tablero;
import dl.Logica;

public class ControladorGeneral {
    private Logica logica;
    private static ControladorGeneral singletonGeneral=null;

    public static ControladorGeneral getControladorGeneral(){
        if (singletonGeneral==null)
            singletonGeneral=new ControladorGeneral();
        return singletonGeneral;
    }

    private ControladorGeneral(){
        logica=Logica.getLogica();
    }

    public Tablero getTablero(String gameName){
        return Tablero.getTablero(gameName);
    }
}
