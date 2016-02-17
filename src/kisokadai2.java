import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kisokadai2{

	    public static void main(String[] args) throws IOException{
	    	   BufferedReader br = new
	   	            BufferedReader(new InputStreamReader(System.in));

	        //変数の宣言
	        String  str;
	        int myAns, cmpAns;        //自分の入力した答え、正解の答え
	        int cnt = 0;              //何回目で正解したかカウントする
	        boolean gamePlay = true;  //ゲームが続くか判定するフラグ

	        cmpAns = (int)(Math.random()*100 + 1);  //答えを乱数で作る

	        //正解するまで無限ループする
	        while(gamePlay){
	        	cnt++;
	            try{
	                System.out.print("1～100の間の整数を入力ね！：");
	                str = br.readLine();
	                myAns = Integer.parseInt(str);

	            }
	            catch(NumberFormatException nfe){
	                //正しい値が入力されなかったのでループの最初に戻る
	                continue;
	            }

	            if(myAns<1 || myAns>100){
	                //正しい値が入力されなかったのでループの最初に戻る
	                continue;
	            }
	            else if(myAns < cmpAns){
	                System.out.println("答えは入力した数値より大きいです！");
	            }
	            else if(myAns > cmpAns){
	                System.out.println("答えは入力した数値より小さいです！");
	            }
	            else if(myAns ==  cmpAns){

                /*
	                  正解したのでフラグをfalseにする
	                  breakをするのと一緒（ループから抜ける）
	                */
	                gamePlay = false;
	            }
	        }

	        System.out.println("御明察 " + cnt +"回目で正解！！");

	    }
	    }


