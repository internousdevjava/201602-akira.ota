import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class kisokadai1 {
	public static void main(String args[]) throws IOException {
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0;

		String str = br.readLine();



		a = Integer.parseInt(str);
		str = br.readLine();
		b = Integer.parseInt(str);
		System.out.println(a + ":" + b);

		for (int i = 1; i <= a; i++) {

			System.out.println("\n");
			for (int j = 1; j <= b; j++) {
				System.out.print((i * j) + " ");}
			}
		}catch(Exception e){
			System.out.println("error");
			}

		}
	}