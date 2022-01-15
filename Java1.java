import java.io.File;import java.io.File;

class Main {
    public static void main(String[] args) {
      File file = new File("Java Example\\directory"); 
      boolean value = file.mkdir();
      if(value) {
        System.out.println("The new directory is created.");
      }
      else {
        System.out.println("The directory already exists.");
      }
   }
}