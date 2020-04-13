package saltpeak.selfstudy.casedemo.poker;

/**
 * @author BigHit from SaltPeak
 * @category The "saltpeak.selfstudy.casedemo.poker" Package of "Journal Of Coding" Project
 * @github SaltPeak
 * @domain
 * @created 2020/4/13 21:42
 */
public class Poker {
    private byte[] pile = new byte[54*4];//如何实现数组长度的动态调整？
    private int decks;

    public Poker(int decks) {
        for(this.decks = 1; this.decks<=decks;this.decks++){
            int count = 0;
            for(byte code = Card.MIN_CODE; code<= Card.MAX_CODE; code++){//局部变量code的生存期/作用域？
                pile[count] = code;
                count++;
            }
        }
    }

    public String getCardByIndex(int index){
        byte code = pile[index];
        return new Card(code).cardInfo();
    }

    /*public String PileSequence(){
        String seq = "";
        for(int index = 0;)
        return "";
    }
    */

    public int getDecks() {
        return decks;
    }
    //
    public static void main(String[] args){
        Poker cards = new Poker(1);
        System.out.println(cards.getCardByIndex(42));
    }
}