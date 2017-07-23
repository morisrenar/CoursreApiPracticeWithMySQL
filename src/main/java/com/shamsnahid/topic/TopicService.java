package com.shamsnahid.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/23/17.
 */
@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("java", "Java Core", "Basic Description"),
                new Topic("js", "Java Script Core", "Basic Java Script Description"),
                new Topic("ng", "Angular 2", "Basic Angular-2 Description")
        ));

    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();

        for(Topic tp : topicRepository.findAll()) {
            topics.add(tp);
        }
        return topics;
    }

    public Topic getTopic(String topicId) {
        return topicRepository.findOne(topicId);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String topicId) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String topicId) {
        topicRepository.delete(topicId);
    }
}
