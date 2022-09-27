import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class PlaceInput {
	public static void main(String[] args) {
	String place = null;

	Scanner sc = new Scanner(System.in);

	System.out.println("[대전지진옥외대피장소 개수 프로그램]");

	while(true) {
		System.out.println(" ");
		System.out.println("현재 살고 있는 지역을 입력해주세요(예: 동구, 서구, 유성구 등)");
		System.out.print(">>");
		place = sc.nextLine();

		Path path = Paths.get("/home/user/Downloads/part-r-00000.txt");

		if(place.equals("대덕구")) {
			try {
				List<String> allLines = Files.readAllLines(path);
				String nthLine = allLines.get(0);

				System.out.println(" ");
				System.out.println(nthLine + "개");
			} catch(IOException e) {
				e.printStackTrace();
			} break;
			} else if(place.equals("동구")) {
                        	try {
                                	List<String> allLines = Files.readAllLines(path);
                                	String nthLine = allLines.get(1);

					System.out.println(" ");
                                	System.out.println(nthLine + "개");
                        	} catch(IOException e) {
                                	e.printStackTrace();
                		} break;
                	} else if(place.equals("서구")) {
				try {
                        		List<String> allLines = Files.readAllLines(path);
                        		String nthLine = allLines.get(2);

					System.out.println(" ");
                        		System.out.println(nthLine + "개");
                		} catch(IOException e) {
                        		e.printStackTrace();
               			} break;
			} else if(place.equals("유성구")) {
				try {
                                	List<String> allLines = Files.readAllLines(path);
                                	String nthLine = allLines.get(3);

					System.out.println(" ");
                                	System.out.println(nthLine + "개");
                        	} catch(IOException e) {
                                	e.printStackTrace();
                		} break; 
			} else if(place.equals("중구")) {
                        	try {
                                	List<String> allLines = Files.readAllLines(path);
                                	String nthLine = allLines.get(4);

					System.out.println(" ");
                                	System.out.println(nthLine + "개");
                        	} catch(IOException e) {
                                	e.printStackTrace();
                		} break;
			} else {
				System.out.println(" ");
				System.out.println("*잘못된 지역입니다. 다시 입력해주세요.*");
			}	
		}
   	}
}
