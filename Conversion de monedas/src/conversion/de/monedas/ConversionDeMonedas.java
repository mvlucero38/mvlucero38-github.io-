/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion.de.monedas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Maira
 */
public class ConversionDeMonedas {

    // Exchange rate for selected currencies, equal 1 USD//
    public static final double SALVADOREAN_COLONES = 8.75;
    public static final double PHILLIPINE_PISO = 51.95;
    public static final double ARGENTINE_PESO = 43.62;
    public static final double AUSTRALIAN_DOLAR = 1.45;
    public static final double EUROPEAN_EURO = 0.89;
    public static final double YEMENI_RIAL = 250.30;
    public static final double VIETNAMESE_DONG = 23390.45;
    public static final double UNITED_ARAB_EMIRATES_DIHRAM = 3.67;
    public static final double LITTLE_NIGGLET_TEARS = 31.14;
    public static final double CACAO_SEEDS = 42;
    public static final double AMERICAN_DOLAR = 1;

    //  Lenguage Menu//
    static final String SELECT_LENGUAGE = "Please choose language - Elige idioma \n"
            + "(1) English   (2)Espanol ";

    // Input amount to be converted//
    static final String CURRENCY_AMOUNT_TO_CONVERT_SPANISH = "Introduce la cantidad a convertir ";
    static final String CURRENCY_AMOUNT_TO_CONVERT_ENGLISH = "Input the amount to be converted ";

    // From USD to other currency and visceversa//
    static final String SELECT_MENU_ENG = "Hello, please choose an option:\n "
            + "Select (1) to convert from USD to other Currency\n"
            + "Select (2) to convert from  other currency to USD\n";
    static final String SELECT_MENU_ESP = "Quieres convertir USD to otras monedas o visceversa?\n"
            + "Elige (1)para convertir USD a otras monedas\n"
            + "Elige  (2) para convertir de otras monedas a USD\n";

// Currency convertion menus//
    static final String CURRENCY_LIST_ENGLISH_FROM_USD
            = "Please pick a currency to convert to \n"
            + "(10)USD to Salvadorean Colones \n"
            + "(11)USD to Phillipine Piso \n"
            + "(12)USD to Argentine Peso \n"
            + "(13)USD to Australian Dollar \n"
            + "(14)USD to European Euro \n"
            + "(15)USD to Yemeni Rial \n"
            + "(16)USD to Vietnamese Dong \n"
            + "(17)USD to United Arab Emirates Dihram \n"
            + "(18)USD to Black Kid Tears \n"
            + "(19)USD to Mesoamerican Cacao Bean\n ";

    static final String CURRENCY_LIST_ENGLISH_TO_USD
            = "Please pick a currency to convert to \n"
            + "(20)Salvadorean Colones to USD\n"
            + "(21)Phillipine Piso to USD\n"
            + "(22)Argentine Peso to USD\n"
            + "(23)Australian Dollar to USD\n"
            + "(24)European Euro to USD\n"
            + "(25)Yemeni Rial to USD\n"
            + "(26)Vietnamese Dong to USD\n"
            + "(27)United Arab Emirates Dihram to USD\n"
            + "(28)Black Kid Tears to USD\n"
            + "(29)Mesoamerican Cacao Bean  to USD\n";

    static final String CURRENCY_LIST_SPANISH_FROM_USD
            = "Selecciona a que moneda deseas convertir \n "
            + "(30)USD a Colones Salvadorenos \n"
            + "(31)USD a Piso Filipino \n"
            + "(32)USD a Peso Argentino \n"
            + "(33)USD a Dolar Australiano \n"
            + "(34)USD a Euro \n"
            + "(35)USD a Rial Yemeni \n"
            + "(36)USD a Dong Vietnamita  \n"
            + "(37)USD a EAU Dihram \n"
            + "(38)USD a Lagrimas de Negrito \n"
            + "(39)USD a Semilla de Cacao Mesoamericana\n ";

    static final String CURRENCY_LIST_SPANISH_TO_USD
            = "Selecciona a que moneda deseas convertir \n "
            + "(40)Colones Salvadorenos a USD \n"
            + "(41)Piso Filipino a USD\n"
            + "(42)Peso Argentino a USD\n"
            + "(43)Dolar Australiano a USD\n"
            + "(44)Euro a USD\n"
            + "(45)Rial Yemeni a USD\n"
            + "(46)Dong Vietnamita a USD\n"
            + "(47)EAU Dihram a USD\n"
            + "(48)Lagrimas de Negrito USD\n"
            + "(49)Semilla de Cacao Mesoamericana a USD\n";

    public static Scanner myScanner = new Scanner(System.in);

