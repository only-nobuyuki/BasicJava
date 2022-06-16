package lesson13;
import java.io.BufferedReader;
import java.io.FileReader;

public class Sample {

	public static void main(String[] args) throws Exception {
		/*		//読み込み用file
				String forReading = "date.txt";
				//書き込み用file
				String forWriting = "sample.txt";

				//FileReaderを利用した読み込み用インスタンス
				FileReader forFileReader = new FileReader(forReading);
				//BufferedReaderを利用した読み込み用インスタンス
				FileReader forFileBufferedReader = new FileReader(forReading);


				BufferedReader br = new BufferedReader(forFileBufferedReader);

				System.out.println("FileReaderで読み込みんだ");
				int inFileReader;
				while ((inFileReader = forFileReader.read()) != -1) {
					System.out.println((char) inFileReader);
				}

				System.out.println("BufferedReaderで読み込みんだ");
				String inBufferedReader = null;
				while ((inBufferedReader = br.readLine()) != null) {
					System.out.println(inBufferedReader);
				}
				//FileWriterで書き込み
				FileWriter forFileWriter = new FileWriter(forWriting);

				//rBufferedWriterで書き込み
				FileWriter forBufferedWriter = new FileWriter(forWriting);
				BufferedWriter bw=new BufferedWriter(forFileWriter);

				Writer w=forFileWriter.append('A').append('B').append('C');
				forFileWriter.flush();
				for (int i = 60; i < 70; i++) {
					w.append((char)i);
				}
				w.write("writeメソッドで加筆");
				w.flush();

				bw.write("BufferedWriterメソッドで加筆");
				bw.flush();
				bw.newLine();
				bw.write("BufferedWriterメソッドで加筆");
				bw.flush();*/



		String str = "date.txt";
		FileReader stringRead = new FileReader(str);
		BufferedReader buff1 = new BufferedReader(stringRead);
		System.out.println(stringRead.read());
		System.out.println(buff1.readLine());

	}
}
