package Test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class JunitP {
	// name 과 yearning 길이는 같다.
	// photo 길이는 따로
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int answer[] = new int[photo.length]; // photo 한 줄 체점 후 값 넣는 곳

		for (int i = 0; i < photo.length; i++) {
			int score = 0; // 한 줄 체점 후 초기화
			for (int j = 0; j < photo[i].length; j++) {
				for (int z = 0; z < name.length; z++) {
					if (name[z].equals(photo[i][j])) {
						score += yearning[z];
					}
				}
			}
			answer[i] = score; // 한 줄 체점 한 값 i번지에 넣음
		}
		return answer;
	}

	public int solution2(String[] babbling) {
		int answer = 0;

		for (int i = 0; i < babbling.length; i++) {
			if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo")
					|| babbling[i].contains("mama")) {
				continue;
			}
			babbling[i] = babbling[i].replace("aya", "");
			babbling[i] = babbling[i].replace("ye", "");
			babbling[i] = babbling[i].replace("woo", "");
			babbling[i] = babbling[i].replace("ma", "");
			if (babbling[i].length() == 0) {
				answer++;
			}

		}

//        
//        List<String> babytalk2 = new ArrayList<String>(); //babytalk -string 배열을 list로 옮길거임 
//        //babytalk  
//        
//        StringBuilder babytalk3 = new StringBuilder();
//        //babytalk +
//        for (int i = 0; i < babytalk.length; i++) {
//			babytalk3.append(babytalk[i]);
//		}
//        babytalk2.add(babytalk3.toString());
//        
//        List<String> babbling1 = new ArrayList<String>(); //babytalk -string 배열을 list로 옮길거임 
//        //babbling 담기
//        
//        for (int i = 0; i < babbling.length; i++) {
//			babbling1.add(babbling[i]);
//		}
//        
//        
//       for (int i = 0; i < babytalk.length; i++) {
//			if(babytalk.c(babbling1)) {
//				answer++;
//			}
//		}
		return answer;
	}

	public int solution3(int[] number) {
		int answer = 0;

		for (int i = 0; i < (number.length / 2) + 1; i++) {
			for (int j = i + 1; j < (number.length / 2) + 2; j++) {
				for (int j2 = j + 1; j2 < number.length; j2++) {
					if (number[i] + number[j] + number[j2] == 0) {
						answer++;

					}
				}
			}
		}

		return answer;

	}

	public int solution4(int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public int solution5(int a, int b, int n) {
		int answer = 0;
		while (n / a > 0) {
			answer = answer + (n / a) * b;
			n = (n / a) * b + n % a;
		}
		// 리팩토링
		return answer;
	}

	public long solution6(int price, int money, int count) {
		long answer = -1;
		long sum = 0; // 오버플로우 (리팩토링)
		for (int i = 1; i <= count; i++) {
			sum += (price * i);
		}
		answer = sum > money ? answer = sum - money : 0;

		return answer;
	}

	public int solution7(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < signs.length; i++) {
			answer += absolutes[i] * (signs[i] ? 1 : -1);
		}
		return answer; // 리팩토링
	}

	// 리팩토링
	// 제곱근이 된다는 것은 약수의 개수가 홀수개라는 것 이다.
	public int solution8(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			if (i % Math.sqrt(i) == 0) {
				answer -= i;
			} else {
				answer += i;
			}
		}
		return answer;
	}

	// 리팩토링
	public int solution9(int[][] sizes) {
		int max_v = 0;
		int min_v = 0;

		for (int i = 0; i < sizes.length; i++) {
			int max = Math.max(sizes[i][0], sizes[i][1]);
			int min = Math.min(sizes[i][0], sizes[i][1]);
			max_v = Math.max(max, max_v);
			min_v = Math.max(min, min_v);
		}
		int answer = max_v * min_v;
		return answer;
	}

	// Queue 문제 offer로 넣고 poll로 뺀다.
	public int[] solution10(int[] arr) {
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			q.offer(arr[i]);
		}

		List<Integer> a = new ArrayList<Integer>();
		a.add(q.poll());
		int index = 0;
		int k = q.size(); // queue 사이즈가 내맘대로 변해서 변수에 저장

		for (int i = 0; i < k; i++) {
			if (a.get(index) == q.peek()) {
				q.poll();
			} else {
				a.add(q.poll());
				index++;
			}
		}

		int answer[] = new int[a.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = a.get(i);
		}
		return answer;
	}

	public int solution11(String t, String p) {
		int answer = 0;
		String t2[] = t.split("");
		for (int i = 0; i < t2.length; i++) {
			String e = "";
			if (i == t2.length - p.length()) {
				break;
			}
			for (int j = 0; j < p.length(); j++) {
				e = e + t2[i + j];
			}

			if (Long.parseLong(e) <= Long.parseLong(p)) {
				answer++;
			}

		}

//		
//		String t3[] = p.split("");
//		
//		
//		
//		
//		
//		
//		StringBuilder a = new StringBuilder(); //용량부담될까봐 내가 만든거
//		StringBuilder b = new StringBuilder(); //용량부담될까봐 내가 만든거
//		for (int i = 0; i < p.length(); i++) {
//			b.append(t3[i]);
//		}
//		for (int i = 0; i < t2.length; i++) {
//			if(i==p.length()) {
//				break;
//			}
//			for (int j = 0; j < p.length(); j++) {
//				a.append(t2[i+j]);
//			}
//			
//			
//		}
//		System.out.println(a);
//		for (String string : t2) {
//			System.out.println(string);
//		}
		return answer;
	}

	public int[] solution12(int[] numbers) {
		Set<Integer> a = new HashSet<Integer>(); // 중복방지

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = 0;
				sum = numbers[i] + numbers[j];
				a.add(sum);
			}
		}
		Integer arr[] = a.toArray(new Integer[0]);
		int[] answer = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		Arrays.sort(answer);
		return answer;
	}

	public int[] solution13(int[] progresses, int[] speeds) {
		int[] answer = {};
		int works[] = new int[progresses.length];
		List a = new ArrayList<Integer>();

		for (int i = 0; i < works.length; i++) {
			works[i] = (100 - progresses[i]) / speeds[i];
			if ((100 - progresses[i]) % speeds[i] != 0) {
				works[i] = works[i] + 1;
			}
		}

		int count = 1;
		int pro = works[0];

		for (int i = 1; i < works.length; i++) {
			if (works[i] < pro) {
				count++;
			} else {
				a.add(count);
				count = 1;
				pro = works[i];
			}
		}
		a.add(count);
		answer = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			answer[i] = (int) a.get(i);
		}

		return answer;
	}

	public int[] solution14(String s) {

		int answer[] = new int[2];
		int cycle = 0; // 반복횟수
		int count = 0; // 0의개수

		while (!s.equals("1")) {
			cycle += 1;
			count += zerocount(s, "0");
			s = s.replace("0", "");
			s = Integer.toBinaryString(s.length());
		}
		answer[0] = cycle;
		answer[1] = count;
		return answer;
	}

	public int zerocount(String a, String c) {
		return a.length() - a.replace(c, "").length();
	}

	public int[] solution15(String s) {
		String a[] = new String[s.length()];
		String b[] = s.split(""); // banana
		int[] answer = new int[b.length];

		for (int i = 0; i < a.length; i++) {
			int index = 0;
			for (int j = 0; j < a.length; j++) {
				if (b[i].equals(a[j])) {
					a[i] = b[i];
					a[j] = " ";
					answer[i] = i - j;
					index = 0;
					break;
				} else {
					index++;
				}
			}
			if (index > 0) {
				answer[i] = -1;
				a[i] = b[i];
			}
		}

		return answer;
	}

	public int solution16(int[] numbers) {
		int sum = 45;
		for (int i = 0; i < numbers.length; i++) {
			sum -= numbers[i];
		}

		return sum;
	}

	public int solution17(int n) {
		// 45
		String a = "";
		while (n > 0) {
			a = a + (n % 3);
			n = n / 3;
		}

		String b[] = a.split("");
		double sum = 0;
		int index = b.length - 1;
		for (int i = 0; i < b.length; i++) {
			sum = sum + (Integer.parseInt(b[i]) * Math.pow(3, index));
			index--;
		}
		int answer = (int) sum;

		return answer;
	}

	public String solution18(String s, int n) {
		String answer = "";
		char a[] = s.toCharArray();

		for (int i = 0; i < a.length; i++) {
			int x = 0;
			if (Character.isLowerCase(a[i])) {
				x = (int) a[i] + n;
				if (x > 122) {
					int z = 96;
					x = x - 122;

					z = z + x;
					a[i] = (char) z;
				} else {
					a[i] = (char) x;
				}
			} else if (Character.isUpperCase(a[i])) {
				x = (int) a[i] + n;
				if (x > 90) {
					int z = 64;
					x = x - 90;
					z = z + x;
					a[i] = (char) z;
				} else {
					a[i] = (char) x;
				}
			}
		}
		for (char c : a) {
			answer = answer + c;
		}

		return answer;
	}

	public int solution19(int n, int m, int[] section) {
		int answer = 0;
		int index = 0;
		for (int i = 0; i < section.length; i++) {
			for (int j = index; j <= n; j++) {
				if (section[i] == j) {
					index = j + m;
					answer++;
					break;
				}
			}
			if (index > n) {
				break;
			}
		}

		return answer;
	}

	// 보류 푼거 아님
	public int[] solution20(int N, int[] stages) {
		HashMap<Integer, Double> a = new HashMap<Integer, Double>();
		for (int i : stages) {
			a.put(i, a.getOrDefault(i, (double) 0) + 1); // key값이 없는경우 디폴트
		}
		double whole = 0; // 전체
		int[] answer = new int[a.keySet().size()];
		for (Double i : a.values()) {
			whole = whole + i;
		}
		double b = 0;

		for (int i = 1; i <= answer.length + 1; i++) {

			b = a.get(i);
			a.put(i, (a.get(i) / whole));
			whole = whole - b;
		}

		System.out.println("hello");

		return answer;
	}

	public int[] solution21(int[] lottos, int[] win_nums) {
		int index = 0; // 나의 로또가 0인게 증가
		int index2 = 0; // 로또 용지랑 같은게 증가
		Arrays.sort(lottos);
		Arrays.sort(win_nums);

		for (int i = 0; i < win_nums.length; i++) {
			if (lottos[i] == 0) {
				index++;
				continue;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					index2++;
					break;
				}
			}
		}
		int[] answer = new int[2];
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
		int index3 = 6;
		for (int i = 1; i <= 6; i++) {
			rank.put(i, index3);
			index3--;
		}
		if (index + index2 <= 1) {
			answer[0] = 6;
		} else {
			answer[0] = rank.get(index + index2);
		}

		if (index2 <= 1) {
			answer[1] = 6;
		} else {
			answer[1] = rank.get(index2);

		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
//        System.out.println(index);

		return answer;
	}

	public int[] solution22(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int answer2[];
			for (int j = 0; j < 1; j++) {
				// answer2=new int[commands[i][j+1]-commands[i][j]+1];
				answer2 = Arrays.copyOfRange(array, commands[i][j] - 1, commands[i][j + 1]);

				Arrays.sort(answer2);

				answer[i] = answer2[commands[i][j + 2] - 1];

			}

		}

		return answer;
	}

	public String solution23(String s, String skip, int index) {
		String answer = "";
		return answer;
	}

	public String solution24(String[] seoul) {
		int x = 0;

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				x = i;
				break;
			}
		}
		String answer = "김서방은+" + x + "에 있다";

		return answer;
	}

	public String solution25(String[] participant, String[] completion) {
		String answer = "1";
		Arrays.sort(participant);
		Arrays.sort(completion);
		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));

		for (int i = 0; i < participant.length; i++) {
			if (completion.length == i) {
				break;
			}
			if (!(participant[i].equals(completion[i]))) {
				answer = participant[i];
				break;
			}

		}
		if (answer.equals("1")) {
			answer = participant[participant.length - 1];
		}
		return answer;
	}

	public String[] solution26(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[arr1.length];
		String arr3[] = new String[arr1.length];
		String arr4[] = new String[arr2.length];

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr1.length; i++) {
			while (arr1[i] / 2 > 0) {
				sb.append(arr1[i] % 2);
				// arr3[i]+=arr1[i]%2;
				arr1[i] = arr1[i] / 2;
			}
			sb.append(arr1[i] % 2);
			// sb.reverse();
			while (sb.length() < n) {
				sb.append("0");
			}
			sb.reverse();
			arr3[i] = String.valueOf(sb);
			sb.setLength(0);
			// arr3[i]+=arr1[i]%2;
		}

		for (int i = 0; i < arr2.length; i++) {
			while (arr2[i] / 2 > 0) {
				sb.append(arr2[i] % 2);
				// arr3[i]+=arr1[i]%2;
				arr2[i] = arr2[i] / 2;
			}
			sb.append(arr2[i] % 2);
			// sb.reverse();
			while (sb.length() < n) {
				sb.append("0");
			}
			sb.reverse();
			arr4[i] = String.valueOf(sb);
			sb.setLength(0);
			// arr3[i]+=arr1[i]%2;
		}

		for (int i = 0; i < arr3.length; i++) {
			char x[] = arr3[i].toCharArray();
			char y[] = arr4[i].toCharArray();
			for (int j = 0; j < arr4.length; j++) {
				if (x[j] == '1' || y[j] == '1') {
					sb.append("#");
				} else {
					sb.append(" ");
				}
				answer[i] = String.valueOf(sb);
			}
			sb.setLength(0);

		}

		return answer;
	}

	public long solution27(long n) {
		long answer = 0;
		double a = Math.sqrt(n);
		if (a % 1 > 0) {
			answer = -1;
		} else {
			a = a + 1;
			a = a * a;
			answer = (long) a;

		}
		return answer;
	}

	public String solution28(String s) {
//        String x = s.replace(" ","");
		// System.out.println(x);
		// char a[]=s.toCharArray();
		String a[] = s.split(" ");
//		for (char c : a) {
//			System.out.println(c);
//		}
//        System.out.println(a[1]);

		int min = Integer.parseInt(a[0]);
		int max = Integer.parseInt(a[0]);
		;
//        String z ="";
//        if(a[0].equals("-")) {
//        	z=a[0]+a[1];
//        	 min=Integer.parseInt(z);
//    		 max=Integer.parseInt(z); 	
//        }
//        else {
//        	 min=Integer.parseInt(a[0]);
//    		 max=Integer.parseInt(a[0]);
//        }
//        
//        
		for (int i = 1; i < a.length; i++) {

			if (min > Integer.parseInt(a[i])) {
				min = Integer.parseInt(a[i]);
			}
			if (max < Integer.parseInt(a[i])) {
				max = Integer.parseInt(a[i]);
			}
		}

//		System.out.println(min + " " + max);
		String b[] = new String[3];
		b[0] = String.valueOf(min);
		b[1] = String.valueOf(" ");
		b[2] = String.valueOf(max);
		String answer = "";
		for (int i = 0; i < b.length; i++) {
			answer += b[i];
		}

		return answer;
	}

	public int solution29(int[] A, int[] B) {
		int answer = 0;
		Collections.reverseOrder();
		for (int i = 0; i < A.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < B.length; j++) {
				if (A[i] * B[i] < min) {
					min = A[i] * B[j];
				}
			}
			answer += min;
		}
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

		return answer;
	}

	public String solution30(String X, String Y) {
		StringBuilder answer = new StringBuilder();
		int[] x = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] y = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < X.length(); i++) {
			x[X.charAt(i) - 48] += 1;
		}
		for (int i = 0; i < Y.length(); i++) {
			y[Y.charAt(i) - 48] += 1;
		}

		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < Math.min(x[i], y[i]); j++) {
				answer.append(i);
			}
		}
		if ("".equals(answer.toString())) {
			return "-1";
		} else if (answer.toString().charAt(0) == 48) {
			return "0";
		} else {
			return answer.toString();
		}
	}

	// 문제가 있는 코드 다시풀어볼 것
	public int solution31(String dirs) {
//		int arr[][] = new int[11][11];
//		int row = 5;
//		int colum = 5;

		char a[] = dirs.toCharArray();
		int answer = 0;
		Set set = new HashSet<String>();
		int x = 0; // 현재
		int y = 0;// 현재
		for (int i = 0; i < a.length; i++) {
			int nextX = x;
			int nextY = y;

			String road = "";
			switch (a[i]) {
			case 'U': {
				nextY++;
				road += x;
				road += y;
				road += nextX;
				road += nextY;
				break;
			}
			case 'L': {
				nextX--;
				road += x;
				road += y;
				road += nextX;
				road += nextY;
				break;
			}
			case 'R': {
				nextX++;
				road += x;
				road += y;
				road += nextX;
				road += nextY;
				break;
			}
			case 'D': {
				nextY--;
				road += x;
				road += y;
				road += nextX;
				road += nextY;
				break;
			}
			}
			if (nextX > 5 || nextX < -5 || nextY > 5 || nextY < -5) {
				continue;
			}
			set.add(road);
			x = nextX;
			y = nextY;
//			if (arr[colum][row] != 1) {
//				answer++;
//				arr[colum][row] = 1;
//			}

		}
//		for (int[] is : arr) {
//			System.out.print(Arrays.toString(is));
//			System.out.println();
//		}
		answer = set.size();
		return answer;
	}

	public int solution32(String str1, String str2) {
		int answer = 0;
		ArrayList<String> a = new ArrayList<String>(); // str1
		ArrayList<String> b = new ArrayList<String>(); // str2
		// System.out.println("E3DSD-".matches("^[A-Z]*$"));

		for (int i = 0; i < str1.length() - 1; i++) {
			if (str1.length() == i) {
				break;
			}

			if (!str1.substring(i, i + 2).toLowerCase().matches("^[a-z]*$"))
				continue;
			else {
				a.add(str1.substring(i, i + 2).toLowerCase());
			}
		}

		for (int i = 0; i < str2.length() - 1; i++) {
			if (str2.length() == i) {
				break;
			}

			if (!str2.substring(i, i + 2).toLowerCase().matches("^[a-z]*$"))
				continue;
			else {
				b.add(str2.substring(i, i + 2).toLowerCase());
			}
		}
		double m = 0; // 교집합 이자 분자
		double n = 0; // 합집합 이자 분모
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (a.get(i).equals(b.get(j))) {
					m++;
					b.set(j, "");
					break;
				}
			}
		}
		n = a.size() + b.size() - m;

		if (m == 0 && n == 0) {
			answer = 65536;
		} else {
			double ans = ((double) m / (double) n) * 65536;
			answer = (int) ans;

		}
		System.out.println(0 / 2);
		System.out.println(answer);

		// System.out.println(a);
		// System.out.println(b);
		return answer;

	}

	public int[] solution33(int[] fees, String[] records) {
		System.out.println(records.length);
		ArrayList<Boolean> check = new ArrayList<Boolean>();
		ArrayList<String> inout = new ArrayList<String>();

		for (int i = 0; i < records.length; i++) {
			if (records[i].contains("IN")) {

			}
		}

		int[] answer = {};
		return answer;
	}

	public int solution34(int n, int k) {
		int answer = 0, q, w;

		System.out.println(answer);
		StringBuilder a = new StringBuilder();
		while (n > 0) {
			a.append(n % k);
			n = n / k;
		}
		a.reverse();

		String b = String.valueOf(a);
		String c[] = b.split("");
		StringBuilder d = new StringBuilder();

		for (int i = 0; i < c.length; i++) {
			String change2 = "";
			int change = 0;
			if (!c[i].equals("0")) {
				d.append(c[i]);
			} else if (c[i].equals("0") || i == c.length - 1) {
				change2 = String.valueOf(d);
				d.setLength(0);
				change = Integer.parseInt(change2);
				for (int j = 2; j < change; j++) {
					if (change % j == 0) {
						break;
					} else {
						answer++;
					}
				}
			}

//			if(c[i].equals("2")||c[i].equals("3")||c[i].equals("5")||c[i].equals("7")) {
//				if(i==0) {
//					for (int j = 1; j < c.length; j++) {
//						if(c[j].equals("0")) {
//							answer++;
//							break;
//						}
//					}
//				}
//				
//				if(i>=1 && i<=c.length-2) {
//					
//					
//					
//					if(c[i+1].equals("0")) {
//						answer++;
//					}
//					else if(c[i+1].equals("0") && c[i-1].equals("0")) {
//						answer++;
//					}
//					else if(c[i-1].equals("0")) {
//						answer++;
//					}	
//					
//				}
//				
//				
//				
//			}
//			else {
//				continue;
//			}
		}

		System.out.println(answer);
		return answer;
	}

	public String solution35(int[] numbers, String hand) {
		String answer = "";
		int left = 10;
		int right = 12;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				left = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				right = numbers[i];
			} else {
				if (numbers[i] == 0) {
					numbers[i] = 11;
				}

				int leftlist = Math.abs(numbers[i] - left) / 3 + Math.abs(numbers[i] - left) % 3;
				int rightlist = Math.abs(numbers[i] - right) / 3 + Math.abs(numbers[i] - right) % 3;

				if (leftlist > rightlist) {
					answer += "R";
					right = numbers[i];
				} else if (leftlist < rightlist) {
					answer += "L";
					left = numbers[i];
				} else {
					if (hand.equals("left")) {
						answer += "L";
						left = numbers[i];
					} else if (hand.equals("right")) {
						answer += "R";
						right = numbers[i];
					}
				}
			}
		}

		return answer;
	}

	public int[] solution36(int k, int[] score) {
		PriorityQueue<Integer> name = new PriorityQueue<Integer>();
		name.add(30);
		name.add(1000);
		name.add(10);
		System.out.println(name);
		name.remove();
		System.out.println(name);

		int wins[] = new int[k]; // 명예의전당 명수
		for (int i = 0; i < wins.length; i++) {
			wins[i] = -1;
		}
		ArrayList<Integer> a = new ArrayList<Integer>();

		// 점수 배열이 더 크면 wins[j]에 넣는 방식
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < wins.length; j++) {
				if (wins[j] < score[i]) {
					wins[j] = score[i];
					break;
				}
			}

			// Arrays.sort를 활용하여 낮은 값을 맨 앞에
			Arrays.sort(wins);

			for (int j = 0; j < wins.length; j++) {
				if (wins[j] >= 0) {
					a.add(wins[j]);
					break;
				}
			}

		}

		int[] answer = new int[a.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = a.get(i);
		}

		return answer;
	}

	public int solution37(String s) {
		String sp[] = s.split(""); // 매게변수를 배열로 나눔
		Stack<String> st = new Stack<String>(); // 배열을 넣을거임

		int index = 0; // x인 원소
		int index2 = 0; // x가 아닌 원소
		List list = new ArrayList<String>(); // 문자열 나눈거를 여기에 넣음
		// 그리고 마지막에 전체 size()를 출력하면 될듯

		StringBuilder a = new StringBuilder();

		int size = 0; // 스택 size가 불안정해서 여기에 값을 넣을거임
		for (int i = 0; i < sp.length; i++) {
			if (st.isEmpty()) {
				st.push(sp[i]);
				index++;
				continue;
			}
			if (!st.get(0).equals(sp[i])) {
				st.push(sp[i]);
				index2++;
			} else {
				st.push(sp[i]);
				index++;
			}

			if (index == index2) {
				size = st.size();
				for (int j = 0; j < size; j++) {
					a.append(st.peek());
					st.pop();
				}
				list.add(a);
				a.setLength(0);
				st.clear();
				index = 0;
				index2 = 0;
			}

		}
		if (!st.isEmpty()) {
			list.add(st.peek());
		}
		int answer = list.size();
		return answer;
	}

	public String solution38(String[] cards1, String[] cards2, String[] goal) {

		Queue<String> a = new LinkedList<String>(Arrays.asList(cards1));
		Queue<String> b = new LinkedList<String>(Arrays.asList(cards2));
		String answer = "";
		int index = 0;
		// cards1 cards2를 큐로 변환
		// 이유 >? goal 첫번째에 a,b poll 없으면 no 반환
		for (int i = 0; i < goal.length; i++) {
			if (goal[i].equals(a.peek())) {
				index++;
				a.poll();
			} else if (goal[i].equals(b.peek())) {
				index++;
				b.poll();
			} else {
				answer = "No";
				break;
			}
		}
		if (index == goal.length) {
			answer = "Yes";
		}
		return answer;
	}

	public int solution39(int[] ingredient) {
		int answer = 0;
//		List<Integer> a =  Arrays.stream(ingredient)
//                .boxed()
//                .collect(Collectors.toList());
//		

		Stack<Integer> a = new Stack<Integer>();
		for (int i : ingredient) {
			a.push(i);

			if (a.size() >= 4) {
				if ((a.get(a.size() - 4) == 1) && (a.get(a.size() - 3) == 2) && (a.get(a.size() - 2) == 3)
						&& (a.get(a.size() - 1) == 1)) {
					answer++;
					a.pop();
					a.pop();
					a.pop();
					a.pop();

				}
			}

		}

		return answer;
	}

	public String solution40(String s, String skip, int index) {
//		 	String answer = "";
//	        char a[]=s.toCharArray(); // 문자열 s를 문자 배열로
//	        char b[]=skip.toCharArray(); // skip 문자열을 문자배열로
//	        // skip 문자는 건너뛰기
//	        // index 만큼 각 s문자는 건너뛴다.
//	        // a는 97 z는 122
//	       int index3=0; // while문을 멈추는역할
//	       
//	        while (a.length-1>index3) {
//	        	
//	        	for (int i = 0; i < a.length; i++) {
//	        		int index2=0;
//		        	
//	        		for (int j = 1; j <=index; j++) {
//						for (int j2 = 0; j2 < b.length; j2++) {
//							if((char)(a[i]+j)==b[j2]) {
//								index2++;
//							}
//						}
//					}
//	        		
//					if(((int)a[i]+index2+index<=122)){
//						a[i]=(char)(a[i]+index2+index);	
//					}
//					else {
//						a[i]=(char)(a[i]+index2+index-26);
//					}
//					index3++;
//				}	
//		        	
//			}
//	        answer=String.valueOf(a);
//	       
//	      오류코드 ㅠㅠ 구글보고 리팩토링  
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			for (int j = 0; j < index; j++) {
				a += 1;
				if (a > 'z') {
					a -= 26;
				}
				if (skip.contains(String.valueOf(a))) {
					j--;
				}
			}
			answer = answer + String.valueOf(a);
		}
		return answer;
	}

	public int solution41(int[][] board, int[] moves) {
		int answer = 0;
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		for (int i = 0; i < board.length; i++) {
//			a.add(0);
//		}
//		
//		a.set(0,a.get(0)+1);
//		
		Stack<Integer> st = new Stack<Integer>();
	
		
		for (int i : moves) {
			for (int j = 0; j <board[i-1].length; j++) {
				if(board[j][i-1]==0) {
					continue;
				}
				else {
					st.push(board[j][i-1]);
					board[j][i-1]=0;
					break;
				}
			}
			if(st.size()>1) {
				if(st.get(st.size()-1)==st.get(st.size()-2)) {
					answer+=2;
					st.pop();
					st.pop();
				}
			}
		}
		
//		for (int i = 1; i <= moves.length; i++) {
//		
//			st.push(board[moves[i-1]][0]);
//			a.set(i, a.get(i)+1);
//			
//		}
		return answer;
	}
	
	public int[] solution42(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> a = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				char b = keymap[i].charAt(j);
				if(a.containsKey(b)) {
					int index = a.get(b);
					a.put(b, Math.min(j+1, index));
				}
				else {
					a.put(b, j+1);
				}
			}
		}
        
        for (int i = 0; i < targets.length; i++) {
        	int sum=0;
        	for (int j = 0; j < targets[i].length(); j++) {
				char b = targets[i].charAt(j);
				if(a.containsKey(b)) {
	        		sum+=a.get(b);	
				}
				else {
					break;
				}
			}
        	answer[i]=sum;
		}
        
       if(answer[0]==0) {
    	   answer[0]=-1;
       }
        return answer;
    }

}
