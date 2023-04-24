package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("favorites")
public class SkillsController {
    @GetMapping
    public String main() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping
    public String favorites(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                "<body>" +
                "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</body>" +
                "</html>"
                ;
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='/favorites' method='post'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' id='name' name='name'><br>" +
                "<label for='first'>My favorite language:</label><br>" +
                "<select name='first' id='first'>" +
                "<option value='Java'>Java" +
                "<option value='Javascript'>JavaScript" +
                "<option value='Python'>Python" +
                "</select><br>" +
                "<label for='second'>My second favorite language:</label><br>" +
                "<select name='second' id='second'>" +
                "<option value='Java'>Java" +
                "<option value='Javascript'>JavaScript" +
                "<option value='Python'>Python" +
                "</select><br>" +
                "<label for='third'>My third favorite language:</label><br>" +
                "<select name='third' id='third'>" +
                "<option value='Java'>Java" +
                "<option value='Javascript'>JavaScript" +
                "<option value='Python'>Python" +
                "</select><br>" +
                "<input type='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
