import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String[]products={"хлеб","гречневая крупа","молоко"};
        int[]prices={50,14,80};
        int[]prod=new int[products.length];
        int sumProduct=0;
        int currentPrice=0;
        int productNumber=0;
        int productCount=0;

        for(int i=0; i<products.length; i++){
            System.out.println(i+1+". "+products[i]+"-"+prices[i]+"руб");
        }
        while (true){
            System.out.println("введите номер продукты и его кол-во");
            String input=scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String[]parts=input.split(" ");
            productNumber=Integer.parseInt(parts[0])-1;
            productCount=Integer.parseInt(parts[1]);

            prod[productNumber]=productCount;
            currentPrice=prices[productNumber];
            sumProduct=sumProduct+prod[productNumber]*currentPrice;
        }
        for (int i=0;i<products.length;i++){
            if(prod[i]>0);
            System.out.println("товар:"+products[i]+"цена:"+prices[i]+"кол-во:"+prod[i]+"итог:"+prices[i]*prod[i]);
        }
        System.out.println("итог:"+sumProduct+"руб");
    }
}
