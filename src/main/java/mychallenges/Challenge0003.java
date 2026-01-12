package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0003", name = "First contact")
public class Challenge0003 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("person"), v("Alice"));
    expected(v(true));
  }
}
