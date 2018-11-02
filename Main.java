public class Main {

    public static double Work;

    public static void main(String[] args) {

        calcA(8,3,30);
        calcA(9,3,30);
        calcA(10,3,30);
        calcA(11,3,30);
        calcA(8,4,30);
        calcA(8,5,30);
        calcA(8,6,30);


        calcA(8,3,35);
        calcA(9,3,35);
        calcA(10,3,35);
        calcA(11,3,35);
        calcA(8,4,35);
        calcA(8,5,35);
        calcA(8,6,35);

        calcA(8,3,40);
        calcA(9,3,40);
        calcA(10,3,40);
        calcA(11,3,40);
        calcA(8,4,40);
        calcA(8,5,40);
        calcA(8,6,40);

        Work(100);
        Work(50);
        Work(20);
        Work(360);
        Work(80);
        Work(160);
        Work(500);
        Work(240);
        Work(40);
        Work(40);

    }

    public static void Work(double RWork) {
        Work = RWork;
    }

    public static void calcA(int engineers, int hours,int weeks) {
        double capacity = Work / (engineers*weeks*hours);
        System.out.printf(" %d engineers working at %d hrs/wk for %d weeks are at %d%% capacity.\n",engineers,hours,weeks,(int)(capacity*100));
    }
}