import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        String Input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o seu nome: ");
        Input = sc.nextLine();
        System.out.println("Prazer caro " + Input);
    }
     public int _tas02(int num1, int num2){

        return num1 + num2;

    }
    public int _task02(int Idade, int AnoNascimento){
        return Idade * AnoNascimento;
    }
    public int _task03( int num1, int num2){
        return num1 - num2;
    }
    // ele vai retornar um console
    public double[] _task04( int num){
        System.out.println("");
        double a[] = {num*2, num*3, Math.sqrt(num)};
        return a;
    }
    public double _task06( double number1,double number2,double number3){
        return (number1+ number2+ number3)/3;
    }
    public double _task07( int raio){
        return (3.14* (raio*raio));
    }
    public double _task08(int altur, int base){
        return altur*base/2;
    }
    public double _task09( double salario){
        return salario*10/100;
    }
    public double _task10(double cm){
        return  cm* 10;
    }
    public double _task11(double value){
        return  (value*5/100) - value;
    }
    public int _task12(int km){
        return  km*12;
    }
    public String _task13(double number){
        if(number%2 == 0){
            return "Par";
        }else{
            return "IMpar";
        }
        
    }
    public int _task14(int year){
        return  year - 2024;
    }
    public double _task15(double value, int parcela){
        return  value/parcela;
    }
    public int _task16(int num1, int num2){
        if( num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public double _task17(double calor){
        return calor*1.8 + 25;
    }
    //  Dia, Hora, Minutos, Segundos
    public int _task18(int valuie[]){
        return  (valuie[0]*86400) + (valuie[1]*3600) + (valuie[2]*60) + valuie[3];
    }

    public int _task19( double valueReal){
        return (int) valueReal;
    }
    public String _task20(int numeber){
        if( numeber%3 == 0){
            return "È multiplo de 3"; 
        }
        if( numeber%5 == 0){
            return "È multiplo de 5"; 
        }else{
            return "Não é multilo por nehum outro numero";
        }

    }
}
