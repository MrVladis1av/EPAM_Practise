package JDBCTask.util;

import java.util.ArrayList;
import java.util.List;

public class Out {
    public static void printEntities(List<?> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
