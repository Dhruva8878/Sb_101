package ass_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Map<String, String>  statesAndValues= new HashMap<>();

        statesAndValues.put("Madhya Pradesh","Bhopal");
        statesAndValues.put("Jharkhand","Ranchi");
        statesAndValues.put("Goa","Panaji");
        statesAndValues.put("Assam","Dispur");
        statesAndValues.put("Bihar","Patna");

        Set<Map.Entry<String, String>> keyVal= statesAndValues.entrySet();

        for(Map.Entry<String, String> val :keyVal){
            System.out.println(val.getKey()+" --> "+val.getValue());
        }


    }
}
