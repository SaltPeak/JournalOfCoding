package saltpeak.selfstudy.casedemo.poker;

/**
 * @author BigHit from SaltPeak
 * @category The "saltpeak.selfstudy.casedemo.poker" Package of "Journal Of Coding" Project
 * @github SaltPeak
 * @domain Realize the Analysis of Code Point for Playing Card & Display of Card Information.
 * @created 2020/4/13 21:38
 */
public class Card {
    private byte suit, rank;
    public static final byte MODE = 4, MIN_CODE = 0,MAX_CODE = 53, ERROR_CODE = -1;//
    public static final char[] SUITS = {'♠','♥','♣','♦'};//扑克牌花色列表：桃(Spade)、心(Heart)、梅(Club)、方(Diamond)
    public static final String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K","G"};//扑克牌面值序列

    public Card(byte code) {
        if((code>=MIN_CODE)&&(code<=MAX_CODE)){
            suit =(byte)(code%MODE);//byte与byte求余结果是int?
            rank = (byte)(code/MODE);
        }
        else{
            suit = ERROR_CODE;
            rank = ERROR_CODE;
        }
    }

    public byte getSuit() {
        return suit;
    }

    public byte getRank() {
        return rank;
    }

    public String cardInfo(){
        return SUITS[suit]+RANKS[rank];
        //return SUITS[suit]+“-”+RANKS[rank];//为什么报错？
    }
}
