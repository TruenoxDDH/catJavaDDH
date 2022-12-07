package com.mycompany.catproject;




import java.io.IOException;
import javax.swing.JOptionPane;


public class CatProject {

    public static void main(String[] args)throws IOException {
        GatosService catService = new  GatosService();
        catService.getGatos();

        int opcionMenu = -1;
        String[]opciones={
                "1.Ver gato", "2.salir"
        };
        do{
            String opcion=(String)JOptionPane.showInputDialog(null, "Gatitos java", "Menú Principal", JOptionPane.INFORMATION_MESSAGE,
                    null, opciones,opciones[0]);
            for(int i = 0; i<opciones.length; i++){
                if(opcion.equals(opciones[i]))
                    opcionMenu=i;
            }

            GatosService service = new GatosService();

            switch(opcionMenu){
                case 0:{
                    System.out.println("Vas a ver un gato");
                    service.getGatos();
                }
                break;
                case 1:
                    System.out.println("Vas a salir del sisteme ");
            }
        }while(opcionMenu !=1);
    }
}
