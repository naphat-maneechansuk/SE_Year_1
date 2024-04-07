import java.util.Scanner;

public class pisutt {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String[][] Data = {{" ","_"," "},{"|","_","|"},{"|","_","|"}};
                String Str = input.nextLine();
                String[] cherker = Str.split(" ");
                int index = 0;
                for (int x = 0; x < 3; x++) {
                    for(int y = 0 ; y < 3 ; y++){
                        if((x == 0 && y == 0)||(x == 0 && y == 2)){
                            System.out.print(" ");
                        }else {
                            if(cherker[index++].equals("1")){
                                System.out.print(Data[x][y]);
                            }else {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();
                }
    }
}
