class MyCalendar {
    private ArrayList<int[]> calendar;

    public MyCalendar() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] event : calendar) {
            int existingStart = event[0];
            int existingEnd = event[1];
            // Check if the new event overlaps with the existing event
            if (start < existingEnd && end > existingStart) {
                return false; // Overlap detected, booking not possible
            }
        }
        // If no overlap, add the new event
        calendar.add(new int[]{start, end});
        return true;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */