package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0010", name = "Email me maybe")
public class Challenge0010 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("person"), v("Dave"), v("email"), v("dave@example.com"));
    expected(v(true));
  }
}
