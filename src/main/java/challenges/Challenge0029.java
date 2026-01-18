package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0029", name = "Endgame")
public class Challenge0029 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("REMOVE"), v("person"), v("Eve"));
    expected(v(true));
  }
}
