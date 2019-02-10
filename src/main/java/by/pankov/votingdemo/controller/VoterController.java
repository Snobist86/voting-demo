package by.pankov.votingdemo.controller;

import by.pankov.votingdemo.entity.Role;
import by.pankov.votingdemo.entity.Voter;
import by.pankov.votingdemo.service.VoterServiceImpl;
import by.pankov.votingdemo.service.VotingTopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(names = {"currentVoter", "topics"})
public class VoterController {

    @Autowired
    private VoterServiceImpl voterService;

    @Autowired
    private VotingTopicServiceImpl votingTopicService;

    @ModelAttribute("role")
    public Role setRole() {
        return Role.CLIENT;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPage(Model model, String email) {
        model.addAttribute("currentVoter", voterService.findByEmail(email));
        model.addAttribute("topics", votingTopicService.findAll());
        return "greeting";
    }

    @GetMapping("/registration")
    public String registrationPage() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationPage(Voter voter) {
        voterService.save(voter);
        return "demo";
    }
}