public class BootcampTema4 {
    public static void main(String[] args) {
        int numeroIf = 12;

        if (numeroIf > 0){System.out.println("el numero: "+ numeroIf + " es positivo");}

        else if (numeroIf < 0){System.out.println("el numero: "+ numeroIf +" es negativo");}

        else {System.out.println(" el resultado es 0");}
        /// parte 2
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("codicional while simple: "+numeroWhile);
            numeroWhile ++;}

        int numeroDo = 2;
        do {System.out.println("condicional Do: "+numeroDo);
            numeroDo++;}

        while (numeroDo < 3);
        //parte 3
        for(int i = 1;i <= 3; i ++){System.out.println("este es el bucle for: "+i);}
        //parte 4
        String Estacion = "VERANO";

        switch (Estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("no es una estación valida, rebice las mayúsculas o si pusó un numero por error");}
    }
}