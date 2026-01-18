package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0022", name = "Wrong universe")
public class Challenge0022 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("animal"), v("Dog"));
    expected(error("Unknown entity"));
  }
}
