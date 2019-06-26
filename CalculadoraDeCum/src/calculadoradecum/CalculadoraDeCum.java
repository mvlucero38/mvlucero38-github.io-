/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradecum;

import java.util.Scanner;

/**
 *
 * @author Maira
 */
public class CalculadoraDeCum {

    public static Scanner myScanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int seleccionMenu = 0;

        // Contiene UV para cada materia evaluada
        int uvMateria1 = 0;
        int uvMateria2 = 0;
        int uvMateria3 = 0;
        int uvMateria4 = 0;
        int totalUnidadesValorativas = 0;

        System.out.println("A cuantos estudiates quieres evaluar hoy?");
        Scanner scannerNumeroEstudiantes = new Scanner(System.in);
        int numeroDeEstudiantes = scannerNumeroEstudiantes.nextInt();

        String[] nombresEstudiantes = new String[numeroDeEstudiantes];
        int notasMateria1[] = new int[numeroDeEstudiantes];
        int notasMateria2[] = new int[numeroDeEstudiantes];
        int notasMateria3[] = new int[numeroDeEstudiantes];
        int notasMateria4[] = new int[numeroDeEstudiantes];

        do {
            System.out.println("");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. Configurar UV por materia");
            System.out.println("2. Introducir el nombre y notas para cada uno de los " + numeroDeEstudiantes + " estudiantes");
            System.out.println("3. Mostrar notas, unidades valorativas y CUM de Ciclo");
            System.out.println("4. Salir del Programa");
            System.out.println("------------------------------------------------------------------");
            System.out.println("");

            Scanner scan = new Scanner(System.in);
            seleccionMenu = scan.nextInt();

            if (seleccionMenu == 2) {
                Scanner scannerNombres = new Scanner(System.in);
                Scanner scannerMateria1 = new Scanner(System.in);
                Scanner scannerMateria2 = new Scanner(System.in);
                Scanner scannerMateria3 = new Scanner(System.in);
                Scanner scannerMateria4 = new Scanner(System.in);

                System.out.println("Introduzca " + numeroDeEstudiantes + " nombres y notas para sus estudiantes:");
                System.out.println();

                for (int i = 0; i < numeroDeEstudiantes; i++) {
                    System.out.println("----------------------");
                    System.out.println("Nombre del estudiante:");
                    System.out.println("----------------------");
                    nombresEstudiantes[i] = scannerNombres.nextLine();

                    System.out.println("Nota Materia 1:");
                    notasMateria1[i] = scannerMateria1.nextInt();

                    System.out.println("Nota Materia 2:");
                    notasMateria2[i] = scannerMateria2.nextInt();

                    System.out.println("Nota Materia 3:");
                    notasMateria3[i] = scannerMateria3.nextInt();

                    System.out.println("Nota Materia 4:");
                    notasMateria4[i] = scannerMateria4.nextInt();

                    if (i == (nombresEstudiantes.length - 1)) {
                        System.out.println("Gracias!");
                        System.out.println();
                    }
                }
            }

            if (seleccionMenu == 3) {
                System.out.println("Estudiantes   Mat 1    Mat 2   Mat 3    Mat 4");
                System.out.println("----------------------------------------------------");

                for (int p = 0; p < nombresEstudiantes.length; p++) {

                    System.out.println(nombresEstudiantes[p] + "\t" + "\t" + notasMateria1[p] + "\t" + notasMateria2[p] + "\t" + notasMateria3[p] + "\t" + notasMateria4[p]);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Uni. Merito " + "\t"
                            + (notasMateria1[p] * uvMateria1) + "\t" + (notasMateria2[p] * uvMateria2) + "\t" + (notasMateria3[p] * uvMateria3) + "\t" + (notasMateria4[p] * uvMateria4) + "\n"
                            + "----------------------------------------------------\n"
                            + "CUM de Ciclo "
                            + "\t" + "\t" + "\t" + (((notasMateria1[p] * uvMateria1) + (notasMateria2[p] * uvMateria2) + (notasMateria3[p] * uvMateria3) + (notasMateria4[p] * uvMateria4))) / totalUnidadesValorativas);
                    System.out.println("----------------------------------------------------");
                    System.out.println(" ");
                }

            }

            if (seleccionMenu == 1) {
                Scanner scanCUM = new Scanner(System.in);

                for (int j = 0; j < 3; j++) {
                    System.out.println("Asigne UV por cada materia a evaluar");
                    System.out.println("------------------------------------");
                    System.out.println("Materia 1");
                    uvMateria1 = scanCUM.nextInt();
                    System.out.println("Materia 2");
                    uvMateria2 = scanCUM.nextInt();
                    System.out.println("Materia 3");
                    uvMateria3 = scanCUM.nextInt();
                    System.out.println("Materia 4");
                    uvMateria4 = scanCUM.nextInt();
                    totalUnidadesValorativas = uvMateria1 + uvMateria2 + uvMateria3 + uvMateria4;

                    System.out.println("Total Unidades valorativas para este ciclo: " + totalUnidadesValorativas);
                    break;
                }

            }
        } while (seleccionMenu != 4);

    }

}
