class Solution {

    public String destCity(List<List<String>> paths) {

        HashSet<String> starts = new HashSet<>();

        for (List<String> path : paths) {
            starts.add(path.get(0));
        }

        for (List<String> path : paths) {
            if (!starts.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return "";
    }
}
