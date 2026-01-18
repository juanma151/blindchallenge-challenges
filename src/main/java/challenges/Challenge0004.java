package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0004", name = "You shall not pass")
public class Challenge0004 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("person"), v("Alice"));
    expected(error("Already exists"));
  }
}
