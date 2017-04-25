public class AttendanceRecord {
    // given a string that includes ALP which represents attend , late , participate . A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

//You need to return whether the student could be rewarded according to his attendance record.
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
