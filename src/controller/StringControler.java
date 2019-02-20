package controller;

public class StringControler {

    String content = "Example content: Lorem ipsum Lorem ipsum";


    public boolean isCharacter (char c) {
        int search = content.indexOf(c);
        return search != -1 ? true : false;

    }
   public int countAllCharakters(char c){
        String text = content.toUpperCase();
        int counter = 0;
        for(int i = 1; i < content.length(); i++){
            if(text.charAt(i)== c){
                counter++;
            }
        }
return counter;
   }
  public String reveres(){

        String tmp = "";
        for (int i= content.length()-1; i >= 0; i--){
            tmp += content.charAt(i);

        }
        return tmp;
  }
}
