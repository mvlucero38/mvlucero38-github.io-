/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiondemonedas1;

import java.util.Scanner;


/**
 *
 * @author Maira
 */
public class ConversionDeMonedas1 {

    public static final double salvadoreanColones = 8.75; // Equals 1 USD
    public static final double phillipinePiso = 51.95; // Equals 1 USD
    public static final double argentinePeso = 43.62;// Equals 1 USD
    public static final double australianDollar = 1.45;// Equals 1 USD
    public static final double europeanEuro = 0.89;// Duh!
    public static final double yemeniRial = 250.30; // Equals 1 USD
    public static final double vietnameseDong = 23390.45; // Equals 1 USD
    public static final double unitedArabEmiratesDihram = 3.67; // Equals 1 USD
    public static final double thaiBat = 31.14; // Equals 1 USD
    public static final double cacaoSeed = 42; // Equals 1 USD
    public static final double americanDollar = 1;
    static final String SELECTLENGUAGE = "Please choose language (1) English (2)Espanol";
    static final String SELECTCURRENCYESP = "Selecciona a que moneda deseas convertir\n ";
    static final String SELECTCURRENCYENG = "Please pick a currency to convert to\n ";
    static final String CURRENCYAMOUNTESP = "Introduce la cantidad a convertir";
    static final String CURRENCYAMOUNTENG = "Input the amount to be converted";
    static final String ERRORESP = "Seleccion no es valida";
    static final String ERRORENG = "Invaid Choice";
    static final String CURRENCYLISTESP
            = "(1)Phillipine Piso to USD\n"
            + "(2)Argentine Peso to USD\n"
            + "(3)Australian Dollar to USD\n"
            + "(4)European Euro to USD\n"
            + "(5)Yemeni Rial to USD\n"
            + "(6)Vietnamese Dong to USD\n"
            + "(7)United Arab Emirates Dihram to USD\n"
            + "(8)Thai Bat to USD\n"
            + "(9)Mesoamerican Cacao Bean  to USD\n"
            + "(10)USD to Phillipine Piso \n"
            + "(11)USD to Prgentine Peso \n"
            + "(12)USD to Australian Dollar \n"
            + "(13)USD to European Euro \n"
            + "(14)USD to Yemeni Rial \n"
            + "(15)USD to Vietnamese Dong \n"
            + "(16)USD to United Arab Emirates Dihram \n"
            + "(17)USD to Thai Bat \n"
            + "(18)USD to Mesoamerican Cacao Bean\n ";

    static final String CURRENCYLISTENG
            = "(1)Phillipine Piso aUSD\n"
            + "(2)Argentine Peso a USD\n"
            + "(3)Australian Dollar a USD\n"
            + "(4)European Euro a USD\n"
            + "(5)Yemeni Rial a USD\n"
            + "(6)Vietnamese Dong a USD\n"
            + "(7)United Arab Emirates Dihram a USD\n"
            + "(8)Thai Bat a USD\n"
            + "(9)Mesoamerican Cacao Bean  a USD\n"
            + "(10)USD a Phillipine Piso \n"
            + "(11)USD a Prgentine Peso \n"
            + "(12)USD a Australian Dollar \n"
            + "(13)USD a European Euro \n"
            + "(14)USD a Yemeni Rial \n"
            + "(15)USD a Vietnamese Dong \n"
            + "(16)USD a United Arab Emirates Dihram \n"
            + "(17)USD a Thai Bat \n"
            + "(18)USD a Semilla de Cacao Mesoamericana\n ";

    public static void main(String[] args) {
        int userLeng = 0;
        int convertionType = 0;
        int currencyAmount = 0;
        int total = 0;

        Scanner myScanner = new Scanner(System.in); 
        System.out.println(SELECTLENGUAGE);
        userLeng = myScanner.nextInt();
        while (true) {
            if (userLeng == 1) {
                System.out.print(SELECTCURRENCYENG + CURRENCYLISTENG);
                break;
            } else {
                if (userLeng == 2) {
                    System.out.print(SELECTCURRENCYESP + CURRENCYLISTESP);
                    break;
                }
            }

        }
        convertionType = myScanner.nextInt();
        while (true) {
            if (userLeng == 1) {
                System.out.println(CURRENCYAMOUNTENG);
                break;
            } else {
                if (userLeng == 2) {
                    System.out.println(CURRENCYAMOUNTESP);
                    break;
                }
            }

        }
        currencyAmount = myScanner.nextInt();
        calculationsCurrency(result);
        System.out.println("your result is" + total);

    }

    public static int calculationsCurrency(int currencyAmount, int userLeng, int conversionType) {
        int result= 0;
        switch (conversionType) {
            case 1: {
                double result = salvadoreanColones * currencyAmount;
                System.out.println(result);
            }
            break;

            case 2: {
                double result = argentinePeso * currencyAmount;
                System.out.println(result);
            }
            break;
            case 3: {
                double result = australianDollar * currencyAmount;
                System.out.println(result);
            }
            break;
            case 4: {
                double result = europeanEuro * currencyAmount;
                System.out.println(result);
            }
            break;

            case 5: {
                double result = yemeniRial * currencyAmount;
                System.out.println(result);
            }
            break;

            case 6: {
                double result = vietnameseDong * currencyAmount;
                System.out.println(result);
            }
            break;
            case 7: {
                double result = unitedArabEmiratesDihram * currencyAmount;
                System.out.println(result);
            }
            break;

            case 8: {
                double result = phillipinePiso * currencyAmount;
                System.out.println(result);
            }
            break;

            case 9: {
                double result = thaiBat * currencyAmount;
                System.out.println(result);

            }
            break;

            case 10: {
                double result = cacaoSeed * currencyAmount;
                System.out.println(result);
            }
            break;

            case 11: {
                double result = currencyAmount / salvadoreanColones;
                System.out.println(result);
            }
            break;
            case 12: {
                double result = currencyAmount / phillipinePiso;
                System.out.println(result);

            }
            break;
            case 13: {
                double result = currencyAmount / argentinePeso;
                System.out.println(result);

            }
            break;
            case 14: {
                double result = currencyAmount / australianDollar;
                System.out.println(result);

            }
            break;
            case 15: {
                double result = currencyAmount / europeanEuro; 
                System.out.println(result);
            }
            break;
            case 16: {
                double result = currencyAmount / yemeniRial;
                System.out.println(result);

            }
            break;
            case 17: {
                double result = currencyAmount / vietnameseDong;
                System.out.println(result);

            }
            break;
            case 18: {
                double result = currencyAmount / unitedArabEmiratesDihram;
                System.out.println(result);
            }
            break;

            case 19: {
                double result = currencyAmount / thaiBat;
                System.out.println(result);
            }
            break;
            case 20: {
                double result = currencyAmount / cacaoSeed;
                System.out.println(result);
            }
            break;

            default: {
                if (userLeng == 1) {
                    System.out.println(ERRORENG);
                } else {
                    if (userLeng == 2) {
                        System.out.println(ERRORESP);
                    }
                    
                }
             
            }
            
        }
    
    
