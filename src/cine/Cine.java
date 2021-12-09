package cine;

import javax.swing.JOptionPane;

public class Cine {

    public static void main(String[] args) {
        int e= 1;
        String[] name = new String[20];
        int[] cedula = new int[20];
        int[] precio = new int[20];
        String[] fecha = new String[20];
        int VIP = 7000;
        int Normal = 4000;
        int i = 0;
        boolean salir = true;
        while (salir == true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1-Comprar entrada" + "\n 2-Ver facturas guardadas " + "\n 3-Salir "));
            if (menu == 1) {
                String nombre = JOptionPane.showInputDialog("Digite nombre ");
                int id = Integer.parseInt(JOptionPane.showInputDialog("digite cedula"));
                String date = JOptionPane.showInputDialog("Digite fecha d/m/a ");
                fecha[i] = date;
                name[i] = nombre;
                cedula[i] = id;
                int entrada = Integer.parseInt(JOptionPane.showInputDialog("digite 1-VIP  2-Normal "));
                if (entrada == 1) {
                    int cantidad1 = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas entradas quiere "));
                    int precioS = VIP * cantidad1;
                    precio[i] = precioS;
                    float iva = precioS * 0.13f;
                    float precioF = precioS + iva;
                    System.out.println("------------Factura--------------");
                    System.out.println("Nombre:  " + name[i] + "\nCedula:  " + cedula[i] + "\nFecha:  " + fecha[i]
                            + "\nPrecio de Entradas" + precio[i] + "\nIva:  " + iva + "\nTotal:  " + precioF);
                    i++;
                    e++;
                }
                if (entrada == 2) {
                    int cantidad2 = Integer.parseInt(JOptionPane.showInputDialog("digite cuantas entradas quiere "));
                    int precioP = Normal * cantidad2;
                    precio[i] = precioP;
                    float iva2 = precioP * 0.13f;
                    float precioF2 = precioP + iva2;
                    System.out.println("------------Factura--------------");
                    System.out.println("nombre:   " + name[i] + "\nCedula:   " + cedula[i] + "\nFecha:   " + fecha[i]
                            + "\nPrecio de Entradas" + precio[i] + "\nIva:   " + iva2 + "\nTotal:   " + precioF2);
                    i++;
                    e++;
                }

            }
            if (menu == 2) {
                for (int a = 0; a < name.length; a++) {
               
                    if (name[a]==null){
                    break;
                    }else{
                         System.out.println("------------Facturas Guardadas--------------");
                    System.out.println("Nombre:  " + name[a] + "\nCedula:  " + cedula[a] + "\nFecha:  " + fecha[a]
                            + "\nPrecio de Entradas " + precio[a]);
                    
                    }
                }
            }
            if (menu == 3) {
                salir = false;
            }

        }
    }

}
