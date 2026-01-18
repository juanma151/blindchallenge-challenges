package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0015", name = "Ghost protocol")
public class Challenge0015 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("GET"), v("person"), v("Alice"));
    expected(error("Not found"));
  }
}
