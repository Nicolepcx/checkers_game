package java_termpaper_ftoop;

class Test {
    private final List<Album> favs = new ArrayList<>();
for (
    private Album a : albums) {
        boolean hasFavorite = false;
        for (Track t : a.tracks) {
            if (t.rating >= 4) {
                hasFavorite = true;
                break;
            }
        }
        if (hasFavorite)
            favs.add(a);
    }
Collections.sort(favs, new Comparator<Album>() {
        public int compare(Album a1, Album a2) {
            return a1.name.compareTo(a2.name);
        }});
}
