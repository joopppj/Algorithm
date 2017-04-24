public class AttendanceRecord {
    public boolean checkRecord(String s) {
        int L=0;
        int A=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                L++;
            }
            else if(s.charAt(i)=='A'){
                A++;
            }
        }
        if(L<=2||A<=1)return true;
        return false;
    }
}
