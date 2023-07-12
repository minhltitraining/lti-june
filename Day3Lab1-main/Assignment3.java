package assignment;
public class JaggedArray {
	static String[][] data = {{"Tony", "JAVA", "C","C++"},
					{"Thomas", "JAVA", "UNIX",""},
					{"Dinil", "Linux", "Oracle",""},
					{"Delvin", "RDBMS", "C#","ORACLE"}
					
	};
	public static void main(String[] args) {
		for (String s: data[3]) {
			System.out.print(s + " ");
		}
	}
}
