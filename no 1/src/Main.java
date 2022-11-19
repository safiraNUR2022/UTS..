public class Main {
    public static void main(String[] args) {

                int [] bil = {2, 4, 10, 11, 13, 314, 16, 19, 200, 45, 23, 89, 111, 300, 350};
                System.out.print("Bilangan Genap  :  ");
                for (int i = 0; i < bil.length; i++){
                    if (bil [i] % 2 == 0) {
                        System.out.print(bil[i] + " ");
                    }
                }
                System.out.println("");
                System.out.print("Bilangan Ganjil :  ");
                for (int i = 0; i < bil.length; i++){
                    if (bil [i] % 2!= 0){
                        System.out.print(bil[i] + " ");
                    }
                }
                System.out.println("");
            }
        }