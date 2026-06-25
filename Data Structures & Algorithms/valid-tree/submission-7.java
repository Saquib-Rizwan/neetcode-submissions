class Solution {

    List<Integer>[] graph;
    boolean[] visited;

    public boolean validTree(int n, int[][] edges) {

        if (edges.length != n - 1) {
            return false;
        }

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        if (!dfs(0, -1)) {
            return false;
        }

        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int node, int parent) {

        if (visited[node]) {
            return false;
        }

        visited[node] = true;

        for (int nei : graph[node]) {
            if (nei == parent) {
                continue;
            }

            if (!dfs(nei, node)) {
                return false;
            }
        }

        return true;
    }
}