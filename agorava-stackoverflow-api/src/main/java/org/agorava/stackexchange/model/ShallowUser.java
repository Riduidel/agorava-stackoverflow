/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

/**
 * Modeled from https://api.stackexchange.com/docs/types/shallow-user
 * Noptice all fields from this class are optionnal (and as a consequence can be left null)
 * @author ndx
 */
public class ShallowUser {
    /**
     * may be absent
     */
  public int user_id;
  public String display_name;
  public int reputation;
  public UserType user_type;
  public String profile_image;
  public String link;
  public int accept_rate;
}
