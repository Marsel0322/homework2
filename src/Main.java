public class Main {
    public static void main(String[] args) {
tempurature(33,32);
tempurature(20,28);
tempurature(45,25);
tempurature(31,22);
tempurature(40,20);

    }
    public static String tempurature (int age,int temperature){
String  home1="Можно идти гулять";
String home2="оставайтесь дома";
        if(20<age && age < 45 && -20<temperature && temperature<30) {
            return home1;
        } else if (age<20&& temperature >= 28) {
            return home1;
        } else if (age > 45 && temperature>=-10 && temperature <= 25 ) {
            return home1;
        } else
            return home2;
    }
    }
