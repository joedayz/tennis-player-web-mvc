package pe.joedayz.tennis_player_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.joedayz.tennis_player_web.model.Player;
import pe.joedayz.tennis_player_web.service.PlayerService;

/**
 * @author josediaz
 **/
@Controller

public class TennisPlayerController {

//  @RequestMapping(value = "/") // http://localhost:8080/
//  @ResponseBody
//  public String welcome() {
//    return "Welcome to Tennis Player Web Application";
//  }

  @Autowired
  PlayerService service;

  @RequestMapping(value = "/")
//	@ResponseBody
  public String welcome() {
    return "main-menu";
  }

  @RequestMapping(value = "/showPlayerForm")
  public String showForm () {
    return "search-player-form";
  }

//  @RequestMapping("/processPlayerForm")
//  public String processForm(HttpServletRequest request, Model model) {
//    String pName = request.getParameter("playerName");
//    Player player = service.getPlayerByName(pName);
//    model.addAttribute("name", pName);
//    model.addAttribute("country", player.getNationality());
//    model.addAttribute("dob", player.getBirthDate());
//    model.addAttribute("titles", player.getTitles());
//    return "player-detail";
//  }

  public String processForm(@RequestParam(value="playerName", defaultValue="Djokovic") String pName,
      Model model) {
    Player player = service.getPlayerByName(pName);
    String theName = pName.toUpperCase();
    model.addAttribute("name", theName);
    model.addAttribute("country", player.getNationality());
    model.addAttribute("dob", player.getBirthDate());
    model.addAttribute("titles", player.getTitles());
    return "player-detail";
  }
}

