package com.constest.ContestAPI.controller;

import com.constest.ContestAPI.dto.UserAnswerDTO;
import com.constest.ContestAPI.entity.ContestEntity;
import com.constest.ContestAPI.entity.UserAnswerEntity;
import com.constest.ContestAPI.service.UserAnswerService;
import com.constest.ContestAPI.service.UserAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contest/")
public class UserAnswerController {

    @Autowired
    UserAnswerService userAnswerService;

    @RequestMapping(method = RequestMethod.POST, value = "save")
    public Boolean userAnswer(@RequestBody UserAnswerDTO userAnswerDTO) {
        Boolean userAnswerDTO1 = userAnswerService.save(userAnswerDTO);
        return userAnswerDTO1;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getAnswer/{userAnswerId}")
    public String getAnswer(@PathVariable String userAnswerId) {
        return (userAnswerService.getAnswer(userAnswerId));
    }


    @RequestMapping(method = RequestMethod.GET, value = "getAllAnswers/{userId}")
    public List<UserAnswerEntity> getAllAnswers(@PathVariable String userId) {
        return userAnswerService.getUserAllAnswers(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUserPoints/{userId}")
    public Integer getUserPoints(@PathVariable String userId) {
        return userAnswerService.getUserScore(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getFastestUser/{contestQuestionId}")
    public String getFastestUser(@PathVariable String contestQuestionId) {
        return userAnswerService.getFastestAnswer(contestQuestionId);
    }

    // @RequestMapping(method = RequestMethod.GET, value = "getUserContestPoints/{contestId}/{userId}")
    // public Integer getUserContestPoints(@PathVariable String contestId, @PathVariable String userId) {
    //     return userAnswerService.getUserContestPoints(contestId, userId);
    // }


}