    static double result; // Output convertion//

    public static void main(String[] args) {

        int userLeng = 0;
        int convertionType = 0;
        double currencyAmount = 0;
        int chooseMenu;

// Welcome message//
        System.out.println("***Welcome to Le Calculator***\n"
                + "***Bienvenido a la Calculeitor***");

        System.out.print(SELECT_LENGUAGE);
        userLeng = myScanner.nextInt();

        if (userLeng == 1) {// if English
            System.out.println(SELECT_MENU_ENG);
            chooseMenu = myScanner.nextInt();

            if (chooseMenu == 1) {
                System.out.println(CURRENCY_LIST_ENGLISH_FROM_USD);
                convertionType = myScanner.nextInt();

            } else if (chooseMenu == 2) { // if Spanish
                System.out.println(CURRENCY_LIST_ENGLISH_TO_USD);
                convertionType = myScanner.nextInt();
            }

            System.out.println(CURRENCY_AMOUNT_TO_CONVERT_ENGLISH);
            currencyAmount = myScanner.nextDouble();

            engCalculationsFromUSD(convertionType, currencyAmount, result);
            engCalculationsToUSD(convertionType, currencyAmount, result);

        } else {

            System.out.println(SELECT_MENU_ESP);
            chooseMenu = myScanner.nextInt();

            if (chooseMenu == 1) { // if English
                System.out.println(CURRENCY_LIST_SPANISH_FROM_USD);
                convertionType = myScanner.nextInt();

            } else if (chooseMenu == 2) {// If Spanish
                System.out.println(CURRENCY_LIST_SPANISH_TO_USD);
                convertionType = myScanner.nextInt();
            }

            System.out.println(CURRENCY_AMOUNT_TO_CONVERT_SPANISH);
            currencyAmount = myScanner.nextDouble();

            espCalculationsFromUSD(convertionType, currencyAmount, result);
            espCalculationsToUSD(convertionType, currencyAmount, result);

        }
    }

    public static int engCalculationsToUSD(int convertionType, double currencyAmount, double result) {
        switch (convertionType) {

            case 20: {
                result = currencyAmount / SALVADOREAN_COLONES;
                System.out.println("your " + currencyAmount + " Salvadorean Colones " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 21: {
                result = currencyAmount / PHILLIPINE_PISO;
                System.out.println("your " + currencyAmount + " Phillipine Pisos " + new DecimalFormat("#.00").format(result) + " USD");
                break;
            }

            case 22: {
                result = currencyAmount / ARGENTINE_PESO;
                System.out.println("your " + currencyAmount + " Argentine Pesos are equal to " + new DecimalFormat("#.00").format(result) + " USD");
                break;
            }

            case 23: {
                result = currencyAmount / AUSTRALIAN_DOLAR;
                System.out.println("your " + currencyAmount + " Australian Dollars are equal to " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 24: {
                result = currencyAmount / EUROPEAN_EURO;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 25: {
                result = currencyAmount / YEMENI_RIAL;
                System.out.println("your " + currencyAmount + " Yemeni Rials are equal to " + new DecimalFormat("#.00").format(result) + "USD");
                break;
            }

            case 26: {
                result = currencyAmount / VIETNAMESE_DONG;
                System.out.println("your " + currencyAmount + " Vietnamese Dong are equal to " + new DecimalFormat("#.00").format(result) + "USD");
                break;
            }

            case 27: {
                result = currencyAmount / UNITED_ARAB_EMIRATES_DIHRAM;
                System.out.println("your " + currencyAmount + " UAE Dihram are equal to " + new DecimalFormat("#.00").format(result) + " USD");
                break;
            }

            case 28: {
                result = currencyAmount / LITTLE_NIGGLET_TEARS;
                System.out.println("your " + currencyAmount + " Black Kid Tears are equal to " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 29: {
                result = currencyAmount / CACAO_SEEDS;
                System.out.println("your " + currencyAmount + " Cacao Beans are equal to " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }
        }
        return (int) result;
    }

    public static int engCalculationsFromUSD(int convertionType, double currencyAmount, double result) {

        switch (convertionType) {

            case 10: {
                result = SALVADOREAN_COLONES * currencyAmount;
                System.out.println(currencyAmount + " USD = " + new DecimalFormat("#.00").format(result) + " Salvadorean Colones ");
                break;
            }

            case 11: {
                result = ARGENTINE_PESO * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " Argentinian Pesos ");
                break;
            }

            case 12: {
                result = AUSTRALIAN_DOLAR * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " Australian Dollars ");
                break;
            }

            case 13: {
                result = EUROPEAN_EURO * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " Euros ");
                break;
            }

            case 14: {
                result = YEMENI_RIAL * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " Yemenesee Rials");
                break;
            }

            case 15: {
                result = VIETNAMESE_DONG * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " Vietnamese Dong");
                break;
            }

            case 16: {
                result = UNITED_ARAB_EMIRATES_DIHRAM * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " UAE Dihrams ");
                break;
            }

            case 17: {
                result = PHILLIPINE_PISO * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + "Phillipine Piso");
                break;
            }

            case 18: {
                result = LITTLE_NIGGLET_TEARS * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " Black Kid Tears ");
                break;
            }

            case 19: {
                result = CACAO_SEEDS * currencyAmount;
                System.out.println("your " + currencyAmount + " USD are equal to " + new DecimalFormat("#.00").format(result) + " Cacao Beans");
                break;
            }
        }
        return (int) result;
    }

