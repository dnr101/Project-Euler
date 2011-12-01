import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Euler {
	
	private int problem;
	private final int LAST_PROBLEM = 25;
	private long solution;
	private long start;
	private long stop;
	
	public Euler(){
		problem = 1;
		solution = 0;
	}
	
	public Euler(int theProb){
		problem = theProb;
		solution = 0;
	}
	
	public void setProblem(int theProb){
		problem = theProb;
	}
	
	public boolean isSolved(){
		if (solution != 0){
			return true;
		}
		return false;
	}
	
	public void solve(){
		if (!isSolved()){
			start = System.currentTimeMillis();
			try{
				switch (problem){
				case 1: 
					num1();
					break;
				case 2: 
					num2();
					break;
				case 3: 
					num3();
					break;
				case 4: 
					num4();
					break;
				case 5: 
					num5();
					break;
				case 6: 
					num6();
					break;
				case 7: 
					num7();
					break;
				case 8: 
					num8();
					break;
				case 9:
					num9();
					break;
				case 10:
					num10();
					break;
				case 11: 
					num11();
					break;
				case 12: 
					num12();
					break;
				case 13: 
					num13();
					break;
				case 14: 
					num14();
					break;
				case 15: 
					num15();
					break;
				case 16: 
					num16();
					break;
				case 17: 
					num17();
					break;
				case 18: 
					num18();
					break;
				case 19:
					num19();
					break;
				case 20:
					num20();
					break;
				case 21: 
					num21();
					break;
				case 22: 
					num22();
					break;
				case 23: 
					num23();
					break;
				case 24: 
					num24();
					break;
				case 25: 
					num25();
					break;
				}
			} catch (FileNotFoundException e){
				System.out.println(e);
			}
			stop = System.currentTimeMillis();
		}
	}
	


	public static long fib(int n){
		int x = 1, y = 1, z = 0;
		if (n == 0){
			return 0;
		}
		else if (n <= 2){
			return 1;
		}
		for (int i = 2; i < n; i++){
			z = x + y;
			x = y;
			y = z;
		}
		return z;
	}
	
	public static BigInteger fib (BigInteger n){
		if (n.longValue() == 0){
			return BigInteger.ZERO;
		} 
		else if (n.longValue() <= 2){
			return BigInteger.ONE;
		}
		BigInteger x = BigInteger.ONE;
		BigInteger y = BigInteger.ONE;
		BigInteger z = BigInteger.ZERO;
		for (int i = 2; i < n.longValue(); i++){
			z = x.add(y);
			x = y;
			y = z;
		}
		return z;
	}
	
	public static int aVal(String n){
		int sum = 0;
		for (int i = 0; i < n.length(); i++){
			sum += n.charAt(i) - 64;
		}
		return sum;	
	}

	public static int largeOrdered(int[] a){
		int result = a[0];
		for (int i = 0; i < a.length-1; i++){
			if (a[i] < a[i+1]){
				result = i;
			}
		}
		return result;
	}
	
	public static int largeLess(int[] a, int n){
		int result = -1;
		for (int i = 0; i < a.length; i++){
			if (n < a[i] && i > result){
				result = i;
			}
		}
		return result;
	}
	
	public static void revArr(int[] a, int n){
		int temp;
		for (int i = 0; i < (a.length - n)/2; i++){
			temp = a[i+n];
			a[i+n] = a[a.length-(i+1)];
			a[a.length-(i+1)] = temp;
		}
		return;
	}
	
	public static int greekType(int n){
		int d = diviSum(n);
		if (d > n) return 1;
		else if (d < n) return -1;
		return 0;
	}
	
	public static boolean amiNumMatch(ArrayList<int[]> a, int[] p){
		if (p[0] == p[1]) return false;
		for (int[] elt : a){
			if (elt[0] == p[0] && elt[1] == p[1]) return true;
		}
		return false;
	}
	
	public static long factorial(long x){
		if (x <= 1) return 1;
		return factorial(x-1) * x;
	}
	
	public static long choose(int n, int k){
		long result = 1, x;
		if (n-k < k)
			x = n-k;
		else
			x = k;
		for (int i = 1; i <= x; i++){
			result *= n - i + 1;
			result /= i;
		}
		return result;
	}
	
	public static int max(int x, int y){
		if (x > y) return x;
		return y;
	}
	
	public static String setWord(int digit){
		switch (digit){
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		}
		return "error";
	}
	
	public static String numberReader(int num){
		String result = "";
		int workingNum = num;
		int ones, tens, huns, thous;
		ones = workingNum % 10;
		workingNum = workingNum / 10;
		tens = workingNum % 10;
		workingNum = workingNum / 10;
		huns = workingNum % 10;
		thous = workingNum / 10;
		if (thous > 0){
			result += "onethousand";
		}
		if (huns > 0){
			result += setWord(huns) + "hundred";
		}
		if ((thous > 0 || huns > 0) && (tens > 0 || ones > 0)){
			result += "and";
		}
		if (tens > 1){
			switch (tens){
			case 2:
				result += "twenty";
				break;
			case 3:
				result +=  "thirty";
				break;
			case 4:
				result +=  "forty";
				break;
			case 5:
				result +=  "fifty";
				break;
			case 6:
				result +=  "sixty";
				break;
			case 7:
				result +=  "seventy";
				break;
			case 8:
				result +=  "eighty";
				break;
			case 9:
				result +=  "ninety";
				break;
			}
		}
		else if (tens == 1){
			switch (ones){
			case 0:
				result += "ten";
				break;
			case 1:
				result += "eleven";
				break;
			case 2:
				result += "twelve";
				break;
			case 3:
				result += "thirteen";
				break;
			case 4:
				result += "fourteen";
				break;
			case 5:
				result += "fifteen";
				break;
			case 6:
				result += "sixteen";
				break;
			case 7:
				result += "seventeen";
				break;
			case 8:
				result += "eighteen";
				break;
			case 9:
				result += "nineteen";
				break;
			}
		} 
		if (ones > 0 && tens != 1){
			result += setWord(ones);
			}
		return result;
		
	}
	
	public static int[] pythagTrip(int m, int n){
		int[] trip = new int[3];
		trip[0] = Math.abs((int)Math.pow(m, 2) - (int)Math.pow(n, 2));
		trip[1] = Math.abs(2 * m * n);
		trip[2] = Math.abs((int)Math.pow(m, 2) + (int)Math.pow(n, 2));
		return trip;
	}
	
	public static boolean isPrime(long x){
		if (x < 2){
			return false;
		}
		for (int i = 2; i < (int)Math.sqrt(x)+1; i++){
			if (x % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isLeap(int y){
		return (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0));
	}
	
	public static int diviSum(int n){
		int sum = 1;
		for (int i = 2; i < (n/2)+1; i++){
			if (n%i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static boolean isPalindrome(int n){
		ArrayList<Integer> num = new ArrayList<Integer>();
		while (n > 0){
			num.add(0, n%10);
			n /= 10;
		}
		for (int i = 0; i < num.size()/2; i++){
			if (num.get(i) != num.get((num.size()-1)-i)){
				return false;
			}
		}
		return true;
	}
	
	public void num1(){
		solution = 0;
		for (int i = 0; i < 1000; i++){
			if (i%3 == 0 || i%5 == 0){
				solution += i;
			}
		}
	}
	
	public void num2(){ 
		long f = 0;
		int i = 0;
		solution = 0;
		while (f < 4000000){
			f = fib(i);
			if (f % 2 == 0){
				solution += f;
			}
			i++;
		}
	}
	
	public void num3(){
		long x = 600851475143l;
//		long x = 13195l;
		ArrayList<Integer> pFactors = new ArrayList<Integer>();
		for (long i = 1l; i < Math.sqrt(x); i++){
			if (x%i == 0 && isPrime(i)){
				pFactors.add((int)i);
			}
		}
		solution = pFactors.get(pFactors.size()-1);
	}
	
	public void num4(){
		ArrayList<Integer> pals = new ArrayList<Integer>();
		for (int i = 100; i < 1000; i++){
			for (int j = 100; j < 1000; j++){
				if (isPalindrome(i * j)){
					pals.add(i*j);
				}
			}
		}
		solution = Collections.max(pals);
	}

	public void num10(){
		solution = 0;
		for (int i = 2; i < 2000000; i++){
			if (isPrime(i))
				solution += i;
		}
	}
	
	public void num15(){
		solution = choose(40, 20);
	}
	
	public void num17(){
		String result = ""; 
		for (int i = 1; i <= 1000; i++){
			result += numberReader(i);
		}
		solution = result.length();
	}
	
	public void num18(){
		int[][] triangle = {    {75},
								{95, 64},
								{17, 47, 82},
								{18, 35, 87, 10},
								{20, 4, 82, 47, 65},
								{19, 1, 23, 75, 3, 34},
								{88, 2, 77, 73, 7, 63, 67},
								{99, 65, 4, 28, 6, 16, 70, 92},
								{41, 41, 26, 56, 83, 40, 80, 70, 33},
								{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
								{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
								{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
								{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
								{63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
								{4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}};
		
		for (int i = 13; i >= 0; i--){
			for (int j = 0; j < i+1; j++){
				triangle[i][j] += max(triangle[i+1][j], triangle[i+1][j+1]);
			}
		}
		
		solution = triangle[0][0];
	}

	public void num19(){
		int countSun = 0, day = 0, month = 0, year = 1900;
		boolean first = true;
		int feb;
		while (year <= 2000){
			if (isLeap(year))
				feb = 29;
			else
				feb = 28;
			int [] monthLen = {31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (day == 6 && !first){
				countSun++;
			}
			day = (day + 7) % monthLen[month];
			if (day < 7){
				month = (month + 1) % 12;
				if (month == 0){
					year++;
					first = false;
				}
			}
			
		}
		solution = countSun;
	}
	
	public void num21(){
		int sum = 0;
		ArrayList<Integer> amiNums = new ArrayList<Integer>();
		ArrayList<int[]> diviSums = new ArrayList<int []>();
		amiNums.add(0);
		int i = 3;
		while (Collections.max(amiNums) < 10000){
			int[] elt = {i, diviSum(i)};
			diviSums.add(elt);
			int [] revElt = {elt[1], elt[0]}; 
			if (amiNumMatch(diviSums, revElt)){
				amiNums.add(elt[0]);
				amiNums.add(elt[1]);
			}
			i++;
		}
		while (Collections.max(amiNums) > 10000){
			amiNums.remove(amiNums.size()-1);
		}
		for (int j = 0; j < amiNums.size(); j++){
			sum += amiNums.get(j);
		}
		solution = sum;
	}
	
	public void num22() throws FileNotFoundException{
		Scanner names = new Scanner(new File ("names.txt"));
		names.useDelimiter(",");
		ArrayList<String> nameList = new ArrayList<String>();
		solution = 0; 
		while(names.hasNext()){
			String n = names.next();
			nameList.add(n.substring(1, n.length()-1));
		}
		Collections.sort(nameList);
		String ni;
		for (int i = 0; i < nameList.size(); i++){
			ni = nameList.get(i);
			solution += (aVal(ni) * (i+1));
		}
	}
	
	public void num23(){
		int addend;
		solution = 0;
		boolean flag;
		int[] all = new int[28123];
		for (int i = 0; i < 28123; i++){
			all[i] = i;
		}
		ArrayList<Integer> abNums = new ArrayList<Integer>();
		for (int i = 1; i < 28123; i++){	
			if (greekType(i) > 0){
				abNums.add(i);
			}
		}
		System.out.println();
		for (int j = 0; j < abNums.size(); j++){
			for (int k = 0; k < abNums.size(); k++){
				int x = abNums.get(j) + abNums.get(k);
				if (x < 28123){
					all[x] = 0;
				}
			}
		}
		for (int i = 0; i < 28123; i++){
			solution += all[i];
		}
	}
	
	public void num24(){
		int k, l, temp;
		solution = 0;
		String tempSol = "";
		int [] perm = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} ;
		for (int i = 0; i < 999999; i++){
			k = largeOrdered(perm);
			l = largeLess(perm, perm[k]);
			temp = perm[k];
			perm[k] = perm[l];
			perm[l] = temp;
			revArr(perm, k+1);
		}
		for (int j : perm) {
			tempSol += j;
		}
		solution = Long.parseLong(tempSol);
	}
	
	private void num25() {
		solution = 0;
		BigInteger fibNum = BigInteger.ZERO;
		int i = 0;
		while (fibNum.toString().length() < 1000){
			fibNum = fib(BigInteger.valueOf(++i));
		}
		solution = i;
	}

	private void num20() {
		// TODO Auto-generated method stub
		
	}

	private void num16() {
		// TODO Auto-generated method stub
		
	}

	private void num14() {
		// TODO Auto-generated method stub
		
	}

	private void num13() {
		// TODO Auto-generated method stub
		
	}

	private void num12() {
		// TODO Auto-generated method stub
		
	}

	private void num11() {
		// TODO Auto-generated method stub
		
	}

	private void num9() {
		int[] searchTrip = new int[3];
		for (int i = 0; i < 50; i++){
			for (int j = 0; j < 50; j++){
				if (i == j){
					continue;
				}
				searchTrip = pythagTrip(i, j);
				if (searchTrip[0]+searchTrip[1]+searchTrip[2] == 1000){
					solution = (searchTrip[0]*searchTrip[1]*searchTrip[2]);
				}
			}
		}
	}

	private void num8() {
		String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		ArrayList<Integer> prods = new ArrayList<Integer>();
		char[] slice;
		int prod;
		for (int i = 0; i < number.length()-5; i++){
			prod = 1;
			slice = (number.substring(i, i+5).toCharArray());
			for (char p : slice){
				prod *= Integer.parseInt("" + p);
			}
			prods.add(prod);
		}
		solution = Collections.max(prods);
		
	}

	private void num7() {
		System.out.println("working...");
		int pcount = 1;
		solution = 3;
		while (pcount < 10001){
			if (isPrime(solution)){
				pcount++;	
			}
			solution += 2;
		}
		solution -= 2;
		System.out.println(solution);
	}

	private void num6() {
		int sqSum = 0, sumsqs = 0;
		for (int i = 0; i <= 100; i++){
			sumsqs += (int)Math.pow(i, 2);
			sqSum += i;
		}
		sqSum = (int)Math.pow(sqSum, 2);
		solution = sqSum - sumsqs;
	}

	private void num5() {
		solution = 0;
		ArrayList<Integer> test = new ArrayList<Integer>(
				Arrays.asList(20, 19, 18, 17, 16, 13, 11));
		boolean found = false;
		while (!found){
			solution += 2520;
			for (int i : test){
				if (solution % i != 0){
					found = false;
					break;
				}
				else if(solution % i == 0 && i == 11){
					found = true;
				}
			}
		}
	}
	
	public String toString(){
		if (isSolved()){
			return "Project Euler Problem " + problem
			+ ".\nSolution: " + solution + "\nTime to solve: " 
			+ (stop - start) + " miliseconds.";
		} else {
			return "Project Euler Problem " + problem + " has not yet been solved.";
		}
		
	}
	
}
