import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введи только русские маленькие буквы, не более 2х слов: ");
        String text = new Scanner(System.in).nextLine();
        int spaceCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((int)text.charAt(i) !=(int) 'а'&&
                    (int)text.charAt(i) !=(int) 'б'&&
                    (int)text.charAt(i) !=(int) 'в'&&
                    (int)text.charAt(i) !=(int) 'г'&&
                    (int)text.charAt(i) !=(int) 'д'&&
                    (int)text.charAt(i) !=(int) 'е'&&
                    (int)text.charAt(i) !=(int) 'ё'&&
                    (int)text.charAt(i) !=(int) 'ж'&&
                    (int)text.charAt(i) !=(int) 'з'&&
                    (int)text.charAt(i) !=(int) 'и'&&
                    (int)text.charAt(i) !=(int) 'й'&&
                    (int)text.charAt(i) !=(int) 'к'&&
                    (int)text.charAt(i) !=(int) 'л'&&
                    (int)text.charAt(i) !=(int) 'м'&&
                    (int)text.charAt(i) !=(int) 'н'&&
                    (int)text.charAt(i) !=(int) 'о'&&
                    (int)text.charAt(i) !=(int) 'п'&&
                    (int)text.charAt(i) !=(int) 'р'&&
                    (int)text.charAt(i) !=(int) 'с'&&
                    (int)text.charAt(i) !=(int) 'т'&&
                    (int)text.charAt(i) !=(int) 'у'&&
                    (int)text.charAt(i) !=(int) 'ф'&&
                    (int)text.charAt(i) !=(int) 'х'&&
                    (int)text.charAt(i) !=(int) 'ц'&&
                    (int)text.charAt(i) !=(int) 'ч'&&
                    (int)text.charAt(i) !=(int) 'ш'&&
                    (int)text.charAt(i) !=(int) 'щ'&&
                    (int)text.charAt(i) !=(int) 'ы'&&
                    (int)text.charAt(i) !=(int) 'ъ'&&
                    (int)text.charAt(i) !=(int) 'ь'&&
                    (int)text.charAt(i) !=(int) 'э'&&
                    (int)text.charAt(i) !=(int) 'ю'&&
                    (int)text.charAt(i) !=(int) 'я'&&
                    (int)text.charAt(i) !=(int) ' '){
                System.out.println("Вы ввели недопустимый символ!");
                System.exit(1);
            }
            if ((int)text.charAt(i) ==(int) ' '){
                spaceCounter++;
            }
        }
        if (spaceCounter >1 ){
            System.out.println("Вы ввели более 2х слов");
            System.exit(2);
        }
        System.out.println(text.substring(text.indexOf(' ')+1));
    }

}