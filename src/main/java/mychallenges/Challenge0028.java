package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0028", name = "Size matters")
public class Challenge0028 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("SIZE"), v("person"));
    expected(v(3));
  }
}
