package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0001", name = "Hello darkness my old friend")
public class Challenge0001 extends ChallengeBase {

@Override
public void challenge() {
args(
v("COUNT")
);
expected(
error("Missing entity")
);
}
}
