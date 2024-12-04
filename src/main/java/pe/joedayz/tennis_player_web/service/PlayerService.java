package pe.joedayz.tennis_player_web.service;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.joedayz.tennis_player_web.model.Player;

/**
 * @author josediaz
 **/
@Service
public class PlayerService {

  private List<Player> players = Arrays.asList(
      new Player(1, "Djokovic", "Serbia", Date.valueOf("1987-05-22"), 98),
      new Player(2, "Monfils", "France", Date.valueOf("1986-07-01"), 12),
      new Player(3, "Isner", "USA", Date.valueOf("1985-04-26"), 16)
  );

  public Player getPlayerByName(String name) {
    return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
  }
}
