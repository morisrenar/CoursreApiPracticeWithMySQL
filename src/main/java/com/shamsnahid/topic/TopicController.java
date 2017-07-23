package com.shamsnahid.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/23/17.
 */
@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}")
    public Topic getTopic(@PathVariable String topicId) {
        return topicService.getTopic(topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String topicId) {
        topicService.updateTopic(topic, topicId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}")
    public void deleteTopic(@PathVariable String topicId) {
        topicService.deleteTopic(topicId);
    }

}
