package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0030", name = "The last one standing")
public class Challenge0030 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("SIZE"), v("person"));
    expected(v(2));
  }
}
