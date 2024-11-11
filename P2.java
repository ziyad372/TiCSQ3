package Final_assignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) throws IOException {
        File f = new File("popular_names_2021.txt");
        Scanner sc = new Scanner(f);
        String [] boys = new String[10];
        String [] girls = new String[10];


        int count = 0;
        while (sc.hasNext()){
            if (count == 0){
                count++;
                continue;
            }
            String [] line = sc.nextLine().split(" ");
            int a = 0;


            try{
               a = Integer.parseInt(line[0]);

                boys[a-1] = line[1];
                girls[a-1] = line[2];

            }
            catch (Exception e){
                System.out.print("");
                continue;
            }

        }

        System.out.println("Top 10 name of Girls are:");
        for (int i = 0; i < girls.length;i++){
            System.out.println((i+1)+" "+girls[i]);
        }

        System.out.println("---------------------------------\nTop 10 name of Boys are:");
        for (int i = 0; i < boys.length;i++){
            System.out.println((i+1)+" "+boys[i]);
        }

    }
}
