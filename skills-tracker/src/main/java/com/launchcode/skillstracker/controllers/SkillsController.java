package com.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

  @GetMapping()
  @ResponseBody
  public String home() {
    return "<html>"
          + "<body>"
            + "<h1>Skills Tracker</h1>"
            + "<h2>Skills list: </h2>"
            + "<ol>"
              + "<li>Java</li>"
              + "<li>JavaScript</li>"
              + "<li>Python</li>"
            + "</ol>"
          + "</body>"
        + "</html>";
  }


  @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="formResponse")
  @ResponseBody
  public String formResponse(
      @RequestParam String name,
      @RequestParam String language1,
      @RequestParam String language2,
      @RequestParam String language3) {

              return "<html>"
                    + "<body>"
                    + "<h1>" + name + "</h1>"
                    +"<h2>List of favorite languages in order: </h2>"
                    + "<ol>"
                      + "<li>" + language1 + "</li>"
                      + "<li>" + language2 + "</li>"
                      + "<li>" + language3 + "</li>"
                    + "</ol>"
                    + "</body>"
                  + "</html>";

  }

  @GetMapping("form")
  @ResponseBody
  public String form() {
    return "<html>"
          + "<body>"
            + "<form action='formResponse' method='post'>"
              + "<input type='text' name='name' placeholder='Enter name'>"
              + "<br>"
              + "<p>Select Favorite Language"
              + "<select name='language1' style='display: block;'>"
                + "<optgroup label='First favorite language'>"
                  + "<option value='Java'>Java</option>"
                  + "<option value='JavaScript'>JavaScript</option>"
                  + "<option value='Python'>Python</option>"
                + "</optgroup>"
              + "</select>"
              + "<br>"
              + "<p>Select Second Favorite Language"
              + "<select name='language2' style='display: block;'>"
                + "<optgroup label='Second favorite language'>"
                  + "<option value='Java'>Java</option>"
                  + "<option value='JavaScript'>JavaScript</option>"
                  + "<option value='Python'>Python</option>"
                + "</optgroup>"
              + "</select>"
              + "<br>"
              + "<p>Select Third Favorite Language"
              + "<select name='language3' style='display: block;'>"
                + "<optgroup label='Third favorite language'>"
                  + "<option value='Java'>Java</option>"
                  + "<option value='JavaScript'>JavaScript</option>"
                  + "<option value='Python'>Python</option>"
                + "</optgroup>"
              + "</select>"
              + "<input type='submit' value='Submit'>"
            + "</form>"
          + "</body>"
        + "</html>";
  }

}
