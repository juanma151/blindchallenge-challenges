package chtest;

//import mychallenges.*;
import static blch.framework.dsl.WireDsl.obj;
import static blch.framework.dsl.WireDsl.v;

import blch.framework.external.ChallengeBase;

//@Challenge(id = "0005", name = "Who are you?")
public class Challenge0005 extends ChallengeBase {

  @Override
  public void challenge() {
    args(v("GET"), v("person"), v("Alice"));
    expected(obj("name", v("Alice")));
  }
}
