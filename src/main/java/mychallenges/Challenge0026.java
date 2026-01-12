package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0026", name = "Empty words")
public class Challenge0026 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("person"), v(""));
    expected(error("Invalid name"));
  }
}
