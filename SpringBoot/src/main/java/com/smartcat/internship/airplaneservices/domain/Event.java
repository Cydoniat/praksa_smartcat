package com.smartcat.internship.airplaneservices.domain;

public class Event {

    private Object key;
    private Object value;
    //We will have only one topic for now, but we need this if there are more
    private String topic;
    //To which partition is it assigned
    private Integer partition;

    public Event(Object key, Object value, String topic, Integer partition) {
        this.key = key;
        this.value = value;
        this.topic = topic;
        this.partition = partition;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }
}
