package pe.joedayz.tennis_player_web.model;

import java.util.Date;
import org.springframework.stereotype.Component;

/**
 * @author josediaz
 **/
@Component
public class Player
{
  private int id;
  private String name;
  private String nationality;
  private Date birthDate;
  private int titles;

  //constructor


  public Player() {
  }

  public Player(int id, String name, String nationality, Date birthDate, int titles) {
    this.id = id;
    this.name = name;
    this.nationality = nationality;
    this.birthDate = birthDate;
    this.titles = titles;
  }

  //getter methods


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public int getTitles() {
    return titles;
  }

  public void setTitles(int titles) {
    this.titles = titles;
  }
}