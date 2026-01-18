package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0027", name = "Too clever by half")
public class Challenge0027 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("PUT"), v("person"), v("Frank"), v("age"), v("old"));
    expected(error("Invalid age"));
  }
}
