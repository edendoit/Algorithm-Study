public class No1134 {
    public boolean isArmstrong(int n) {
        if(n==1)return true;
        int fakeNum = n, i, sqar=(int)(Math.log10(n)+1);
        int num=0;

        for(i=(int)((Math.log10(n))); i>=0; i--) {
            if(i==0) {
                n-=Math.pow(fakeNum%10, sqar);
            } else {
                num = fakeNum/(int)(Math.pow(10, i));
                n-=Math.pow(num, sqar);
                fakeNum %= (int)(Math.pow(10, i));
            }

        }


        return n==0;
    }
}
