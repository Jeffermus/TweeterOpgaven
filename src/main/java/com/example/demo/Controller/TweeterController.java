package com.example.demo.Controller;

import com.example.demo.Models.TweeterFact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TweeterController {


    List<TweeterFact> listOfTweets = new ArrayList<>();
    //TweeterFact tweetObj = new TweeterFact("Hello World");

   //TweeterFact oneTweet = new TweeterFact("Text");
    @GetMapping("/")
    public String index(Model tweeterModel){
    tweeterModel.addAttribute("firstTweeterFact",listOfTweets);
    return "index";
    }

    @PostMapping("/postTweeterFact")
    public String postTweeterFact(WebRequest dataFromForm){
        TweeterFact tweeterFact = new TweeterFact(dataFromForm.getParameter("tweeterText"),"Jeffrey");
        listOfTweets.add(tweeterFact);
       // oneTweet = tweeterFact;
        return "redirect:/";
    }
}
