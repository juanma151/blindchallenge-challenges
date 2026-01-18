package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0019", name = "Cleanup crew")
public class Challenge0019 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("REMOVE"), v("person"), v("Bob"));
    expected(v(true));
  }
}
