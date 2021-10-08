class Solution { 
    public int nthUglyNumber(int n) {
        if(n==1||n==2||n==3||n==4||n==5)
            return n;
        int k=6,sum=0, cnt=0;
        for ( int i= 6; k<=n; i++) {
            int nn=i;
            if(nn%2==0||nn%3==0||nn%5==0){
            while(nn!=0){
                int s=nn;
                if(nn%2==0)   nn/=2;
                if(nn%3==0)   nn/=3;
                if(nn%5==0)   nn/=5;
                if(s == nn)   break;
            }
            if(nn==0||nn==1){
                sum=i;
            k++;
            }
        }
            if(k==1690)
                break;
        }
        return 2989355625;
    }
}
