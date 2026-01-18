package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0008", name = "Generation gap")
public class Challenge0008 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("GET"), v("person"), v("Bob"));
    expected(
        obj(
            "name", v("Bob"),
            "age", v(30)));
  }
}
