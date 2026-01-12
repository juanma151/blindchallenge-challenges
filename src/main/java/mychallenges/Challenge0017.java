package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0017", name = "Second chance")
public class Challenge0017 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("person"), v("Alice"), v("age"), v(28));
    expected(v(true));
  }
}
