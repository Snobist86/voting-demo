package by.pankov.votingdemo.controller;

import by.pankov.votingdemo.entity.Activity;
import by.pankov.votingdemo.entity.Option;
import by.pankov.votingdemo.entity.VotingTopic;
import by.pankov.votingdemo.service.OptionServiceImpl;
import by.pankov.votingdemo.service.VotingTopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("currentVote")
public class VoteController {

    @Autowired
    private VotingTopicServiceImpl votingTopicService;

    @Autowired
    private OptionServiceImpl optionService;

    @ModelAttribute("activity")
    public Activity setActivity(){
        return Activity.ENABLE;
    }

    @GetMapping("/createVote")
    public String createTopicPage() {
        return "create-vote";
    }

    @PostMapping("/createTopicVote")
    public String createTopicPage(Model model, VotingTopic votingTopic) {
        VotingTopic topic = votingTopicService.save(votingTopic);
        model.addAttribute("currentVote", topic);
        return "create-option";
    }

    @PostMapping("/createOption")
    public String createOptionPage(Long id, String textOption) {
        optionService.save(new Option(textOption, 0, votingTopicService.findById(id)));
        return "create-option";
    }

    @GetMapping("/startVote")
    public String startVotePage(Model model, Long voting_topic) {
        VotingTopic votingTopic = votingTopicService.findById(voting_topic);
        model.addAttribute("vote", votingTopic);
        return "vote";
    }

    @GetMapping("/finalizeVote")
    public String finalizeTopicPage(Model model){
        model.addAttribute("topics", votingTopicService.findAll());
        return "finalize-vote";
    }

    @PostMapping("/finalizeVote")
    public String finalizeVotePage(Model model, Long voting_topic){
        VotingTopic votingTopic = votingTopicService.findById(voting_topic);
        votingTopic.setActivity(Activity.DISABLE);
        votingTopicService.save(votingTopic);
        model.addAttribute("topics", votingTopicService.findAll());
        return "greeting";
    }

    @GetMapping("/getResult")
    public String getResultVote(Model model, Long voting_topic){
        model.addAttribute("selected_vote", votingTopicService.findById(voting_topic));
        return "result-vote";
    }

    @PostMapping("/success")
    public String successPage(Long id) {
        Option option = optionService.findById(id);
        Integer value = option.getValue();
        option.setValue(value + 1);
        optionService.save(option);
        return "success";
    }

    @GetMapping("/finish")
    public String loginPage() {
        return "greeting";
    }
}
