import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {
	static String moonlanding = "That’s,/,one,/,small,/,step,/,for,/,man,/,one,/,giant,/,leap,/,for,/,mankind";
	
	public static void main(String[] args) throws FileNotFoundException {
		String delims = ",/,";
		ArrayList<String> list = new ArrayList<>();
		String[] Token = moonlanding.split(delims);
				
				
				for (int i = 0; i < Token.length; i++){
				list.add(Token[i]);
				}
				for (int i = 0; i < list.size(); i++){
					System.out.println(list.get(i));
					}
			
			System.out.println("");
	 
	Scanner in = new Scanner(new File("Lab5data.txt"));
	ArrayList<Integer> intlist = new ArrayList<>();
	while(in.hasNext()){
		String delim = ",";
	String input = in.nextLine();
	String[] temp = input.split(delim);
	
	for(int i = 0; i < temp.length;i++){
		intlist.add(Integer.parseInt((temp[i])));
	
	}
	}
	System.out.println(intlist);
	}
}

