package domain;

import json.*;

/**
 * Created by Andrii_Rodionov on 1/5/2017.
 */
public class BasicStudent implements Jsonable {

    protected String name;
    protected String surname;
    protected Integer year;

    public BasicStudent() {
    }

    public BasicStudent(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public JsonObject toJsonObject() {
        // ToDo
        JsonObject ourStudent = new JsonObject();
        ourStudent.add(new JsonPair("name", new JsonString(this.name)));
        ourStudent.add(new JsonPair("surname", new JsonString(this.surname)));
        ourStudent.add(new JsonPair("age", new JsonNumber(this.year)));
        return ourStudent;
    }
}
