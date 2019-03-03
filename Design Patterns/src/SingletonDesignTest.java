//1. Implement Singleton Design Pattern on a dummy class.
class Song{
    static Song currentTheme;
    String lyricst;
    String singer;
    
    private Song() {
        this.lyricst = lyricst;
        this.singer = singer;
    }
    
    static Song getInstance(){
        if(currentTheme == null)
            currentTheme = new Song();
        return currentTheme;
    }
    
}
public class SingletonDesignTest {
    public static void main(String[] args) {
        System.out.println(Song.getInstance());
        System.out.println(Song.getInstance());
    }
}
