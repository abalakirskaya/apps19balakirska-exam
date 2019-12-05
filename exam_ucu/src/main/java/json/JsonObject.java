package json;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private Map<String, Json> ourPairs;

    public JsonObject(JsonPair... jsonPairs) {
        // ToDo
        this.ourPairs = new HashMap<>();
        for(JsonPair el : jsonPairs){
            this.ourPairs.put(el.key, el.value);
        }
    }

//    public JsonObject(){
//    }


    @Override
    public String toJson() {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{");
        Iterator ourPairs = this.ourPairs.entrySet().iterator();
        while (ourPairs.hasNext()) {
            Map.Entry pair = (Map.Entry) ourPairs.next();
            jsonString.append("'");
            jsonString.append((String) pair.getKey());
            jsonString.append("': ");
            jsonString.append(((Json) pair.getValue()).toJson());
            if (ourPairs.hasNext()) {
                jsonString.append(", ");
            }
        }
        jsonString.append("}");
        return jsonString.toString();
    }

    public void add(JsonPair jsonPair) {
        // ToDo
        this.ourPairs.put(jsonPair.key, jsonPair.value);
    }

    public Json find(String name) {
        // ToDo
        if (this.ourPairs.get(name) != null){
            return this.ourPairs.get(name);
        }
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        JsonObject ourNewJsonObject = new JsonObject();
        for (String name : names) {
            Json value = this.find(name);
            if (value != null) {
                //System.out.println(value.toJson());
                ourNewJsonObject.add(new JsonPair(name, value));
            }
        }
        return ourNewJsonObject;
        //return null;
    }

}
