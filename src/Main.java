public class Main {
    public static void main(String[] args) {
        /* Variables */
        int numeroIf = 0;
        int numeroWhile = 0;
        String estacion = "Atocha";

        /* IF */
        if (numeroIf == 0){
            System.out.println("numeroIf es 0");
        }
        else if(numeroIf <0){
            System.out.println("numeroIf es negativo");
        }
        else {
            System.out.println("numeroIf es positivo");
        }

        /* While */
        while (numeroWhile < 3){
          numeroWhile ++;
          System.out.println("numeroWhile es " + numeroWhile);
        }

        /* Do while */
        do {
            numeroWhile ++;
            System.out.println("numeroWhile es " + numeroWhile);
        } while (numeroWhile < 3);

        /* For */
        for(int numeroFor = 0; numeroFor <= 3;numeroFor++){
            System.out.println("numeroFor es " + numeroFor);
        }

        /* Switch */
        switch(estacion){

            case "verano":{
                System.out.println("estación es verano");
                break;
            }
            case "invierno":{
                System.out.println("estación es invierno");
                break;
            }
            case "primavera":{
                System.out.println("estación es primavera");
                break;
            }
            case "otoño":{
                System.out.println("estación es otoño");
                break;
            }
            default:{
                System.out.println("no es una estación metereologica");
            }

        }

    }
}

