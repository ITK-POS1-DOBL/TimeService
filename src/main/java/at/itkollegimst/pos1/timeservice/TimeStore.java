package at.itkollegimst.pos1.timeservice;

import java.io.Serializable;

public interface TimeStore
extends Serializable
{
  public void setTime(String time);

  public String getTime();
}