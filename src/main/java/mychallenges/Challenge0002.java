package mychallenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0002", name = "Talk is cheap")
public class Challenge0002 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("COUNT"), v("person"));
    expected(v(0));
  }
}
