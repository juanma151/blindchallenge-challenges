package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0016", name = "Numbers don’t lie")
public class Challenge0016 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("COUNT"), v("person"));
    expected(v(3));
  }
}
