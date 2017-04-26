public class AttendanceRecord {
    // given a string that includes ALP which represents attend , late , participate . A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

//You need to return whether the student could be rewarded according to his attendance record.
    public boolean checkRecord(String s) {
        return !s.contains("LLL") && (s.indexOf("A") == s.lastIndexOf("A"));
    }
    // just list two possible situations
}
