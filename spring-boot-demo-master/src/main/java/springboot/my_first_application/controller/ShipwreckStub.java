package springboot.my_first_application.controller;

import springboot.my_first_application.model.Shipwreck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipwreckStub {

    private static Map<Long, Shipwreck> wrecks = new HashMap<Long, Shipwreck>();
    private static Long idIndex = 4L;

    static {
        Shipwreck a = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
        wrecks.put(1L, a);
        Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
        wrecks.put(2L, b);
        Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
        wrecks.put(3L, c);
        Shipwreck d = new Shipwreck(4L, "Titanic", "The RMS Titanic was the world's largest passenger ship when it entered service, measuring 269 metres (882 feet) in length, and the largest man-made moving object on Earth. The largest passenger vessel is now Harmony of the Seas, at 362.12 metres.", "This is the latest accepted revision, reviewed on 2 May 2020. The wreck of the RMS Titanic lies at a depth of about 12,500 feet (3.8 km; 2.37 mi), about 370 miles (600 km) south-southeast off the coast of Newfoundland.", 12500, 43.32, 56.49, 1985);
        wrecks.put(4L, d);
    }

    public static List<Shipwreck> list() {
        return new ArrayList<Shipwreck>(wrecks.values());
    }

    public static Shipwreck create(Shipwreck wreck) {
        idIndex += idIndex;
        wreck.setId(idIndex);
        wrecks.put(idIndex, wreck);
        return wreck;
    }

    public static Shipwreck get(Long id) {
        return wrecks.get(id);
    }

    public static Shipwreck update(Long id, Shipwreck wreck) {
        wrecks.put(id, wreck);
        return wreck;
    }

    public static Shipwreck delete(Long id) {
        return wrecks.remove(id);
    }
}