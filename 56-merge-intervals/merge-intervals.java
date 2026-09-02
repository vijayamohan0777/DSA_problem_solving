class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        List<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(start);
                list.add(end);
                ans.add(list);

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(start);
        list.add(end);
        ans.add(list);

        int[][] arr = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            arr[i][0] = ans.get(i).get(0);
            arr[i][1] = ans.get(i).get(1);
        }

        return arr;
    }
}