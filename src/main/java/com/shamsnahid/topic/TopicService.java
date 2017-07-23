package com.shamsnahid.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/23/17.
 */
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("java", "Java Core", "Basic Description"),
                new Topic("js", "Java Script Core", "Basic Java Script Description"),
                new Topic("ng", "Angular 2", "Basic Angular-2 Description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String topicId) {
        for(Topic tp: topics) {
            if(tp.getTopicId().equals(topicId) == true) {
                return tp;
            }
        }
        return null;    //topics not found
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String topicId) {
        for(Integer index=0; index<topics.size(); index++) {
            if(topics.get(index).getTopicId().equals(topicId) == true) {
                topics.set(index, topic);
                return;
            }
        }
    }

    public void deleteTopic(String topicId) {
        for(int index=0; index<topics.size(); index++) {
            Topic tp = topics.get(index);
            if (tp.getTopicId().equals(topicId)) {
                topics.remove(index);
                return;
            }
        }
    }
}
