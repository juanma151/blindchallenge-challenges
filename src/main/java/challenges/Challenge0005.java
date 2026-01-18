package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0005", name = "Who are you?")
public class Challenge0005 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("GET"), v("person"), v("Alice"));
    expected(obj("name", v("Alice")));
  }
}
