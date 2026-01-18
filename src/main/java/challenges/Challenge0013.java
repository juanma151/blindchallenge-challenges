package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0013", name = "Nobody home")
public class Challenge0013 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("GET"), v("person"), v("Mallory"));
    expected(error("Not found"));
  }
}
