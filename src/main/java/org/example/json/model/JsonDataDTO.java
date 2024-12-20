package org.example.json.model;

public class JsonDataDTO {
    private String id;
    private String url;

    public JsonDataDTO(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "IdUrl{id='" + id + "', url='" + url + "'}";
    }
}
