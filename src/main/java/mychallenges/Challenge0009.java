package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0009", name = "Invalid youth")
public class Challenge0009 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("person"), v("Charlie"), v("age"), v(-5));
    expected(error("Invalid age"));
  }
}
