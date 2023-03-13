import java.util.Scanner;
public class Temperatura {

        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            int temp ;
            System.out.println("Introduceti temperatura de afara: ");
            temp=scan.nextInt();
            scan.close();
            if(temp<=-1){
                System.out.println("Este foarte frig afara!");
            }else if(temp<=15){
                System.out.println("Sa te imbraci putin mai gros!");
            }else{
                System.out.println("Este cald! poti sa iesi linistit!");
            }
        }
    
    
}
