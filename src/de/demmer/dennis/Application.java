package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		try {
			String input = br.readLine();
			System.out.println(input);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//-------------------------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.exit(0);
		
		
		
	}

}
