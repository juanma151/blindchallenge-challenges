package challenges;

import static blch.framework.dsl.WireDsl.*;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

@Challenge(id = "0012", name = "Mirror mirror")
public class Challenge0012 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("GET"), v("person"), v("Eve"));
    expected(
        obj(
            "name", v("Eve"),
            "age", v(22),
            "email", v("eve@example.com")));
  }
}
