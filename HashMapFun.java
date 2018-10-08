import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main (String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Take Me to Church", "Take me to church. I'll worship like a dog at the shrine of your lies");
        trackList.put("From Eden", "Honey you're familiar like my mirror years ago. Idealism sits prison, chivalry fell on its sword");
        trackList.put("Work Song", "When my time comes around, lay me gently in the cold dark earth");
        trackList.put("Cherry Wine", "The way she tells me I'm hers and she is mine. Open hand or closed fist would be fine");
        //
        System.out.println(trackList.get("Work Song"));
        Set<String> songNames = trackList.keySet();
        for (String name: songNames) {
            System.out.println(name + ": " + trackList.get(name));
        }
    }
}