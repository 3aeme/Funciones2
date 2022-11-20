
import java.util.Scanner;

public class Funciones2 {

    static String marca[] = new String[5];
    static String placa[] = new String[5];
    static String ingreso[] = new String[5];
    static String nombre[] = new String[5];
    static int telefono[] = new int [5];
    static Scanner consola = new Scanner(System.in);
          
    static void mostrarMenu() {
        System.out.println("\n\nBienvenidos al Parking!\n1- Ver Lugares Disponibles\n2- Registrar Auto\n3- Ver marca del auto\n4-Ver placa\n5- Retirar auto\n6- Salir\n\nIngrese su opcion deseada: ");
    }

    static void registrarAuto() {

        System.out.println("Ingrese su lugar de estacionamiento del 1 al 5");
        int estacionar = consola.nextInt();
        switch (estacionar) {
            case 1:
                ingreso[0] = "Ocupado";
                System.out.println("\nIngrese su nombre: ");
                nombre[0] = consola.next();
                System.out.println("\nIngrese su telefono: ");
                telefono[0] = consola.nextInt();
                System.out.println("\nIngrese la marca de auto: ");
                marca[0] = consola.next();
                System.out.println("Ingrese la placa del auto:)");
                placa[0] = consola.next();
                ;               
                break;
            case 2:
                ingreso[1] = "Ocupado";
                System.out.println("\nIngrese su nombre: ");
                nombre[1] = consola.next();
                System.out.println("\nIngrese su telefono: ");
                telefono[1] = consola.nextInt();
                System.out.println("\nIngrese la marca de auto: ");
                marca[1] = consola.next();
                System.out.println("Ingrese la placa del auto)");
                placa[1] = consola.next();
                break;
            case 3:
                ingreso[2] = "Ocupado";
                System.out.println("\nIngrese su nombre: ");
                nombre[2] = consola.next();
                System.out.println("\nIngrese su telefono: ");
                telefono[2] = consola.nextInt();
                System.out.println("\nIngrese la marca de auto: ");
                marca[2] = consola.next();
                System.out.println("Ingrese la placa del auto)");
                placa[2] = consola.next();
                break;
            case 4:
                ingreso[3] = "Ocupado";
                System.out.println("\nIngrese su nombre: ");
                nombre[3] = consola.next();
                System.out.println("\nIngrese su telefono: ");
                telefono[3] = consola.nextInt();
                System.out.println("\nIngrese la marca de auto: ");
                marca[3] = consola.next();
                System.out.println("Ingrese la placa del auto)");
                placa[3] = consola.next();
                break;
            case 5:
                ingreso[4] = "Ocupado";
                System.out.println("\nIngrese su nombre: ");
                nombre[4] = consola.next();
                System.out.println("\nIngrese su telefono: ");
                telefono[4] = consola.nextInt();
                System.out.println("\nIngrese la marca de auto: ");
                marca[4] = consola.next();
                System.out.println("Ingrese la placa del auto)");
                placa[4] = consola.next();
                break;
            default:
                System.out.println("La capacidad maxima son 5 lugares");
        }

    }

    static void verMarca() {
        for (int i = 0; i < marca.length; i++) {
            System.out.println((i + 1) + " - " + marca[i]);
        }
    }

    static void verPlaca() {
        for (int i = 0; i < placa.length; i++) {
            System.out.println((i + 1) + " - " + placa[i]);
        }
    }

    static void verIngreso() {
        for (int i = 0; i < ingreso.length; i++) {
            System.out.println((i + 1) + " - " + ingreso[i]);
        }
        System.out.println("1-Si quiere consultar por su auto\n2-No estoy registrado");
        int esta= consola.nextInt();
        if (esta ==1){
            System.out.println("Ingrese su placa");
            String placare = consola.next();
            for (int i = 0; i < placa.length; i++) {
                if (placare.equals(placa[i])){
                System.out.println((i + 1) + " - El auto con Placa " + placa[i] +" Esta disponible en este lugar y pertenese a " + nombre[i]);
                    System.out.println("Si desea consultNo registradoancto en caso de un incidente precione 1");
                    int incidente = consola.nextInt();
                            if(incidente ==1){
                                System.out.println("El telefono de " + nombre [i] + " es- " + telefono[i]);
                            }
                }
                else{
                    System.out.println((i + 1) + " - Su auto no esta en este lugar");
                    }
            }
        }
    }

    static void retirarAuto() {

        System.out.println("Ingrese su lugar de estacionamiento del 1 al 5");
        int estacionar = consola.nextInt();
        switch (estacionar) {
            case 1:
                ingreso[0] = "Disponible";               
                marca[0] = "No registrado";         
                placa[0] = "No registrado";
                break;
            case 2:
                ingreso[1] = "Disponible";
                marca[1] ="No registrado";
                placa[1] ="No registrado";
                break;
            case 3:
                ingreso[2] = "Disponible";
                marca[2] ="No registrado";
                placa[2] ="No registrado";
                break;
            case 4:
                ingreso[3] = "Disponible";
                marca[3] ="No registrado";
                placa[3] ="No registrado";
                break;
            case 5:
                ingreso[4] = "Disponible";
                marca[4] ="No registrado";
                placa[4] ="No registrado";
                break;
            default:
                System.out.println("La capacidad maxima son 5 lugares");
        }

    }   
    
    public static void main(String[] args) {
        
        for (int i = 0; i < ingreso.length; i++) {
            ingreso[i]="Disponible";
        } 
       
    int op;
    do {
        mostrarMenu();
        op = consola.nextInt();
        System.out.println("**************************************************************");
        switch (op) {
            case 1:
                verIngreso();
                break;
                  
            case 2:
                registrarAuto();                  
                break;
            case 3:
                verMarca();                   
                break;
            case 4:
                verPlaca();
                break;
            case 5:
                retirarAuto();
                break;
            default:
                break;
            }
        } while (op != 6);
        System.out.println("Gracias por su preferencia!");
}
}
