package test.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.ex02.Replacement;

public class ReplacementTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		 InputStreamReader is = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(is);
		 System.out.println("文字列を入力してください.");
		 String str;
		try {
			str = br.readLine();
			StringBuilder b = new StringBuilder();
			b.append('"');
			b.append('\\');
			b.append('a');
//			System.out.println(b + "が入力されました.");
//			System.out.println(str + "が入力されました.");
//			str = b.toString();
			Replacement.replace(str);
			System.out.println(str + "が入力されました.");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
