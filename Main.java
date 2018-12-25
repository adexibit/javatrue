public class Main {


    // 1 пункт - прописываем метод Main
    public static void main(String[] args) {

        // 2 пункт - создаём и инициализируем переменные
        byte b = -4;
        short c = 8;
        int d = 3;
        long perLong = 212748322648L;
        char perChar = 'O';
        float a = 1.12f;
        double z = 1.325235;
        boolean perBoolean = true;
        String perString = "Алексей";


        System.out.println(punkt3(a,b,c,d));
        System.out.println(punkt4(b,c));
        punkt5(z);
        System.out.println(punkt6(z));
        punkt7(perString);
        punkt8(8770);
   }

    // 3 пункт метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
     static double punkt3(float a, byte b,short c,int d ){

     double x;
     x = a * (b + ((double)c/(double)d));
     return x;
    }

    // 4 пункт метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20

     static boolean punkt4(byte b , short c ){
     return (((b+c)>10) && ((b+c)< 20));
}
    // 5 пункт
     static void punkt5(double z){
        if (z>= 0) System.out.println("Положительное");
        else System.out.println("Отрицательное");

    }
 // 6 пункт
     static boolean punkt6(double z){
        return z>=0;
    }

 // 7 пункт
    static void punkt7(String name){
     System.out.println("Привет "+name);
 }
 // пункт 8 экстрабонусный
 static void punkt8(int year){

        int x= year%4;
        int y= year%100;
        int z= year%400;

        if ((x==0 && y>0) || (z==0)) System.out.println("Год "+year+" является високосным");
        else System.out.println("Год "+year+" не является високосным");

 }


}
