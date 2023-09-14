class Solution {
    public String digitSum(String s, int k) {
        int n=0,sum=0;
StringBuilder ss=new StringBuilder(s);
StringBuilder sk=new StringBuilder();
while(ss.length()>k) {
	for (int i = 0; i <= ss.length() - 1; i++) {
		sum += ss.charAt(i) - '0';
		n++;
		if (n == k || i == ss.length() - 1) {
			sk.append(sum);
			n = 0;
			sum=0;
			if (i == ss.length() - 1) {
				ss = new StringBuilder(sk);
				sk = new StringBuilder();
			}
		}
	}
}
return String.valueOf(ss);
    }
}