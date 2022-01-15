package CodeChef;
import java.util.Scanner;
public class score {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] dragon = new int[3];
            int[] Sloth = new int[3];
            for(int i=0; i<3; i++){
                dragon[i] = sc.nextInt();
            }
            for(int i=0; i<3; i++){
                Sloth[i] = sc.nextInt();
            }
            int sumDra = dragon[0]+dragon[1]+dragon[2];
            int sumSlo = Sloth[0]+Sloth[1]+Sloth[2];
            if(sumSlo>sumDra){
                System.out.println("Sloth");
            }
            else if(sumSlo<sumDra){
                System.out.println("dragon");
            }
            else{
                if(dragon[0] > Sloth[0]){
                    System.out.println("dragon");
                }
                else if(dragon[0] < Sloth[0]){
                    System.out.println("Sloth");
                }
                else{
                    if(dragon[1] > Sloth[1]){
                        System.out.println("dragon");
                    }
                    else if(dragon[1] < Sloth[1]){
                        System.out.println("Sloth");
                    }
                    else{
                        if(dragon[2] > Sloth[2]){
                            System.out.println("dragon");
                        }
                        else if(dragon[2] < Sloth[2]){
                            System.out.println("Sloth");
                        }
                        else{
                            System.out.println("Tie");
                        }
                    }
                }
            }
        }


    }
}
