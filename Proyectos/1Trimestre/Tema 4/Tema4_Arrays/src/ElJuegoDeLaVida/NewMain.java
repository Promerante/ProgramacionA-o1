package ElJuegoDeLaVida;

public class NewMain {
    public static void main(String[] args) {
    char char1 = 'z';
    char char2 = 'z';

    if (Character.compare(char1, char2) > 0) {
      System.out.println(char1 + " is greater");
    } else if (Character.compare(char1, char2) < 0) {
      System.out.println(char1 + " is less than " + char2);
    } else if (Character.compare(char1, char2) == 0) {
      System.out.println(char1 + " and " + char2 + " are equal");
    } else {
      System.out.println(char1 + " and " + char2 + " are invalid characters");
    }
  }
}
                
    