    public static int espCalculationsToUSD(int convertionType, double currencyAmount, double result) {
        switch (convertionType) {

            case 40: {
                result = currencyAmount / SALVADOREAN_COLONES;
                System.out.println("Tus " + currencyAmount + " Colones Salvadorenos equivalen a " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 41: {
                result = currencyAmount / PHILLIPINE_PISO;
                System.out.println("Tus " + currencyAmount + " Pisos Filipinos equivalen a " + new DecimalFormat("#.00").format(result) + " USD");
                break;
            }

            case 42: {
                result = currencyAmount / ARGENTINE_PESO;
                System.out.println("Tus " + currencyAmount + " Pesos Argentinos equivalen a " + new DecimalFormat("#.00").format(result) + " USD");
                break;
            }

            case 43: {
                result = currencyAmount / AUSTRALIAN_DOLAR;
                System.out.println("Tus " + currencyAmount + " Dolares Australeanos equivalen a " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 44: {
                result = currencyAmount / EUROPEAN_EURO;
                System.out.println("Tus " + currencyAmount + " Euros equivalen a " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 45: {
                result = currencyAmount / YEMENI_RIAL;
                System.out.println("Tus " + currencyAmount + " Riales Yemenis equivalen a " + new DecimalFormat("#.00").format(result) + "USD");
                break;
            }

            case 46: {
                result = currencyAmount / VIETNAMESE_DONG;
                System.out.println("Tus " + currencyAmount + " Dong vietnamitas equivalen a " + new DecimalFormat("#.00").format(result) + "USD");
                break;

            }
            case 47: {
                result = currencyAmount / UNITED_ARAB_EMIRATES_DIHRAM;
                System.out.println("Tus " + currencyAmount + " Dihram emiratís " + new DecimalFormat("#.00").format(result) + " USD");
                break;
            }

            case 48: {
                result = currencyAmount / LITTLE_NIGGLET_TEARS;
                System.out.println("Tus " + currencyAmount + " Lagrimas de negritos equivalen a " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }

            case 49: {
                result = currencyAmount / CACAO_SEEDS;
                System.out.println("Tus " + currencyAmount + " Semillas de Cacao equivalen a " + new DecimalFormat("#.00").format(result) + " USD ");
                break;
            }
        }
        return (int) result;
    }

    public static int espCalculationsFromUSD(int convertionType, double currencyAmount, double result) {

        switch (convertionType) {

            case 30: {
                result = SALVADOREAN_COLONES * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Dolares Salvadorenos ");
                break;
            }

            case 31: {
                result = ARGENTINE_PESO * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Pesos Argentinos");

                break;
            }

            case 32: {
                result = AUSTRALIAN_DOLAR * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Dolares Australianos ");
                break;
            }

            case 33: {
                result = EUROPEAN_EURO * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Euros ");
                break;
            }

            case 34: {
                result = YEMENI_RIAL * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a  " + new DecimalFormat("#.00").format(result) + " Riales Yemenitas");
                break;
            }

            case 35: {
                result = VIETNAMESE_DONG * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Dongs vietnamitas");
                break;
            }

            case 36: {
                result = UNITED_ARAB_EMIRATES_DIHRAM * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Dihrams emiratís ");
                break;
            }

            case 37: {
                result = PHILLIPINE_PISO * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + "Pisos Filipinos");
                break;
            }

            case 38: {
                result = LITTLE_NIGGLET_TEARS * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Lagrimas de Negritos ");
                break;
            }

            case 39: {
                result = CACAO_SEEDS * currencyAmount;
                System.out.println("Tus " + currencyAmount + " Dolares Americanos equivalen a " + new DecimalFormat("#.00").format(result) + " Semillas de Cacao");
                break;
            }
        }
        return (int) result;
    }
}
