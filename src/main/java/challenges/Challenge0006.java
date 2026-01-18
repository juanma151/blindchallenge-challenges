package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0006", name = "Counting stars")
public class Challenge0006 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("COUNT"), v("person"));
    expected(v(1));
  }
}
