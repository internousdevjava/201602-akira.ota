
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;




public class kisokadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);

		String file;
		String str = null;
		int num;

		Boolean flag = true ;
		while(flag){

		try {

			System.out.println("テキストファイルプログラムです以下の数字でアクションを選択できます");
			System.out.println("1．新規作成");
			System.out.println("2．上書き");
			System.out.println("3．追記");
			System.out.println("4．読み込み");
			System.out.println("5. 削除");
			System.out.println("100．終了");


			str = br.readLine();
			num = Integer.parseInt(str);
			if (num == 1) {
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File hakata = new File(file);
				if (hakata.createNewFile()) {
					System.out.println("ファイルの作成に成功しました");
				} else {
					System.out.println("ファイルの作成に失敗しました");
				}
				FileWriter fw = new FileWriter(hakata, false);

				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("文章を入力してください");
				String shinki = br2.readLine();
				fw.write(shinki);
				fw.flush();
				fw.close();
			}
			else if (num == 2) {
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File hakata = new File(file);

				if (!hakata.exists()) {
					System.out.println("ファイルが存在しません。新しくファイルを作成します");
				}
				System.out.println("以下に本文を入力してください");
				FileWriter fw = new FileWriter(hakata, false);
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String uwagaki = br2.readLine();

				fw.write(uwagaki);
				fw.flush();
				fw.close();

			}
			else if (num == 3) {
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File hakata = new File(file);

				if (!hakata.exists()) {
					System.out.println("ファイルが存在しません。新しくファイルを作成します");
				}
				System.out.println("以下に本文を入力してください");
				FileWriter fw = new FileWriter(hakata, true);
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String tuiki = br2.readLine();

				fw.write(tuiki);
				fw.flush();
				fw.close();

			}
			else if (num == 4) {
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File hakata = new File(file);

				if (!hakata.exists()) {
					System.out.println("ファイルが存在しません。");
				}else{
					FileReader filereader = new FileReader(file);
					int re;
					  while((re = filereader.read()) != -1){
					    System.out.print((char)re);
					  }
					  filereader.close();
				}


			}
			else if (num == 5) {
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File hakata = new File(file);
					if (!hakata.exists()) {
						System.out.println("ごめーん。今ファイルないっちゃん。");
					} else {
						if(hakata.delete()){
						System.out.println("削除に成功しました");
						}else{
							System.out.println("拡張子ないファイルは何故か消せないんです。申し訳ない");
						}
					}

			}
			else if (num == 100) {
				System.out.println("さようなら.....");
				System.exit(0);


			}

		} catch (Exception e) {
			System.out.println("なんてや？わからんばい！");

		}
		System.out.println(" ");
		System.out.println("全部の処理、完了したばい。お疲れっす");
		System.out.println("まだ続けると？じゃあ1 お疲れは、0ばい！");
		try{
		BufferedReader bbr = new BufferedReader(new InputStreamReader(System.in));
		int concon;
		String con = bbr.readLine();
		concon = Integer.parseInt(con);
		if(concon == 0){
			System.out.println("気ぃ付けて帰りんしゃい");
			break;
		}else if(concon == 1){
			System.out.println("まだ物足りんと？、よかよ");
		}
		}catch(Exception e){
			System.out.println("ちょっとなん言いようかわからんっちゃけど");
		}
		}
		System.exit(0);
	}


}