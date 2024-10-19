class Main {
  public static int exe1(int n) {

			//exercise 1

			if(n==1)

				return 1;

			return n+exe1(n-1);

		}
		
		public static double exe2(double n) {
			//exercise 2

			if(n==1)

				return 1;

			double a= n*exe2(n-1);

			return a;

		}

		public static int exe3(int n) {

			if (n==1)

				return 1;

			if(n%2!=0) {

				return n*exe3(n-1);

			}

			return exe3(n-1);

		}

		public static int exe4(int n) {

			if (n/10==0)

				return 1;

			n=n/10;

			return 1+exe4(n);

		}

		public static int exe5(int a,int b) {

			if(a<b)

				return 0;

			return 1+exe5(a-b,b);

		}

		public static int exe6(int a, int b) {

			if(a<b)

				return a;

			return exe6(a-b,b);

		}

		public static boolean exe7(int x, int y) {
			if(x==0)
				return true;
			if(x<y) {
				return false;
			}
			
			return exe7(x-y,y);
		}
		public static boolean exe8(int n,int p) {
			//p is the number before n
			if(p==1)
				return true;
			if(n%p==0)
				return false;
			return exe8(n,p-1);
			
		}
		public static boolean exe9(int n,int a) {
			//always in the start there is 0 in a
			//a:0 for start 1 for zogi 2 for e zogi 3 for both
			if(a==3) {
				return false;
			}
			else if(n==0) {
				return true;
			}
			else if(a==0 && (n%10)%2==0)
				a=1;
			else if(a==0)
				a=2;
			else if(a==1 && (n%10)%2!=0)
				a=3;
			else if(a==2 && (n%10)%2==0)
				a=3;
			return exe9(n/10,a);
		}
  public static void main(String[] args) {
      System.out.println(exe1(4));
			System.out.println(exe2(3));
			System.out.println(exe3(6));
			System.out.println(exe4(12345));
			System.out.println(exe5(60,10));
			System.out.println(exe6(20,12));
			System.out.println(exe7(20,4));
			System.out.println(exe8(13,12));
			System.out.println(exe9(28646,0));
  }
}
