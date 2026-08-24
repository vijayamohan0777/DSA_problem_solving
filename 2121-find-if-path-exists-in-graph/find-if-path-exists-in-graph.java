class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int j = 0; j < edges.length; j++) {
            int u = edges[j][0];
            int v = edges[j][1];

            list.get(u).add(v);
            list.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            ArrayList<Integer> l = list.get(q.poll());
            for (int i = 0; i < l.size(); i++) {
                if (!visited[l.get(i)]) {
                    q.offer(l.get(i));
                    visited[l.get(i)] = true;
                }
            }
        }
        return visited[destination];
    }
}
