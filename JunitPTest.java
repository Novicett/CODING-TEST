package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//test�� 

class JunitPTest {

	JunitP j = new JunitP();

	@Test
	void test() {
		String name[] = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
				{ "kon", "kain", "may", "coni" } };

		int k[] = { 19, 15, 6 };
		int answer[] = j.solution(name, yearning, photo);
		assertArrayEquals(k, answer);
	}

	@Test
	void �˾���() {
		String babbling[] = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };
		assertEquals(2, j.solution2(babbling));
	}

	@Test
	void ���ѻ�() {
		int number[] = { -2, 3, 0, 2, -5 };
		assertEquals(2, j.solution3(number));
	}

	@Test
	void ��������1�̵Ǵ��ڿ���ã��() {
		int n = 10;
		assertEquals(3, j.solution4(n));
	}

	@Test
	void �ݶ�() {
		int a = 2;
		int b = 1;
		int n = 20;
		assertEquals(19, j.solution5(a, b, n));
	}

	@Test
	void �����ѱݾװ���() {
		int price = 3;
		int money = 20;
		int count = 4;
		assertEquals(10, j.solution6(price, money, count));
	}

	@Test
	void ����() {
		int absolutes[] = { 4, 7, 12 };
		boolean signs[] = { true, false, true };
		assertEquals(9, j.solution7(absolutes, signs));
	}

	@Test
	void ����ǰ����͵���() {
		int left = 13;
		int right = 17;
		assertEquals(43, j.solution8(left, right));
	}

	@Test
	void �ּ����簢��() {
		int sizes[][] = { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };
		assertEquals(133, j.solution9(sizes));
	}

	@Test
	void �������ڽȾ�() {
		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };
		int answer[] = { 1, 3, 0, 1 };
		assertArrayEquals(answer, j.solution10(arr));
	}

	@Test
	void ���ڿ�() {
		String t = "3141592";
		String p = "271";
		assertEquals(2, j.solution11(t, p));
	}

	@Test
	void �ΰ��̾Ƽ����ϱ�() {
		int numbers[] = { 2, 1, 3, 4, 1 };
		int answer[] = { 2, 3, 4, 5, 6, 7 };
		assertArrayEquals(answer, j.solution12(numbers));
	}

	@Test
	void ��ɰ���() {
		int progresses[] = { 93, 30, 55 };
		int speeds[] = { 1, 30, 5 };
		int answer[] = { 2, 1 };
		assertArrayEquals(answer, j.solution13(progresses, speeds));
	}

	@Test
	void �����ڵ�() {
		String s = "110010101001";
		int answer[] = { 3, 8 };
		assertArrayEquals(answer, j.solution14(s));
	}

	@Test
	void ����() {
		String s = "banana";
		int answer[] = { -1, -1, -1, 2, 2, 2 };
		assertArrayEquals(answer, j.solution15(s));
	}

	@Test
	void ���¼���() {
		int numbers[] = { 1, 2, 3, 4, 6, 7, 8, 0 };
		assertEquals(14, j.solution16(numbers));
	}

	@Test
	void ����() {
		int n = 45;
		assertEquals(7, j.solution17(n));
	}

	@Test
	void ������ȣ() {
		String s = "a B z";
		int n = 4;
		assertEquals("e F d", j.solution18(s, n));
	}

	@Test
	void ��ĥ�ϱ�() {
		int n = 8;
		int m = 4;
		int section[] = { 2, 3, 6 };
		assertEquals(2, j.solution19(n, m, section));
	}

	@Test
	void ������() {
		int n = 5;
		int stages[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int answer[] = { 3, 4, 2, 1, 5 };
		assertArrayEquals(answer, j.solution20(n, stages));
	}

	@Test
	void �ζ�() {
		int lottos[] = { 0, 0, 0, 0, 0, 0 };
		int win_nums[] = { 38, 19, 20, 40, 15, 25 };
		int answer[] = { 1, 6 };
		assertArrayEquals(answer, j.solution21(lottos, win_nums));
	}

	@Test
	void k��°��() {
		int array[]= {1, 5, 2, 6, 3, 7, 4};
		int commands[][]= {{2,5,3},{4,4,1},{1,7,3}};
		int answer[]= {5,6,3};
		assertArrayEquals(answer, j.solution22(array, commands));
	}
	
	@Test
	void ��ȣ() {
		String s = "aukks";
		String skip="wbqd";
		int index = 5;
		
	}
	
	
	@Test
	void �輭��() {
		String seoul[]= {"Jane", "Kim"};
		assertEquals("�輭���� 1�� �ִ�", j.solution24(seoul));
	}
	
	
	@Test
	void ���ָ��Ѽ���() {
		String participant[]= {"marina", "josipa", "nikola", "vinko", "filipa"};
		String completion[]= {"josipa", "filipa", "marina", "nikola"};
		assertEquals("vinko", j.solution25(participant, completion));
	}
	
	@Test
	void īī�����Ͻ�() {
		int n=5;
		int arr1[]= {9, 20, 28, 18, 11};
		int arr2[]= {30, 1, 21, 17, 28};
		String answer[]= {"#####","# # #", "### #", "#  ##", "#####"};
		assertEquals(answer, j.solution26(n, arr1, arr2));
	}
	
	@Test
	void ����������() {
		long n =121;
		assertEquals(144, j.solution27(n));
	}
	
	@Test
	void �ִ񰪰��ּڰ�() {
		String s ="-1 -2 -3 -4";
		assertEquals("-4 -1",j.solution28(s));
	}
	
	@Test
	void �ּڰ�() {
		int A[]= {1,4,2};
		int B[]= {5,4,4};
		
		assertEquals(29,j.solution29(A, B));
	}
	
	@Test
	void ����¦��() {
		String X ="100";
		String Y = "2345";
		assertEquals("-1", j.solution30(X, Y));
	}
	
	@Test
	void �湮����() {
		String dirs="LULLLLLLU";
		assertEquals(7, j.solution31(dirs));
	}
	
	@Test
	void ����Ŭ�����͸�() {
		String str1= "AAbbaa_AAbb";
		String str2= "BBB";
		assertEquals(16384, j.solution32(str1, str2));
	}
	
	@Test
	void �������() {
		int fees[]= {180, 5000, 10, 600};
		String[] records= {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		int answer[]= {14600, 34400, 5000};
		assertEquals(answer, j.solution33(fees, records));
	}
	
	@Test
	void �Ҽ�() {
		int n =110011;
		int k =10;
		assertEquals(2, j.solution34(n, k));
	}
	
	@Test
	void īī������() {
		int numbers[]= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand="right";
		assertEquals("LRLLLRLLRRL", j.solution35(numbers, hand));
	}
	
	@Test
	void ��������() {
		int k =3;
		int score []= {10, 100, 20, 150, 1, 100, 200};
		int result[]= {10, 10, 10, 20, 20, 100, 100};
		assertArrayEquals(result,j.solution36(k, score));
	}
	
	@Test
	void ���ڿ�������() {
		String s= "aaabbaccccabba";
		assertEquals(3, j.solution37(s));
	}
	
	@Test
	void ī�并ġ() {
		String [] cards1 = {"i", "water", "drink"};
		String [] cards2 = {"want", "to"};
		String [] goal  = {"i", "want", "to", "drink", "water"};
		
		assertEquals("No", j.solution38(cards1, cards2, goal));	
	}
	
	@Test
	void �ܹ���() {
		int ingredient[] = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
		assertEquals(5, j.solution39(ingredient));
	}
	
	@Test
	void �Ѹ��Ǿ�ȣ() {
		String s ="zzzzzz";
		String skip = "abcdefghijklmnopqrstuvwxy";
		int index= 6;
		assertEquals("zzzzzz", j.solution40(s, skip, index));
	}
	
	
	@Test
	void īī���ܿ����Ͻ�() {
		int board[][]= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[]= {1,5,3,5,1,2,1,4};
		assertEquals(4, j.solution41(board, moves));
	
	}
	
	@Test
	void Ű����() {
		String keymap[]= {"AA"};
		String targets[]= {"B"};
		int answer[]= {9,4};
		assertArrayEquals(answer, j.solution42(keymap, targets));
	}
}
