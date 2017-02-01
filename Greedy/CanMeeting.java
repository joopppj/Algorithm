public class CanMeeting {
    // given an array of intervals, every interval includes a start time and an end time.  determing if a person can join all meetings. a person cannot join more than one meeting at the same time.
    public boolean canAttendMeetings(Interval[] intervals) {
        if(intervals==null)return false;
        Arrays.sort(intervals, new Comparator<Interval>(){                          // sort interval by start time
            public int compare(Interval a, Interval b){return a.start - b.start;}
            });
        
        for(int i=1; i<intervals.length;i++)                                // if any interval's end time is later than next interval's start time , it is impoosible for them to be joined at same time.
            if(intervals[i].start<intervals[i-1].end)return false;
        
        return true;
    }
}
