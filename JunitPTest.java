package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//test단 

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
	void 옹알이() {
		String babbling[] = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };
		assertEquals(2, j.solution2(babbling));
	}

	@Test
	void 삼총사() {
		int number[] = { -2, 3, 0, 2, -5 };
		assertEquals(2, j.solution3(number));
	}

	@Test
	void 나머지가1이되는자연수찾기() {
		int n = 10;
		assertEquals(3, j.solution4(n));
	}

	@Test
	void 콜라() {
		int a = 2;
		int b = 1;
		int n = 20;
		assertEquals(19, j.solution5(a, b, n));
	}

	@Test
	void 부족한금액계산기() {
		int price = 3;
		int money = 20;
		int count = 4;
		assertEquals(10, j.solution6(price, money, count));
	}

	@Test
	void 음양() {
		int absolutes[] = { 4, 7, 12 };
		boolean signs[] = { true, false, true };
		assertEquals(9, j.solution7(absolutes, signs));
	}

	@Test
	void 약수의개수와덧셈() {
		int left = 13;
		int right = 17;
		assertEquals(43, j.solution8(left, right));
	}

	@Test
	void 최소직사각형() {
		int sizes[][] = { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };
		assertEquals(133, j.solution9(sizes));
	}

	@Test
	void 같은숫자싫어() {
		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };
		int answer[] = { 1, 3, 0, 1 };
		assertArrayEquals(answer, j.solution10(arr));
	}

	@Test
	void 문자열() {
		String t = "3141592";
		String p = "271";
		assertEquals(2, j.solution11(t, p));
	}

	@Test
	void 두개뽑아서더하기() {
		int numbers[] = { 2, 1, 3, 4, 1 };
		int answer[] = { 2, 3, 4, 5, 6, 7 };
		assertArrayEquals(answer, j.solution12(numbers));
	}

	@Test
	void 기능개발() {
		int progresses[] = { 93, 30, 55 };
		int speeds[] = { 1, 30, 5 };
		int answer[] = { 2, 1 };
		assertArrayEquals(answer, j.solution13(progresses, speeds));
	}

	@Test
	void 월간코드() {
		String s = "110010101001";
		int answer[] = { 3, 8 };
		assertArrayEquals(answer, j.solution14(s));
	}

	@Test
	void 글자() {
		String s = "banana";
		int answer[] = { -1, -1, -1, 2, 2, 2 };
		assertArrayEquals(answer, j.solution15(s));
	}

	@Test
	void 없는숫자() {
		int numbers[] = { 1, 2, 3, 4, 6, 7, 8, 0 };
		assertEquals(14, j.solution16(numbers));
	}

	@Test
	void 진법() {
		int n = 45;
		assertEquals(7, j.solution17(n));
	}

	@Test
	void 시저암호() {
		String s = "a B z";
		int n = 4;
		assertEquals("e F d", j.solution18(s, n));
	}

	@Test
	void 덧칠하기() {
		int n = 8;
		int m = 4;
		int section[] = { 2, 3, 6 };
		assertEquals(2, j.solution19(n, m, section));
	}

	@Test
	void 실패율() {
		int n = 5;
		int stages[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int answer[] = { 3, 4, 2, 1, 5 };
		assertArrayEquals(answer, j.solution20(n, stages));
	}

	@Test
	void 로또() {
		int lottos[] = { 0, 0, 0, 0, 0, 0 };
		int win_nums[] = { 38, 19, 20, 40, 15, 25 };
		int answer[] = { 1, 6 };
		assertArrayEquals(answer, j.solution21(lottos, win_nums));
	}

	@Test
	void k번째수() {
		int array[]= {1, 5, 2, 6, 3, 7, 4};
		int commands[][]= {{2,5,3},{4,4,1},{1,7,3}};
		int answer[]= {5,6,3};
		assertArrayEquals(answer, j.solution22(array, commands));
	}
	
	@Test
	void 암호() {
		String s = "aukks";
		String skip="wbqd";
		int index = 5;
		
	}
	
	
	@Test
	void 김서방() {
		String seoul[]= {"Jane", "Kim"};
		assertEquals("김서방은 1에 있다", j.solution24(seoul));
	}
	
	
	@Test
	void 완주못한선수() {
		String participant[]= {"marina", "josipa", "nikola", "vinko", "filipa"};
		String completion[]= {"josipa", "filipa", "marina", "nikola"};
		assertEquals("vinko", j.solution25(participant, completion));
	}
	
	@Test
	void 카카오인턴쉽() {
		int n=5;
		int arr1[]= {9, 20, 28, 18, 11};
		int arr2[]= {30, 1, 21, 17, 28};
		String answer[]= {"#####","# # #", "### #", "#  ##", "#####"};
		assertEquals(answer, j.solution26(n, arr1, arr2));
	}
	
	@Test
	void 정수제곱근() {
		long n =121;
		assertEquals(144, j.solution27(n));
	}
	
	@Test
	void 최댓값과최솟값() {
		String s ="-1 -2 -3 -4";
		assertEquals("-4 -1",j.solution28(s));
	}
	
	@Test
	void 최솟값() {
		int A[]= {1,4,2};
		int B[]= {5,4,4};
		
		assertEquals(29,j.solution29(A, B));
	}
	
	@Test
	void 숫자짝꿍() {
		String X ="100";
		String Y = "2345";
		assertEquals("-1", j.solution30(X, Y));
	}
	
	@Test
	void 방문길이() {
		String dirs="LULLLLLLU";
		assertEquals(7, j.solution31(dirs));
	}
	
	@Test
	void 뉴스클러스터링() {
		String str1= "AAbbaa_AAbb";
		String str2= "BBB";
		assertEquals(16384, j.solution32(str1, str2));
	}
	
	@Test
	void 주차요금() {
		int fees[]= {180, 5000, 10, 600};
		String[] records= {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		int answer[]= {14600, 34400, 5000};
		assertEquals(answer, j.solution33(fees, records));
	}
	
	@Test
	void 소수() {
		int n =110011;
		int k =10;
		assertEquals(2, j.solution34(n, k));
	}
	
	@Test
	void 카카오인턴() {
		int numbers[]= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand="right";
		assertEquals("LRLLLRLLRRL", j.solution35(numbers, hand));
	}
	
	@Test
	void 명예의전당() {
		int k =3;
		int score []= {10, 100, 20, 150, 1, 100, 200};
		int result[]= {10, 10, 10, 20, 20, 100, 100};
		assertArrayEquals(result,j.solution36(k, score));
	}
	
	@Test
	void 문자열나누기() {
		String s= "aaabbaccccabba";
		assertEquals(3, j.solution37(s));
	}
	
	@Test
	void 카드뭉치() {
		String [] cards1 = {"i", "water", "drink"};
		String [] cards2 = {"want", "to"};
		String [] goal  = {"i", "want", "to", "drink", "water"};
		
		assertEquals("No", j.solution38(cards1, cards2, goal));	
	}
	
	@Test
	void 햄버거() {
		int ingredient[] = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
		assertEquals(5, j.solution39(ingredient));
	}
	
	@Test
	void 둘만의암호() {
		String s ="zzzzzz";
		String skip = "abcdefghijklmnopqrstuvwxy";
		int index= 6;
		assertEquals("zzzzzz", j.solution40(s, skip, index));
	}
	
	
	@Test
	void 카카오겨울인턴쉽() {
		int board[][]= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[]= {1,5,3,5,1,2,1,4};
		assertEquals(4, j.solution41(board, moves));
	
	}
	
	@Test
	void 키보드() {
		String keymap[]= {"AA"};
		String targets[]= {"B"};
		int answer[]= {9,4};
		assertArrayEquals(answer, j.solution42(keymap, targets));
	}
}
