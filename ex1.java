class ex1{
  // public static void sum(int left, int right){
  //   System.out.println(left + right);
  // }

  // public static void main(String[] args){
  //   sum(10, 20);
  //   sum(20, 40);
  // }


  // public static void main(String[] args){
  //   char number[] = new char[A,2,3,4,5,6,7,8,9,10,J,Q,K];
 


  public static void main(String[] args){
    // String number[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    // // String shape[] = {"Spade","Diamond","Hearth","Clover"};

    // for (int i = 0; i < number.length; i++) {
    //         String shape1 = number[i];
    //         System.out.println(shape1 );
    //     }\

    Card card = new Card();



    String[][] Cards = new String[4][13];
    String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] model = {"♡","◇","♣","♠"};

    Cards[0][0] = Card.card("a","b");
    System.out.println(Cards[0][0]);

    for(int i=0; i<4 ; i++ ){
     
      for(int j=0; j<13; j++ ){

        
        // Cards[i][j] = Card.card(numbers[j],model[i]);
        // System.out.println(Cards[i][j]);
      }
    }
  }
}
public class Card{
  String number;
  String model;

  // void Card(){};

  // void setCard

  void Card(String number, String model){
    this.number = number;
    this.model = model;
  }


}