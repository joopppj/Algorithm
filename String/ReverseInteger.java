public classReverseInteger {
    //q: from leet code 
    public int reverse(int x) {
        if(x>=0){
        String a = x + "";
        StringBuilder A = new StringBuilder(a);
        A.reverse();
        a=A.toString();
        if (Long.parseLong(a)>Integer.MAX_VALUE) return 0;
        return Integer.parseInt(a);
        }
        else {
        String a = x + "";
        a=a.substring(1);
        StringBuilder A = new StringBuilder(a);
        A.reverse();
        a=A.toString();
        if (Long.parseLong(a)>Integer.MAX_VALUE) return 0;
        int z= Integer.parseInt(a);
        return 0-z;
        }
    }
}
