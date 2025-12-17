package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0021", name = "Final count")
public class Challenge0021 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("COUNT"),
                v("person")
        );
        expected(
                v(3)
        );
    }
}
